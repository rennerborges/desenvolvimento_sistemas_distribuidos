/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

/**
 *
 * @author renner
 */
public class Client {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException{
        
        IMath math = (IMath) Naming.lookup("10.0.2.16/math");
        
        double soma = math.somar(1,2);
        
        System.out.println("Soma: "+ soma);
    }
}
