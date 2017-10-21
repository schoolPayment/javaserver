package com.brianphiri.grpc;

public class Payment {
    private String phoneNumner;
    private String studentNumber;
    private String amount;

    public Payment() {}

    public Payment(String phoneNumner, String studentNumber, String amount) {
        this.phoneNumner = phoneNumner;
        this.studentNumber = studentNumber;
        this.amount = amount;
    }

    public String getPhoneNumner() {
        return phoneNumner;
    }

    public void setPhoneNumner(String phoneNumner) {
        this.phoneNumner = phoneNumner;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
