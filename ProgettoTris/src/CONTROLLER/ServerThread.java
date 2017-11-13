package CONTROLLER;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread extends Thread {
	Socket client = null;
	String messaggio1;
	PrintWriter output;
	Scanner in;

	public ServerThread(Socket socket) {
		this.client = socket;
		try {
			output = new PrintWriter(client.getOutputStream(), true);
			in = new Scanner(client.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		/*while (true) {
			
		}*/
	}
}
