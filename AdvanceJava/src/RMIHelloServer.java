import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIHelloServer {

	public static void main(String[] args) throws Exception {
		RMIHelloImpl impl = new RMIHelloImpl();
		/*
		 * Naming.rebind("RMIDemo", impl);
		*/
		Registry registry = LocateRegistry.createRegistry(225);
		registry.rebind("RMIDemo", impl);
		System.out.println("Binding is done successfully...");
	}
	
}
