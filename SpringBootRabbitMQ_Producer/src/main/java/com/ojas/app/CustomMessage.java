package com.ojas.app;

import java.util.Date;

public class CustomMessage {
	
	private String messageId;
	private String message;
	private Date messageDate;
	
	@Override
	public String toString() {
		return "CustomMessage [messageId=" + messageId + ", message=" + message + ", messageDate=" + messageDate + "]";
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getMessageDate() {
		return messageDate;
	}
	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}
	public CustomMessage(String messageId, String message, Date messageDate) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.messageDate = messageDate;
	}
	
	public CustomMessage() {
		
	}

}
