package com.proje.publisher;

import com.proje.event.UserSendMailEvent;
import com.proje.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
@Component
public class UserSendMailPublisher {
	@Autowired
private ApplicationEventPublisher applicationEventPublisher;
	
	
	public void userRegisterMessage() {
		
		String title="kayıt onay mesajı";
		String content="Kaydunuz tta";
		User user=new User("besir@mai.com","123k","beşir","atydeöir");
		
		UserSendMailEvent event =new UserSendMailEvent(user, title, content);
		
		
		this.applicationEventPublisher.publishEvent(event);
	}
	
}
