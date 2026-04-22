package com.notificationsystem.models;

import com.notificationsystem.core.Notification;
import com.notificationsystem.enums.NotificationStatus;

public class TuitionPaymentReminder extends Notification {
    private double amount;
    private String dueDate;

    public TuitionPaymentReminder() {
        super();
        this.amount = 0.0;
        this.dueDate = "";
    }

    public TuitionPaymentReminder(double amount, String dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public TuitionPaymentReminder(String code, String recipient, String message, String sentDate, NotificationStatus status, double amount, String dueDate) {
        super(code, recipient, message, sentDate, status);
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getDueDate() { return dueDate; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    @Override
    public String toString() {
        return "TuitionPaymentReminder[" + super.toString() +
               ", amount=" + amount + ", dueDate=" + dueDate + "]";
    }
}