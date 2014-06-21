package storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import naming.NamingServiceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StorageServiceImpl extends UnicastRemoteObject implements StorageService {
	private static final long serialVersionUID = -6903081093211340039L;
	private static final Logger logger = LogManager.getLogger(NamingServiceImpl.class);
	public StorageServiceImpl() throws RemoteException {
		super();
	}
	
}
