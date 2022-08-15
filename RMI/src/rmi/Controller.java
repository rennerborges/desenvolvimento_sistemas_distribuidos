/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author renner
 */
public class Controller extends UnicastRemoteObject implements IMath {

    private static final long serialVersionUUID = 1L;

    public Controller() throws RemoteException {
        super();
    }

    @Override
    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double substrair(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    @Override
    public double dividir(double n1, double n2) {
        return n1 / n2;
    }

}
