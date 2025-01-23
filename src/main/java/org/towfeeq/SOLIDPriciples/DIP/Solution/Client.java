package org.towfeeq.SOLIDPriciples.DIP.Solution;

public class Client {
    public static void main(String[] args) {
        NotificationService service = new NotificationService(new EmailService());

        service.notify("Your order has been shipped");

        NotificationService service2 = new NotificationService(new SMSService());
        service2.notify("Your OTP is 1241 for order");
    }
}
