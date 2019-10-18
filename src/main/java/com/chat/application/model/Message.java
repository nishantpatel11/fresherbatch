package com.chat.application.model;

public class Message {

	private Long messageId;
	private String message;

	public Message() {
		super();
	}

	public Message(Long messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}

	
	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", message=" + message + "]";
	}
	
	
	
}
