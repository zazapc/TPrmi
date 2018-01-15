package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface IbanqueRemote extends Remote{
	public double conversion(double mt)throws RemoteException;
	public Date getServerDate()throws RemoteException;

}
