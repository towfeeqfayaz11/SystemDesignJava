package org.towfeeq.SOLIDPriciples.DIP.Solution;

public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void notify(String msg){
        notificationChannel.send(msg);
    }
}
