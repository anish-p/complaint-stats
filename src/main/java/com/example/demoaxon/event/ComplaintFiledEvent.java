package com.example.demoaxon.event;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class ComplaintFiledEvent implements Serializable {

    private String id;
    private String message;
    private String company;

    public ComplaintFiledEvent(String id, String message, String company) {
        this.id = id;
        this.message = message;
        this.company = company;
    }

    public ComplaintFiledEvent() {
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getCompany() {
        return company;
    }
}
