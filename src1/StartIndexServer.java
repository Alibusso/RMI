

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

//Start Central Index Server

public class StartIndexServer {
	public static void main(String[] args) throws RemoteException, MalformedURLException {

		//Set the hostname for indexserver
		System.setProperty("java.rmi.server.hostname","127.0.0.1");
		
		//Create new instance of index server
		IndexServer indexserver = new IndexServer();

		//Bind new instance with indexsever address and port specified
		Naming.rebind("rmi://localhost:"+args[0]+"/peerserver",indexserver);

		System.out.println("Index Server is Ready! Peers may register.");

		

	}
	
}