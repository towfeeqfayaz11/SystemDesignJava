package org.towfeeq.SOLIDPriciples.DIP.Problem;


/*
This notification service is tightly coupled with SMSService and EmailService.
adding a new notification service in system would require change in high level module as well,
since it is dependent on low level modules
*/

// NotificationService is a high level module
public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(EmailService emailService, SMSService smsService){
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void notifyByEmail(String email){
        emailService.sendEmail(email);
    }

    public void notifyBySMS(String sms){
        smsService.sendSMS(sms);
    }

}
