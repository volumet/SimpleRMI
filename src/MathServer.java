
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MathServer {
    public static void main(String[] args) {
        String serviceName = "rmi://localhost:1098/Math1";
        Mathematician server;
        try {
            server = new Mathematician();
            Runtime rt = Runtime.getRuntime();
            rt.exec("rmiregistry.exe");
            LocateRegistry.createRegistry(1098);
            Naming.rebind(serviceName, server);
            System.out.println("Server " + serviceName + " is running");
        } catch (Exception e) {
        }
    }
}
