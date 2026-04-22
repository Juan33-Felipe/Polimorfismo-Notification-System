package com.notificationsystem.core;

import com.notificationsystem.enums.NotificationStatus;

public abstract class Notification {
    private String code;
    private String recipient;
    private String message;
    private String sentDate;
    private NotificationStatus status; 

    public Notification() {
        this.code = "";
        this.recipient = "";
        this.message = "";
        this.sentDate = "";
        this.status = NotificationStatus.PENDING;
    }

    public Notification(String code, String recipient, String message, String sentDate, NotificationStatus status) {
        this.code = code;
        this.recipient = recipient;
        this.message = message;
        this.sentDate = sentDate;
        this.status = status;
    }

    
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getRecipient() { return recipient; }
    public void setRecipient(String recipient) { this.recipient = recipient; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getSentDate() { return sentDate; }
    public void setSentDate(String sentDate) { this.sentDate = sentDate; }

    public NotificationStatus getStatus() { return status; }
    public void setStatus(NotificationStatus status) { this.status = status; }

    @Override
    public String toString() {
        return "Notification [code=" + code + ", recipient=" + recipient +
               ", message=" + message + ", sentDate=" + sentDate + ", status=" + status + "]";
    }
}