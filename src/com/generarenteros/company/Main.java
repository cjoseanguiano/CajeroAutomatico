package com.generarenteros.company;

import javax.swing.*;

public class Main {
    public static int valorSwith = -1;

    public static void main(String[] args) {

        ATM miCajero = new ATM();

        while (valorSwith != 0) {


            inicioMenu();
            switch (valorSwith) {
                case 1:
                    System.out.println(" VALOR 1");
//                Integer.parseInt(null, ("Consulta" + miCajero.dinero));
//                    JOptionPane.showMessageDialog(null, +miCajero.dinero);
                    int vaConsulta;

                    break;
                case 2:
                    System.out.println(" VALOR 2");
                    int dineroDeposito;
                    int vaDeposito;
                    dineroDeposito = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el deposito"));

//                    miCajero.setDinero(dineroDeposito);
                    vaDeposito = dineroDeposito;
                    System.out.println(vaDeposito);
                    break;
                case 3:
                    System.out.println(" VALOR 3");
                    break;
                case 4:
                    System.out.println(" VALOR 4");
                    break;
                default:
                    System.out.println(" VALOR DEFAULT");
                    break;
            }
        }
    }


    public static int inicioMenu() {
        valorSwith = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el paso a realizar"
                + "\n 1.- Consultar Saldo"
                + "\n 2.- Depositar"
                + "\n 3.- Retirar"
                + "\n 4.- Terminar"));

        return valorSwith;
    }
}
