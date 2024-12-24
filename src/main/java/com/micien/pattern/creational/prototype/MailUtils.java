package com.micien.pattern.creational.prototype;

import java.text.MessageFormat;

public class MailUtils{

    public void saveOriginalmails(Mail mail){
        System.out.println("save original mails" + ": "+ mail.getContent());
    }

    public void sendMails(Mail mail){
        String outputContent = "{0}Customer, email address{1}, email content{2}";
        System.out.println(MessageFormat.format(outputContent,mail.getName(), mail.getAddress(), mail.getContent()));
    }


}
