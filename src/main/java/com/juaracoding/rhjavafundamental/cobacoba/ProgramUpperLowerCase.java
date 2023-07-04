package com.juaracoding.rhjavafundamental.cobacoba;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Rhay Riswan Hadiyanto
Java Developer
Created on 03/07/2023 21:03
@Last Modified 03/07/2023 21:03
Version 1.0
*/
import java.util.Scanner;
public class ProgramUpperLowerCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Character charCastAscii = 'a';

        System.out.print("Masukan 1 digit karakter :");
        charCastAscii = scanner.next().charAt(0);


            if (charCastAscii >= 65 && charCastAscii <= 90 || charCastAscii >= 97 && charCastAscii <= 122) {
                System.out.println("ya Huruf..");
                if (charCastAscii >= 65 && charCastAscii <= 90) {
                    System.out.println("INI ADALAH HURUF KAPITAL");
                }
                else {
                    System.out.println("ini adalah huruf kecil");
                }
            }
            else {
                System.out.println("ini bukan huruf");
            }

    }
}
