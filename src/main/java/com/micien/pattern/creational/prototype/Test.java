package com.micien.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Mail ori_mail = new Mail();
        ori_mail.setContent("Original Mail!!!");
        MailUtils utils = new MailUtils();

        for(int i = 0; i <5; i++){
            Mail temp_mail = (Mail) ori_mail.clone();
            temp_mail.setName(String.valueOf(i));
            temp_mail.setAddress(String.valueOf(i) + "@.com");
            temp_mail.setContent("surprised");
            utils.sendMails(temp_mail);
        }

        utils.saveOriginalmails(ori_mail);
    }
}
