package com.demo.server;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPRo {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket =  new ServerSocket(7777);
			Socket socket = serverSocket.accept();
			
			System.out.println("Connection Established");
			
			OutputStream outputStream = socket.getOutputStream();
			
			PrintStream printStream = new PrintStream(outputStream);
			
			String str1 = "Hello Client!!!";
			printStream.println(str1);
			
			printStream.println("Bye");
			
			printStream.close();
			serverSocket.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
