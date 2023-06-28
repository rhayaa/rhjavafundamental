package com.juaracoding.rhjavafundamental.testharian.praktikum2;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Rhay Riswan Hadiyanto
Java Developer
Created on 27/06/2023 22:46
@Last Modified 27/06/2023 22:46
Version 1.0
*/
import java.util.Scanner;
public class Praktikum2 {
    public static void main(String[] args) {

        /*
        mencari nilai rata - rata
         */

        Scanner scrInput;
        scrInput = new Scanner(System.in);
        int intInput = 0;           //variable inputan
        float floSum = 0;           //variable total
        float floAverage = 0;       //variable rata rata

        /*
        handling agar user tidak memasukan inputan selain angka
         */
        try {
            while (true) {      //Perulangan untuk perhitungan inputan angka
                System.out.print("Masukan Angka :");    //inputan user
                intInput = scrInput.nextInt();

                    floSum = floSum + intInput;        //proses mencari nilai total
                    floAverage = floSum /4;             //proses mencari nilai rata rata
            }
        }catch (Exception e){   // handling arror sebagai output dan hasil
//            System.out.println("Nilai Int Tampung "+ floSum);     //output nilai total
            System.out.println("Nilai Rata Rata "+ floAverage);   //output nilai rata rata
        }


    }

}
