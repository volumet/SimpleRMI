
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Mathematician extends UnicastRemoteObject implements MathService{

    public Mathematician() throws RemoteException{}

    @Override
    public double add(double x, double y) throws RemoteException {
        return x+y;
    }

    @Override
    public double subtract(double x, double y) throws RemoteException {
        return x-y;
    }
    
    
}
