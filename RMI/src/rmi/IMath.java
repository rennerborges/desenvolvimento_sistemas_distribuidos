/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author renner
 */
public interface IMath extends Remote {

    public double somar(double n1, double n2) throws RemoteException;

    public double substrair(double n1, double n2) throws RemoteException;

    public double multiplicar(double n1, double n2) throws RemoteException;

    public double dividir(double n1, double n2) throws RemoteException;

}
