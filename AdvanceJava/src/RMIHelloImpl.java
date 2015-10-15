import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIHelloImpl extends UnicastRemoteObject implements RMIHelloInterface {

	protected RMIHelloImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello(String name) throws RemoteException {
		// Some complex logic to give some output
		return "HELLO " + name;
	}
}
