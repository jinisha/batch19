import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIHelloClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		/*String url = "rmi://localhost/RMIDemo";
		RMIHelloInterface rhi = (RMIHelloInterface) Naming.lookup(url);
	*/
		Registry registry = LocateRegistry.getRegistry("localhost",225);
		RMIHelloInterface rhi = (RMIHelloInterface) registry.lookup("RMIDemo");
		System.out.println(rhi.sayHello("Jayram Rout"));
	}

}
