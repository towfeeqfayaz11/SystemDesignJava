package org.towfeeq.SOLIDPriciples.DIP.Problem;

// SMSService is a low level module
public class SMSService {
    public void sendSMS(String message){
        System.out.println("Sending SMS: " + message);
    }
}
