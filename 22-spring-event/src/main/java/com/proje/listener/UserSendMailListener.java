package com.proje.listener;

import com.proje.event.UserSendMailEvent;
import com.proje.model.User;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class UserSendMailListener implements ApplicationListener<UserSendMailEvent>{

	public void onApplicationEvent(UserSendMailEvent userSendEmail) {
		// TODO Auto-generated method stub
		User user=userSendEmail.getUser();
		System.out.println("Mail gönderilecek user bilgileri");
		System.out.println(user);
		System.out.println("Mail gönderilecek user bilgileri"+userSendEmail.getTitle());
		System.out.println("Mail gönderilecek user bilgileri"+userSendEmail.getContent());
	}

}
