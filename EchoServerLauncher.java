import java.rmi.server.*;
import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java .net.MalformedURLException;

public class EchoServerLauncher{

	public static void main(String[] args){
	//	EchoServerLauncher esl = new EchoServerLauncher();
		launch();
		}

	private static void launch(){
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			LocateRegistry.createRegistry(1099);
			EchoServer server = new EchoServer();
			String registryHost = "//localhost/";
			String serviceName = "echo";
			Naming.rebind(registryHost + serviceName, server);
		} catch (MalformedURLException ex){
			ex.printStackTrace();
		} catch (RemoteException ex){
			ex.printStackTrace();
		}
	}
}