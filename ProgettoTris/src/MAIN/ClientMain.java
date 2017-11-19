package MAIN;

import CONTROLLER.Client;
import VIEW.Finestra1;
import VIEW.Finestra2;

public class ClientMain {
	public static void main(String[] args) {
		Finestra1 f1=new Finestra1();
		Finestra2 f2=new Finestra2();
		f1.setVisible(true);
		f2.setVisible(false);
		Client c=new Client(f1, f2);
	}
}
