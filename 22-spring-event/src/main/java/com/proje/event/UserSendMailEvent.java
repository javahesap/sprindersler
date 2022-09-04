package com.proje.event;

import com.proje.model.User;

import org.springframework.context.ApplicationEvent;

public class UserSendMailEvent extends ApplicationEvent {
	
	
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String content ;
	private User user ;

	public UserSendMailEvent(User user,String content,String title) {
		super(user);
		this.user=user;
		this.title=title;
		this.content=content;
		
		
		//TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
