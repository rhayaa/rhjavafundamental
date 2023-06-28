package com.juaracoding.rhjavafundamental.cobacoba;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Rhay Riswan Hadiyanto
Java Developer
Created on 28/06/2023 20:52
@Last Modified 28/06/2023 20:52
Version 1.0
*/

public class Method1 {
    public static void main(String[] args) {

        double doFinalFormula = hitungLuasPersegi(5.0,5.0);
//        System.out.println(hitungLuasPersegi(5.0,5.0));
        System.out.println("Luas Persegi"+doFinalFormula);

        double doFinalFormula2 = hitungLuasLayangLayang(4.0,6.0);
        System.out.println("Luas Layang Layang" +doFinalFormula2);
    }

    public static double hitungLuasPersegi(double doPanjang, double doLebar)
    {
        double doLuasPersegi = prosesHitungLuasPersegi(doPanjang,doLebar);

        return doLuasPersegi;
    }

    public static double prosesHitungLuasPersegi(double doPanjang, double doLebar)
    {
        double doLuasPersegi = (doPanjang*doLebar);

        return doLuasPersegi;

    }
    public static double hitungLuasLayangLayang(double doDiagonal1, double doDiagonal2)
    {
        double doLuasLayangLayang = prosesHitungLuasLayangLayang(doDiagonal1,doDiagonal2);

        return doLuasLayangLayang;
    }

    public static double prosesHitungLuasLayangLayang(double doDiagonal1, double doDiagonal2)
    {
        double doLuasLayangLayang = (doDiagonal1*doDiagonal2)*0.5;

        return doLuasLayangLayang;

    }

}
