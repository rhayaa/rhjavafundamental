package com.juaracoding.rhjavafundamental.testharian.praktikum2;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Rhay Riswan Hadiyanto
Java Developer
Created on 28/06/2023 13:25
@Last Modified 28/06/2023 13:25
Version 1.0
*/
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

//        Scanner scrInput;
//        scrInput = new Scanner(System.in);
//        int intI = 1;
//        int intInput = 1 ;           //variable inputan
//        float floSum = 0;           //variable total
//        float floAverage = 0;       //variable rata rata
//
//        /*
//        handling agar user tidak memasukan inputan selain angka1
//         */
//
//        try {
//            while (intI <= intInput ) {      //Perulangan untuk perhitungan inputan angka
//
//                System.out.print("Masukan Angka :");    //inputan user
//                intInput = scrInput.nextInt();
//                floSum = floSum + intInput;        //proses mencari nilai total
//                floAverage = floSum /intI;             //proses mencari nilai rata rata
//                intI++;
//            }
//        }catch (Exception e){   // handling arror sebagai output dan hasil
//            System.out.println("Nilai Int Tampung "+ floSum);     //output nilai total
//            System.out.println("Nilai Rata Rata "+ floAverage);   //output nilai rata rata
//        }

        Scanner scrInput;
        scrInput = new Scanner(System.in);
        int i = 1;
        int nilai =1;
        double total = 0;
        double rata = 0;

        try {
            while (i <= nilai){
                System.out.print("masukan Nilai \s" + i +" :\s");
                nilai = scrInput.nextInt();

                total = total + nilai;
                rata = total/i;
                i++;
            }
        }catch (Exception e) {

            System.out.println("Total :" + total);
            System.out.println("Rata Rata :" + rata);
        }

    }
}
