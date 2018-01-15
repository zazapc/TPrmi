package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
	public static void main(String[] args){
		try {
			LocateRegistry.createRegistry(1099);
			BanqueServiceImpl od=new BanqueServiceImpl();
			System.out.println(od.toString());
			Naming.rebind("rmi://localhost:1099/BK", od);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}
