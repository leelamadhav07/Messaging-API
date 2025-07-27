package com.example.Spring_SmsSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Spring_SmsSender.model.SmsRequest;
import com.example.Spring_SmsSender.service.TwilioSmsService;

@RestController
@RequestMapping("/api/sms")
public class SmsController {

    @Autowired
    private TwilioSmsService service;

    @PostMapping("/send")
    public String sendSms(@RequestBody SmsRequest request) {
        service.sendSms(request.getTo_phn_no(), request.getMssg());
        return "Message Sent to " + request.getTo_phn_no();
    }
}
