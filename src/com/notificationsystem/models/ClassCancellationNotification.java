package com.notificationsystem.models;

import com.notificationsystem.core.Notification;
import com.notificationsystem.enums.NotificationStatus;

public class ClassCancellationNotification extends Notification {
    private String className;
    private String reason;

    public ClassCancellationNotification() {
        super();
        this.className = "";
        this.reason = "";
    }

    public ClassCancellationNotification(String className, String reason) {
        this.className = className;
        this.reason = reason;
    }

    public ClassCancellationNotification(String code, String recipient, String message, String sentDate, NotificationStatus status, String className, String reason) {
        super(code, recipient, message, sentDate, status);
        this.className = className;
        this.reason = reason;
    }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    @Override
    public String toString() {
        return "ClassCancellationNotification[" + super.toString() +
               ", className=" + className + ", reason=" + reason + "]";
    }
}
