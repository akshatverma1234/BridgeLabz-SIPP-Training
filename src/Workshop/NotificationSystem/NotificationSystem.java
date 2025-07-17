package Workshop.NotificationSystem;

import java.util.LinkedList;


interface Notification {
 void send();
}

class EmailNotification implements Notification {
 public void send() {
     System.out.println("Sending Email Notification...");
 }
}

class SMSNotification implements Notification {
 public void send() {
     System.out.println("Sending SMS Notification...");
 }
}

class PushNotification implements Notification {
 public void send() {
     System.out.println("Sending Push Notification...");
 }
}

class NotificationQueue {
 private LinkedList<Notification> queue = new LinkedList<>();

 public void add(Notification notification) {
     queue.add(notification);
 }

 public void sendAll() {
     while (!queue.isEmpty()) {
         Notification n = queue.poll();
         n.send();
     }
 }
}


public class NotificationSystem {
 public static void main(String[] args) {
     NotificationQueue queue = new NotificationQueue();

     queue.add(new EmailNotification());
     queue.add(new SMSNotification());
     queue.add(new PushNotification());
     queue.sendAll();
 }
}
