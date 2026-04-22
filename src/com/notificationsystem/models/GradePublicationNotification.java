package com.notificationsystem.models;

import com.notificationsystem.core.Notification;
import com.notificationsystem.enums.NotificationStatus;

public class GradePublicationNotification extends Notification {
    private String subject;
    private String gradeType;

    public GradePublicationNotification() {
        super();
        this.subject = "";
        this.gradeType = "";
    }

    public GradePublicationNotification(String subject, String gradeType) {
        this.subject = subject;
        this.gradeType = gradeType;
    }


    public GradePublicationNotification(String code, String recipient, String message, String sentDate, NotificationStatus status, String subject, String gradeType) {
        super(code, recipient, message, sentDate, status); 
        this.subject = subject;
        this.gradeType = gradeType;
}
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getGradeType() { return gradeType; }
    public void setGradeType(String gradeType) { this.gradeType = gradeType; }

    @Override
    public String toString() {
        return "GradePublicationNotification[" + super.toString() +
               ", subject=" + subject + ", gradeType=" + gradeType + "]";
    }
}