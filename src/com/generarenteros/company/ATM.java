package com.generarenteros.company;

/**
 * Created by carlosjoseanguiano on 17/03/17.
 */
public class ATM {
    int dinero;

    public ATM(int dinero) {
        this.dinero = dinero;
    }

    public ATM() {

    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void depositoDinero(double d) {

        if (d > 0) {
            this.dinero += d;
            System.out.println("El saldo de la cuenta es :" + this.dinero);

        } else {
            System.out.println("No realizaste ningun valor ");
            return;
        }
    }

    public void retirarDinero(double d) {
        if (dinero > d) {
            System.out.println("El retiro es satisfactorio " + this.dinero);
            return;
        } else if (dinero <= 0) {
            System.out.println("El retiro que intentas realizar es mayor a tu saldo actual ");
            return;
        }

        this.dinero -= d;
        System.out.println("El saldo despues de retirar es :" + this.dinero);
    }

}