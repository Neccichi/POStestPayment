package com.wisepay.pinpad

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private val jniApi = Api()
    private fun readReply(result: Int) {
        if (result == 0) {
            var ret = 0
            while (ret == 0) {
                ret = jniApi.isResponseReady(1000)
                if (ret > 0) {
                    break
                }
            }
            if (ret > 0) {
                val nativeResponse = ByteArray(ret)
                jniApi.getResponse(nativeResponse, ret)
                val response = String(nativeResponse, 0, ret - 1) // last byte is null termination
                Log.d(TAG, response)
            }
        }
    }
    private fun openAndCloseConnection() {
        val response = ByteArray(10)
        jniApi.version(response, 10)
        jniApi.setDebug(true)
        val result = jniApi.open2("192.168.14.136", "9954")
        Log.d(TAG, "Connection opened with result: $result")
        Toast.makeText(this, "Connection opened", Toast.LENGTH_SHORT).show()

        jniApi.close()
        Log.d(TAG, "Connection closed")
        Toast.makeText(this, "Connection closed", Toast.LENGTH_SHORT).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonTxnWithPayments = findViewById<TextView>(R.id.testconnect)
        openAndCloseConnection()
        buttonTxnWithPayments.setOnClickListener {
            val paymentResult = jniApi.(
                "TRANSACTION_TYPE_PAYMENT", 1000, "ILS", "CREDIT_TERMS_REGULAR", 0, 0, 0, 0,
                null,0, null,null,true, "sale", null
            )
            readReply(paymentResult)
            Log.d(TAG, "Payment transaction initiated with result: $paymentResult")
        }
    }
}
