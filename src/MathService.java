
import java.rmi.Remote;
import java.rmi.RemoteException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public interface MathService extends Remote{
    double add(double x, double y) throws RemoteException;
    double subtract(double x, double y) throws RemoteException;
}
