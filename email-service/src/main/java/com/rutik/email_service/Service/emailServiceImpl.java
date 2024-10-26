package com.rutik.email_service.Service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class emailServiceImpl implements emailService{

	@Autowired
	JavaMailSender javaMailSender;
	@Override
	public void sentEmail(String to, String subject, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sentEmail(String[] to, String subject, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sentEmailWithHtml(String to, String subject, String htmlContent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sentEmail(String to, String subject, String message, File file) {
		// TODO Auto-generated method stub
		
	}

	
}
