package ru.sbrf.coffeeshop;

enum Processes {
    AUTHORIZATION(1, "User is successfully authorized", "Authorisation ERROR"),
    PURCHASE (2, "The user has successfully made a purchase", "Purchase ERROR"),
    PAYMENT (3, "User made payment successfully", "Payment error"),
    FEEDBACK(4, "User has successfully left a review", "Feedback ERROR");

    int processId;
    String successMsg;
    String failMsg;

    Processes(int processId, String successMsg, String failMsg) {
        this.processId = processId;
        this.successMsg = successMsg;
        this.failMsg = failMsg;
    }
}
