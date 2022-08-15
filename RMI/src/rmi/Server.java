/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.Naming;

/**
 *
 * @author renner
 */
public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException{
        
        Controller controller = new Controller();
        
        Naming.rebind("10.0.2.16/math", controller);
    }
}
