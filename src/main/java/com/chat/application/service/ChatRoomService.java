package com.chat.application.service;

public interface ChatRoomService {

	Integer createChatRoom(String chatRoomName); 
	
	Boolean addUserIntoChat(String userName, Integer chatRoomId);
	
	Boolean createUser(String userName, String password);
	
	Boolean loginUser(String userName, String password);

	Boolean sendMessage(Integer chatRoomId, String message);
	
	Boolean deleteUser(String userName);
	
	String userSpecificChat(Integer chatRoomId);
	
	String getChatRoom();
	
	String getMessageChat(Integer chatRoomId);
	
	Boolean getChatRoom(Integer chatroomId);
}
