package com.example.Spring_SmsSender.service;

import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import jakarta.annotation.PostConstruct;

@Service
public class TwilioSmsService {
	@Value("${twilio.account.sid}")
	private String accountSid;
	
	@Value("${twilio.auth.token}")
	private String authToken;
	
	@Value("${twilio.phone.number}")
	private String fromNo;
	
	@PostConstruct
	public void init() {
		Twilio.init(accountSid,authToken);
	}
	
	public void sendSms(String to_phn_no,String mssg) {
		Message.creator(
				new PhoneNumber(to_phn_no),
				new PhoneNumber(fromNo),
				mssg
			).create();
	}
}
