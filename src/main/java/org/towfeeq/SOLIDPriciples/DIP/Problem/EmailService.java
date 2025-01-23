package org.towfeeq.SOLIDPriciples.DIP.Problem;

// EmailService is a low level module
public class EmailService {
    public void sendEmail(String message){
        System.out.println("Sending Email: " + message);
    }
}
