package com.sliit.smartlady.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	
	//Get private repo for following info
	private final String username = "sepiigrp005@gmail.com";
	private final String password = "sliitgrp@#*005%&";

	private Properties props = new Properties();
	
	//Pass value to rest service
	public Boolean SendTLSMail()
	{
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(props,
			  new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("sepiigrp005@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("sinthujan000@outlook.sg"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler,"
				+ "\n\n No spam to my email, please!");

			Transport.send(message);

			return true;

		} catch (MessagingException e) {
			return false;
			//throw new RuntimeException(e);
		}
	}

	
}
