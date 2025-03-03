package com.example.SpringLogger.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    private String message = "DemoBean is loaded!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
