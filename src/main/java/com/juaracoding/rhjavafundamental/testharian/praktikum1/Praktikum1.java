package com.juaracoding.rhjavafundamental.testharian.praktikum1;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Rhay Riswan Hadiyanto
Java Developer
Created on 24/06/2023 12:34
@Last Modified 24/06/2023 12:34
Version 1.0
*/
import java.util.Scanner;
public class Praktikum1 {
    public static void main(String[] args) {


//        (Input)		Masukkan Kata : Tid4k $@ma
//        (Output)	    Hasil	: 268

        Scanner scanner = new Scanner(System.in);
        String strInput = ""; // variabel input user
        char chInput = 'a';   // variabel penampung karakter
        int intConvert = 0;   // variabel manipulasi dari char
        int intHasil = 0;     // variabel hasil

//        Input User kata yang mau di hitung
        System.out.print("Masukkan Kata : ");
        strInput = scanner.nextLine();

//        looping proses pengecekan String untuk di convert ke char
        for (int i = 0; i < strInput.length(); i++){
            chInput = strInput.charAt(i); //mengubah string menjadi char
            intConvert = chInput;

            if(
                            (intConvert>=32 && intConvert<=64)||            //ASCII angka dan karakter
                            (intConvert>=65 && intConvert<=90)              //ASCII huruf besar

            ){

                intHasil = intHasil + intConvert;   //menghitung hasil kalkulasi yang sudah di convert
            }

        }

        System.out.println("Output dari input "+strInput+" adalah  :"+intHasil); //menampilkan hasil

    }

}
