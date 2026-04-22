package com.notificationsystem.models;

import com.notificationsystem.core.Notification;
import com.notificationsystem.enums.NotificationStatus;

public class EventRegistrationConfirmation extends Notification {
    private String eventName;
    private String eventDate;

    public EventRegistrationConfirmation() {
        super();
        this.eventName = "";
        this.eventDate = "";
    }

    public EventRegistrationConfirmation(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public EventRegistrationConfirmation(String code, String recipient, String message, String sentDate, NotificationStatus status, String eventName, String eventDate) {
        super(code, recipient, message, sentDate, status);
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }

    public String getEventDate() { return eventDate; }
    public void setEventDate(String eventDate) { this.eventDate = eventDate; }

    @Override
    public String toString() {
        return "EventRegistrationConfirmation[" + super.toString() +
               ", eventName=" + eventName + ", eventDate=" + eventDate + "]";
    }
}