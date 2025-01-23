package org.towfeeq.SOLIDPriciples.DIP.Solution;

public class SMSService implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
