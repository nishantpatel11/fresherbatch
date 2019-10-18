package com.chat.application;

import java.util.Scanner;

import com.chat.application.service.impl.ChatRoomServiceImpl;

public class ChatApplication {

	static Scanner scr = new Scanner(System.in);
	static ChatRoomServiceImpl chatRoomServiceImpl =  new ChatRoomServiceImpl();

	public static void main(String[] args) {


		String userName = "";
		String password = "";
		Integer chatroomId = 0;
		while(true) {
			System.out.println("Please check below List :: \n"
					+ "1. Create a new User \n"
					+ "2. Login with Crendential \n"
					+ "3. Create ChatRoom \n"
					+ "4. LogOut \n"
					+ "5. Delete an user \n"	
					+ "6. List of Chat Room \n\n"
					+ "Please select given choice \n"
					+ "");
			int ch = scr.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter a user name  .... ");
				userName = scr.next();
				System.out.println("Enter a password  .... ");
				password = scr.next();
				chatRoomServiceImpl.createUser(userName, password);
				break;
			case 2:
				System.out.println("Enter a login Credential ......");
				System.out.println("Enter a user name  .... ");
				userName = scr.next();
				System.out.println("Enter a password  .... ");
				password = scr.next();
				if(chatRoomServiceImpl.loginUser(userName, password))
					System.out.println("login successfully");
				else
					System.out.println("Invalid Credential");
				break;
			case 3: 
				System.out.println("Create a Chat Room......");
				System.out.println("Enter a chat room name  .... ");
				chatroomId = chatRoomServiceImpl.createChatRoom(scr.next());
				break;
			case 4: System.exit(0);
			case 5:
				System.out.println("Enter UserName for Deletion .... ");
				chatRoomServiceImpl.deleteUser(scr.next());
				break;

			case 6: 
				System.out.println("Please Pick Chat Room");
				String chatroom = chatRoomServiceImpl.getChatRoom();
				System.out.println(chatroom);
				int chatRoomId =scr.nextInt();	
				getChatRoom(chatroomId);
				break;
			default: System.out.println("Invalid Choice !! \n"
					+ "please pick right option");
			}
		}

	}

	static void getChatRoom(Integer chatRoomId) {
		
		while(true){
			try {


				System.out.println("Please pick any one option :: \n"
						+ "1. Add the User to ChatRoom  \n"
						+ "2. Send a Message \n"
						+ "3. Display the message from a specific chatroom \n"
						+ "4. List Down all users belonging to the specified chat room \n"
						+ "5. Exit from chatroom  \n"
						+ "Please select given choice \n"
						+ "");
				int ch = scr.nextInt();
				switch(ch) {		

				case 1:System.out.println("Enter a user name"); 
					if(chatRoomServiceImpl.addUserIntoChat(scr.next(), chatRoomId))
						System.out.println("Added Successfully");
					else
						System.out.println("Invalid Details");
					break;
				case 2:
					System.out.println("Enter a message, for sending ..");
					if(chatRoomServiceImpl.sendMessage(chatRoomId, scr.nextLine()))
						System.out.println("Message sent Successfully");
					else
						System.out.println("Message is not sent Successfully");
					break;
				case 3:
					String messages = chatRoomServiceImpl.getMessageChat(chatRoomId);
					System.out.println(messages);
					break;
				case 4:
					String users = chatRoomServiceImpl.userSpecificChat(chatRoomId); 
					System.out.println(users);
					break;
				case 5: return;
				default: System.out.println("Invalid Choice !! \n"
						+ "please pick right option");
				}

			
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}


}
