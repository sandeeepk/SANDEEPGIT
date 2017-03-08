package com.app.util;

import java.io.IOException;
import java.io.InputStream;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Component
public class CommonUtil {
	@Autowired
	private JavaMailSender mailsender;

	public void sendEmail(String toAddr, String subject, String text,
			final CommonsMultipartFile file) {
		try {
			MimeMessage message = mailsender.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(message,true);
			helper.setText(text);
			helper.setSubject(subject);
			helper.setTo(toAddr);
			if(file!=null){
				helper.addAttachment(file.getOriginalFilename(), new InputStreamSource() {
					
					@Override
					public InputStream getInputStream() throws IOException {
						// TODO Auto-generated method stub
						return file.getInputStream();
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}