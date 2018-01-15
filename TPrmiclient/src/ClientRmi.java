
import java.rmi.Naming;


import service.IbanqueRemote;
public class ClientRmi {
	public static void main(String[] args){
		try {
			IbanqueRemote stub=(IbanqueRemote)Naming.lookup("rmi://localhost:1099/BK");
			System.out.println(stub.conversion(78));
			System.out.println(stub.getServerDate());
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
