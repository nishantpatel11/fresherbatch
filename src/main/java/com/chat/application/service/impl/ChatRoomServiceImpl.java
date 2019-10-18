package com.chat.application.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chat.application.model.ChatRoom;
import com.chat.application.model.Message;
import com.chat.application.model.User;
import com.chat.application.service.ChatRoomService;

public class ChatRoomServiceImpl implements ChatRoomService{


	public static Long 	numOfUsers = 0l;
	public static int 	numOfChatRoom = 0;
	public static Long 	numMessageId=0l;
	public static Map<Integer,ChatRoom> chatroomMap = new HashMap<Integer,ChatRoom>();
	public static Map<String,User> usersMap= new HashMap<String,User>();
	public static Map<String,List<Integer>> usersChatRootMap= new HashMap<String,List<Integer>>();



	@Override
	public Integer createChatRoom(String chatRoomName) {

		numOfChatRoom++;
		ChatRoom chatRoom = new ChatRoom(numOfChatRoom, chatRoomName, null, null);
		chatRoom.setChatroom(chatRoomName);
		if(!chatroomMap.containsKey(numOfChatRoom)) {
			chatroomMap.put(numOfChatRoom, chatRoom);
			return numOfChatRoom;	
		}
		return null;
	}


	

	@Override
	public Boolean addUserIntoChat(String userName,Integer chatRoomId) {

		if(usersMap.containsKey(userName)) {
			User user = usersMap.get(userName);
			if(chatroomMap.containsKey(chatRoomId)) {
				if(chatroomMap.get(chatRoomId).getUsers()!=null)
					chatroomMap.get(chatRoomId).getUsers().add(user);
				else {
					List<User> users =new ArrayList<User>();
					users.add(user);
					chatroomMap.get(chatRoomId).setUsers(users);
				}

				if(usersChatRootMap.containsKey(userName))
					usersChatRootMap.get(userName).add(chatRoomId);
				else {
					List<Integer> list = new ArrayList<Integer> ();
					list.add(chatRoomId);
					usersChatRootMap.put(userName, list);
				}

				return true;
			}else
				return false;

		}
		return false;
	}

	@Override
	public Boolean createUser(String userName, String password) {

		numOfUsers++;
		User user = new User(numOfUsers, userName, password);
		if(!usersMap.containsKey(userName)) {
			usersMap.put(userName,user);
			return true;
		}
		return false;
	}



	@Override
	public Boolean loginUser(String userName, String password) {

		return isCheck(userName, password);
	}

	@Override
	public Boolean sendMessage(Integer chatRoomId, String message) {

		if(chatroomMap.containsKey(chatRoomId)) {
			numMessageId++;
			chatroomMap.get(chatRoomId).getMessages().add(new Message(numMessageId, message));
			return true;	
		}

		return false;
	}

	@Override
	public Boolean deleteUser(String userName) {
		if(usersMap.containsKey(userName)) {
			User user = usersMap.remove(userName);
			deleteUserFromChat(userName);
			if(user != null)return true;
			else
				return false;
		}else
			return false;

	}

	private Boolean deleteUserFromChat(String userName) {

		if(usersMap.containsKey(userName)) {

			User user = usersMap.get(userName);
			if(usersChatRootMap.containsKey(userName)) {
				List<Integer> chatRoomIds = usersChatRootMap.get(userName); 
				if(!chatRoomIds.isEmpty())
					for(Integer chatroomId :chatRoomIds)
						if(chatroomMap.containsKey(chatroomId))
							chatroomMap.get(chatroomId).getUsers().remove(user);
			}
		}

		return false;

	}

	@Override
	public String userSpecificChat(Integer chatRoomId) {

		int index=1;
		List<User> users = getAllUserForSpecificChatRoom(chatRoomId);
		StringBuffer sb = new StringBuffer(""); 
		if(!users.isEmpty())
			for(User user : users) {
				sb.append(index+". "+user.getUserName()+" \n");
				index++;	
			}

		return new String(sb);
	}


	@Override
	public String getMessageChat(Integer chatRoomId) {

		int index=1;
		List<Message> messages = getAllMessageForSpecificChatRoom(chatRoomId);
		StringBuffer sb = new StringBuffer(""); 
		if(!messages.isEmpty())
			for(Message message : messages) {
				sb.append(index+". "+message.getMessage()+" \n");
				index++;	
			}

		return new String(sb);
	}

	private Boolean isCheck(String userName,String password) {

		if(usersMap.containsKey(userName)) {
			if(usersMap.get(userName).getPassword().equals(password))
				return true;
			else
				return false;
		}else {
			return false;
		}
	}




	@Override
	public String getChatRoom() {

		int index=1;
		StringBuffer sb = new StringBuffer(""); 
		if(!chatroomMap.isEmpty())
			for(Integer chatRoomId : chatroomMap.keySet()) {
				sb.append(index+". "+chatroomMap.get(chatRoomId).getChatroom()+" \n");
				index++;	
			}
		return sb.toString();
	}	


	private List<Message> getAllMessageForSpecificChatRoom(Integer chatRoomId) {

		if(chatroomMap.containsKey(chatRoomId)) 
			return chatroomMap.get(chatRoomId).getMessages();

		return new ArrayList<>();
	}



	private List<User> getAllUserForSpecificChatRoom(Integer chatRoomId) {

		if(chatroomMap.containsKey(chatRoomId)) 
			return chatroomMap.get(chatRoomId).getUsers();

		return new ArrayList<>();
	}

	@Override
	public Boolean getChatRoom(Integer chatroomId) {


		return null;
	}




}
