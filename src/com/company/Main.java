package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        //Creamos un cliente que no funcione
        try {
            Client client = new Client("Carlos","Lopez Perales","53336819");
        } catch (BankClientException e) {
            e.printStackTrace();
        }
        CompteEstalvi compteEstalvi = new CompteEstalvi("Cuenta1");

        //Creamos un cliente que si funcione
        try {
            Client client2 = new Client("Enrique", "Lopez","33915718X");
        } catch (BankClientException e) {
            e.printStackTrace();
        }
        CompteEstalvi compteEstalvi2 = new CompteEstalvi("Cuenta2");





        compteEstalvi.ingressar(20);

        //Retiramos dinero para que funcione
        try {
            compteEstalvi.treure(10);
        } catch (BankAccountException e) {
            e.printStackTrace();
        }
        //Retirmaos dinero para que no funcione
        try {
            compteEstalvi.treure(25);
        } catch (BankAccountException e) {
            e.printStackTrace();
        }


    }
}
