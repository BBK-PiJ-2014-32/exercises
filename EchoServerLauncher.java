import java.*;

public class EchoServerLauncher{

	public static void main(String[] args){
		EchoServerLauncher esl = new EchoServerLauncher();
		esl.launch();
		}

	private void launch(){
		if (System.getSecurityManager() == null){
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			LocateRegistry.createRegistry(7);
			EchoServer server = new EchoServer();
			String registryHost = "//localhost/";
			String serviceName = "echo";
			Naming.rebind(regsitryHost + serviceName, server);
		} catch (MalformedURLException ex){
			ex.printStackTarce();
		} catch (RemoteException ex){
			ex.printStackTarce();
		}
	}
}