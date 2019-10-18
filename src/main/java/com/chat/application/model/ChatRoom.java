package com.chat.application.model;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	
	private Integer chatRoomId;
	private String chatroom;
	private List<User> users = new ArrayList<User>();
	private List<Message> messages = new ArrayList<Message>();
	
	public ChatRoom() {
		super();
	}
	
	public ChatRoom(Integer chatRoomId, String chatroom, List<User> users, List<Message> messages) {
		super();
		this.chatRoomId = chatRoomId;
		this.chatroom = chatroom;
		this.users = users;
		this.messages = messages;
	}

	public Integer getChatRoomId() {
		return chatRoomId;
	}

	public void setChatRoomId(Integer chatRoomId) {
		this.chatRoomId = chatRoomId;
	}

	public String getChatroom() {
		return chatroom;
	}

	public void setChatroom(String chatroom) {
		this.chatroom = chatroom;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "ChatRoom [chatRoomId=" + chatRoomId + ", chatroom=" + chatroom + ", users=" + users + ", messages="
				+ messages + "]";
	}
}
