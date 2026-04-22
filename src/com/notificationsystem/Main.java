package com.notificationsystem; 

import java.util.Scanner;
import com.notificationsystem.core.Notification;
import com.notificationsystem.models.*;
import com.notificationsystem.enums.NotificationStatus;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("UNIVERSITY NOTIFICATION SYSTEM");
        System.out.println("1. Grade Publication Notification");
        System.out.println("2. Class Cancellation Notification");
        System.out.println("3. Tuition Payment Reminder");
        System.out.println("4. Event Registration Confirmation");
        System.out.print("Select an option: ");
        
        while (!sc.hasNextInt()) { 
            System.out.print("Please enter a number: ");
            sc.next();
        }
        option = sc.nextInt();
        sc.nextLine(); 

        Notification notification = null;

        switch (option) {
            case 1:
                System.out.println("\nGRADE PUBLICATION NOTIFICATION");
                System.out.print("Code: "); String codeG = sc.nextLine();
                System.out.print("Recipient: "); String recipientG = sc.nextLine();
                System.out.print("Message: "); String messageG = sc.nextLine();
                System.out.print("Sent Date: "); String sentDateG = sc.nextLine();
                System.out.print("Subject: "); String subjectG = sc.nextLine();
                System.out.print("Grade Type: "); String gradeTypeG = sc.nextLine();

                notification = new GradePublicationNotification(codeG, recipientG, messageG, sentDateG, NotificationStatus.SENT, subjectG, gradeTypeG);
                break;

            case 2:
                System.out.println("\nCLASS CANCELLATION NOTIFICATION");
                System.out.print("Code: "); String codeC = sc.nextLine();
                System.out.print("Recipient: "); String recipientC = sc.nextLine();
                System.out.print("Message: "); String messageC = sc.nextLine();
                System.out.print("Sent Date: "); String sentDateC = sc.nextLine();
                System.out.print("Class Name: "); String classNameC = sc.nextLine();
                System.out.print("Reason: "); String reasonC = sc.nextLine();

                notification = new ClassCancellationNotification(codeC, recipientC, messageC, sentDateC, NotificationStatus.SENT, classNameC, reasonC);
                break;

            case 3:
                System.out.println("\nTUITION PAYMENT REMINDER");
                System.out.print("Code: "); String codeT = sc.nextLine();
                System.out.print("Recipient: "); String recipientT = sc.nextLine();
                System.out.print("Message: "); String messageT = sc.nextLine();
                System.out.print("Sent Date: "); String sentDateT = sc.nextLine();
                System.out.print("Amount: "); double amountT = sc.nextDouble();
                sc.nextLine(); 
                System.out.print("Due Date: "); String dueDateT = sc.nextLine();

                notification = new TuitionPaymentReminder(codeT, recipientT, messageT, sentDateT, NotificationStatus.PENDING, amountT, dueDateT);
                break;

            case 4:
                System.out.println("\nEVENT REGISTRATION CONFIRMATION");
                System.out.print("Code: "); String codeE = sc.nextLine();
                System.out.print("Recipient: "); String recipientE = sc.nextLine();
                System.out.print("Message: "); String messageE = sc.nextLine();
                System.out.print("Sent Date: "); String sentDateE = sc.nextLine();
                System.out.print("Event Name: "); String eventNameE = sc.nextLine();
                System.out.print("Event Date: "); String eventDateE = sc.nextLine();

                notification = new EventRegistrationConfirmation(codeE, recipientE, messageE, sentDateE, NotificationStatus.SENT, eventNameE, eventDateE);
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }

        if (notification != null) {
            System.out.println("\nDATA ENTERED SUCCESSFULLY:");
            System.out.println(notification.toString());
        }

        sc.close();
        System.out.println("\nProcess completed.");
    }
}