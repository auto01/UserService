package com.example.userservice.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailEventDto {
    private String to;
    private String subject;
    private String body;
}
