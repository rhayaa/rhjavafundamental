package com.juaracoding.rhjavafundamental.testharian.praktikum3;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Rhay Riswan Hadiyanto
Java Developer
Created on 06/07/2023 18:49
@Last Modified 06/07/2023 18:49
Version 1.0
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum3 {

    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<Integer>();

        int jumlahArr = 0;
        double jumlahTotal = 0.0;
        double rataRata = 0.0;


        /*
        handling agar user tidak memasukan inputan selain angka
         */
        try {
            while (true) {      //Perulangan untuk perhitungan inputan angka
                System.out.print("Masukan Angka :");    //inputan user
                int intInput = new Scanner(System.in).nextInt();
                angka.add(intInput);

                jumlahArr = angka.size();
                jumlahTotal = jumlahTotal + intInput;
                rataRata = jumlahTotal/jumlahArr;

            }
        }catch (Exception e){   // handling arror sebagai output dan hasil

            System.out.println("User Melakukan Input Sebanyak    : " + jumlahArr + "\s" + "kali");//Banyak inputan user

            System.out.print("Dengan Data Input                :");
            for (int k = 0; k < angka.size(); k++) {
                if (k == angka.size() - 1) {
                    System.out.println("\sdan\s" + angka.get(angka.size() - 1)); //menyisipkan kata "dan"
                    break;

                }
                System.out.print( "\s"+angka.get(k) + ",\s" );// Banyak Inputan User

            }
//            System.out.println("Jumlah : " + jumlahTotal);
            System.out.println("Rata - Rata                      : " + rataRata);//Nilai rata rata

        }



    }

}
