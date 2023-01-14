package com.ghassen.rent.car.entities;

public class EmailDetails {

    private String receiver;
    private String subject;
    private String body;
    private String attachement;

    public EmailDetails(){}
    public EmailDetails(String receiver, String subject, String body, String attachement) {
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
        this.attachement = attachement;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttachement() {
        return attachement;
    }

    public void setAttachement(String attachement) {
        this.attachement = attachement;
    }
}
