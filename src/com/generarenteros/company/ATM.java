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

public void retirarDinero( double d ){
    if ( d <= 0 ){
        System.out.println( "No existen pesos negativos... no se hizo nada" );
        return;
    }
    if ( this.dinero < d ){
        System.out.println( "La cantidad a retirar es mayor que el saldo disponible... no se hizo nada" );
        return;
    }
    this.dinero -= d;
    System.out.println( "El saldo de la cuenta es: " + this.dinero );
}
}