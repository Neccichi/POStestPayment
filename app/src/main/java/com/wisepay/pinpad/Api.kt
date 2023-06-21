package com.wisepay.pinpad

class Api {
    // Native private method declaration
    private external fun nativeVersion(response: ByteArray, responseLength: Int)
    private external fun nativeSetDebug(verbose: Boolean)
    private external fun nativeOpen2(address: String, pinCode: String): Int
    private external fun nativeClose(): Int
    private external fun nativeShutdown(): Int
    private external fun nativeTxn(
        txnType: String,
        amount: Int,
        currency: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indexPayment: String,
        cashbackAmount: Int,
        authNum: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int

    private external fun nativeCancelTxn(
        voucherNum: String,
        amount: Int,
        currency: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int

    private external fun nativeCancelTxnByUID(
        UID: String,
        amount: Int,
        currency: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int

    private external fun nativeCancelTxnNoValidate(
        UID: String,
        voucherNum: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int

    private external fun nativeJ2(
        motoPanEntry: String,
        context: String
    ): Int

    private external fun nativeJ2Ex(
        motoPanEntry: String,
        amount: Int,
        currency: String,
        txnType: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indexPayment: String,
        cashbackAmount: Int,
        context: String,
        userData: String
    ): Int

    private external fun nativeJ5(
        amount: Int,
        currency: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indxPayment: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int

    private external fun nativeSettleJ5(
        authNum: String,
        amount: Int,
        currency: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int

    private external fun nativeCancelJ5(
        authNum: String,
        amount: Int,
        currency: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int

    private external fun nativeCheckBalance(
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int

    private external fun nativeDepositTxns(
        reportFormat: String,
        printVoucher: Boolean,
        context: String
    ): Int

    private external fun nativeDepositTxns2(
        reportFormat: String,
        printVoucher: Boolean,
        context: String
    ): Int

    private external fun nativeLastDeposit(
        reportFormat: String,
        printVoucher: Boolean,
        context: String
    ): Int

    private external fun nativeLastDeposit2(
        reportFormat: String,
        printVoucher: Boolean,
        context: String
    ): Int

    private external fun nativeLastTxnDetails(
        printVoucher: Boolean,
        context: String
    ): Int

    private external fun nativeReadCard(
        displayMsg: String,
        context: String
    ): Int

    private external fun nativeGetInfo(context: String): Int
    private external fun nativeIsResponseReady(msTimeout: Int): Int
    private external fun nativeGetResponse(response: ByteArray, responseLength: Int)
    private external fun nativeCancelOngoingTxn()
    private external fun nativePrintLine(
        line: String,
        fontSize: String,
        alignment: String,
        underline: Boolean,
        reverse: Boolean
    ): Int

    private external fun nativePrintParagraph(paragraphInJsonFormat: String): Int
    private external fun nativeFeedLine(numOfLines: Int): Int
    private external fun nativeMessageBox(
        header: String,
        message: String,
        icon: String,
        footerStyle: String,
        timeout: Int,
        context: String
    ): Int

    private external fun nativeSetLocale(locale: String): Int
    private external fun nativeQueryByppContext(
        ppContext: String,
        context: String
    ): Int

    private external fun nativeTxnStart(
        panEntryMode: String,
        amount: Int,
        currency: String,
        txnType: String,
        context: String
    ): Int

    private external fun nativeTxnStartEx(
        motoPanEntry: String,
        amount: Int,
        currency: String,
        txnType: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indexPayment: String,
        cashbackAmount: Int,
        context: String,
        userData: String
    ): Int

    private external fun nativeTxnEnd(
        pendingTxnId: String,
        txnType: String,
        amount: Int,
        currency: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indexPayment: String,
        cashbackAmount: Int,
        authNum: String,
        printVoucher: Boolean,
        userConfirm: Boolean,
        context: String,
        userData: String
    ): Int

    private external fun nativeCancelTwoPhasePendingTxn(pendingTxnId: String): Int
    fun Version(response: ByteArray, responseLength: Int) {
        nativeVersion(response, responseLength)
    }

    fun SetDebug(verbose: Boolean) {
        nativeSetDebug(verbose)
    }

    fun Open2(address: String, pinCode: String): Int {
        return nativeOpen2(address, pinCode)
    }

    fun Close(): Int {
        return nativeClose()
    }

    fun Shutdown(): Int {
        return nativeShutdown()
    }

    fun Txn(
        txnType: String,
        amount: Int,
        currency: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indexPayment: String,
        cashbackAmount: Int,
        authNum: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int {
        return nativeTxn(
            txnType, amount, currency, creditTerms, noPayments, firstPayment, notFirstPayment,
            creditNoPayments, indexPayment, cashbackAmount, authNum,
            motoPanEntry, printVoucher, context, userData
        )
    }

    fun CancelTxn(
        voucherNum: String,
        amount: Int,
        currency: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int {
        return nativeCancelTxn(
            voucherNum, amount, currency,
            motoPanEntry, printVoucher, context, userData
        )
    }

    fun CancelTxnByUID(
        UID: String,
        amount: Int,
        currency: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int {
        return nativeCancelTxnByUID(
            UID, amount, currency,
            motoPanEntry, printVoucher, context, userData
        )
    }

    fun J5(
        amount: Int,
        currency: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indxPayment: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int {
        return nativeJ5(
            amount, currency, creditTerms, noPayments, firstPayment, notFirstPayment,
            creditNoPayments, indxPayment,
            motoPanEntry, printVoucher, context, userData
        )
    }

    fun SettleJ5(
        authNum: String,
        amount: Int,
        currency: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int {
        return nativeSettleJ5(
            authNum, amount, currency,
            motoPanEntry, printVoucher, context, userData
        )
    }

    fun CancelJ5(
        authNum: String,
        amount: Int,
        currency: String,
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int {
        return nativeCancelJ5(
            authNum, amount, currency,
            motoPanEntry, printVoucher, context, userData
        )
    }

    fun CheckBalance(
        motoPanEntry: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int {
        return nativeCheckBalance(
            motoPanEntry, printVoucher,
            context, userData
        )
    }

    fun DepositTxns(
        reportFormat: String,
        printVoucher: Boolean,
        context: String
    ): Int {
        return nativeDepositTxns(reportFormat, printVoucher, context)
    }

    fun DepositTxns2(
        reportFormat: String,
        printVoucher: Boolean,
        context: String
    ): Int {
        return nativeDepositTxns2(reportFormat, printVoucher, context)
    }

    fun LastDeposit(
        reportFormat: String,
        printVoucher: Boolean,
        context: String
    ): Int {
        return nativeLastDeposit(reportFormat, printVoucher, context)
    }

    fun LastDeposit2(
        reportFormat: String,
        printVoucher: Boolean,
        context: String
    ): Int {
        return nativeLastDeposit2(reportFormat, printVoucher, context)
    }

    fun LastTxnDetails(printVoucher: Boolean, context: String): Int {
        return nativeLastTxnDetails(printVoucher, context)
    }

    fun ReadCard(displayMsg: String, context: String): Int {
        return nativeReadCard(displayMsg, context)
    }

    fun GetInfo(context: String): Int {
        return nativeGetInfo(context)
    }

    fun IsResponseReady(msTimeout: Int): Int {
        return nativeIsResponseReady(msTimeout)
    }

    fun GetResponse(response: ByteArray, responseLength: Int) {
        nativeGetResponse(response, responseLength)
    }

    fun CancelOngoingTxn() {
        nativeCancelOngoingTxn()
    }

    fun PrintLine(
        line: String,
        fontSize: String,
        alignment: String,
        underline: Boolean,
        reverse: Boolean
    ): Int {
        return nativePrintLine(line, fontSize, alignment, underline, reverse)
    }

    fun PringParagraph(paragraphInJsonFormat: String): Int {
        return nativePrintParagraph(paragraphInJsonFormat)
    }

    fun FeedLine(numOfLines: Int): Int {
        return nativeFeedLine(numOfLines)
    }

    fun MessageBox(
        header: String,
        message: String,
        icon: String,
        footerStyle: String,
        timeout: Int,
        context: String
    ): Int {
        return nativeMessageBox(header, message, icon, footerStyle, timeout, context)
    }

    fun J2(
        motoPanEntry: String,
        context: String
    ): Int {
        return nativeJ2(motoPanEntry, context)
    }

    fun J2Ex(
        motoPanEntry: String,
        amount: Int,
        currency: String,
        txnType: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indexPayment: String,
        cashbackAmount: Int,
        context: String,
        userData: String
    ): Int {
        return nativeJ2Ex(
            motoPanEntry, amount, currency, txnType, creditTerms, noPayments, firstPayment,
            notFirstPayment, creditNoPayments, indexPayment, cashbackAmount, context, userData
        )
    }

    fun CancelTxnNoValidate(
        UID: String,
        voucherNum: String,
        printVoucher: Boolean,
        context: String,
        userData: String
    ): Int {
        return nativeCancelTxnNoValidate(UID, voucherNum, printVoucher, context, userData)
    }

    fun SetLocale(locale: String): Int {
        return nativeSetLocale(locale)
    }

    fun QueryByppContext(ppContext: String, context: String): Int {
        return nativeQueryByppContext(ppContext, context)
    }

    fun TxnStart(
        panEntryMode: String,
        amount: Int,
        currency: String,
        txnType: String,
        context: String
    ): Int {
        return nativeTxnStart(panEntryMode, amount, currency, txnType, context)
    }

    fun TxnStartEx(
        motoPanEntry: String,
        amount: Int,
        currency: String,
        txnType: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indexPayment: String,
        cashbackAmount: Int,
        context: String,
        userData: String
    ): Int {
        return nativeTxnStartEx(
            motoPanEntry, amount, currency, txnType, creditTerms, noPayments,
            firstPayment, notFirstPayment, creditNoPayments,
            indexPayment, cashbackAmount, context, userData
        )
    }

    fun TxnEnd(
        pendingTxnId: String,
        txnType: String,
        amount: Int,
        currency: String,
        creditTerms: String,
        noPayments: Int,
        firstPayment: Int,
        notFirstPayment: Int,
        creditNoPayments: Int,
        indexPayment: String,
        cashbackAmount: Int,
        authNum: String,
        printVoucher: Boolean,
        userConfirm: Boolean,
        context: String,
        userData: String
    ): Int {
        return nativeTxnEnd(
            pendingTxnId,
            txnType,
            amount,
            currency,
            creditTerms,
            noPayments,
            firstPayment,
            notFirstPayment,
            creditNoPayments,
            indexPayment,
            cashbackAmount,
            authNum,
            printVoucher,
            userConfirm,
            context,
            userData
        )
    }

    fun CancelTwoPhasePendingTxn(pendingTxnId: String): Int {
        return nativeCancelTwoPhasePendingTxn(pendingTxnId)
    }

    companion object {
        // On Linux use: "WisepayPinPadDriver_jni" - no 'lib' prefix
        // On Windows use: "libWisepayPinPadDriver_jni"
        init {
            System.loadLibrary("WisepayPinPadDriver_jni")
        }
    }
}