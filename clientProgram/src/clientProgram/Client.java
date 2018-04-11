package clientProgram;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",7777);
			
			InputStream inputStream = socket.getInputStream();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
			String messageFromServer;
			while ((messageFromServer = bufferedReader.readLine()) !=null){
				System.out.println("Message From Server :: "+messageFromServer);
			}
			bufferedReader.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
