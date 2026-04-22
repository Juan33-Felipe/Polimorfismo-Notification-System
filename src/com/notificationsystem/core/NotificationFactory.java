package com.notificationsystem.core; 

import com.notificationsystem.models.*;
import com.notificationsystem.enums.NotificationStatus;

public class NotificationFactory {

    public static Notification createNotification(
        String type, String code, String recipient, String message, 
        String sentDate, NotificationStatus status, String detail1, String detail2) {
        
        if (type == null) return null;

        return switch (type.toUpperCase()) {
            case "GRADE" -> new GradePublicationNotification(code, recipient, message, sentDate, status, detail1, detail2);
            case "CANCELLATION" -> new ClassCancellationNotification(code, recipient, message, sentDate, status, detail1, detail2);
            case "TUITION" -> new TuitionPaymentReminder(code, recipient, message, sentDate, status, Double.parseDouble(detail1), detail2);
            case "EVENT" -> new EventRegistrationConfirmation(code, recipient, message, sentDate, status, detail1, detail2);
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }
}