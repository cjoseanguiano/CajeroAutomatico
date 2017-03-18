package com.generarenteros.company;

import javax.swing.*;

public class Main {
    public static int valorSwith = -1;
    public static int dineroDeposito;
//    public static int dineroRetiro;

    public static void main(String[] args) {

        ATM miCajero = new ATM();

        while (valorSwith != 0) {


            inicioMenu();
            switch (valorSwith) {
                case 1:
                    int vaConsulta;
                    JOptionPane.showMessageDialog(null, +miCajero.dinero);


                    break;
                case 2:
                    dineroDeposito = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el deposito"));
                    miCajero.depositoDinero(dineroDeposito);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo Actual :" + miCajero.dinero);
                    dineroDeposito = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto del retiro"));
                    miCajero.retirarDinero(dineroDeposito);

                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }


    public static int inicioMenu() {
        valorSwith = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el paso a realizar"
                + "\n 1.- Consultar Saldo"
                + "\n 2.- Depositar"
                + "\n 3.- Retirar"));

        return valorSwith;
    }
}
