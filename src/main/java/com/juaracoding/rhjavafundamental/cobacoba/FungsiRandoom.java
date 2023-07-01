package com.juaracoding.rhjavafundamental.cobacoba;/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Rhay Riswan Hadiyanto
Java Developer
Created on 01/07/2023 21:12
@Last Modified 01/07/2023 21:12
Version 1.0
*/

import java.util.Random;

public class FungsiRandoom {
    public static void main(String[] args) {

        Random random = new Random();

        //FungsiRandom
        // [a-z] interval length 8 - 20 , @ , provider (gmail,yahoo,dll) , domain(com,co.id,id)
//        String strProvider = {"gmail","yahoo","rocketmail","banyak"};
//        String strDomain = {".id",".co.id",".com"};


        String[] strProvider = {"gmail","yahoo","rocketmail","banyak"};
        String[] strDomain = {".id",".co.id",".com"};
        String[] strKarakter = {"@"};
        int intRandomLengthBegin = 8;
        int intRandomLengthEnd = 21;
        int intRandomKapitalAwal = 65;
        int intRandomKapitalAkhir = 91;
        int intRandomKecilAwal = 97;
        int intRandomKecilAkhir = 123;
        char chHurufBesar = 'a';
        char chHurufKecil = 'a';
        String strTampung = "";
        int intRandomLengthz = random.nextInt(intRandomLengthBegin,intRandomLengthEnd);
        for(int j=0;j<10;j++)
        {
            strTampung = "";
            intRandomLengthz = random.nextInt(intRandomLengthBegin,intRandomLengthEnd);
            for(int i=0;i<intRandomLengthz;i++)
            {
                if(i==10)
                {
                    chHurufBesar = (char) random.nextInt(intRandomKapitalAwal,intRandomKapitalAkhir);
                    strTampung = strTampung + chHurufBesar;
                }
                else{
                    chHurufKecil = (char) random.nextInt(intRandomKecilAwal,intRandomKecilAkhir);
                    strTampung = strTampung + chHurufKecil;
                }
            }
            System.out.println("String Format adalah "+strTampung + strKarakter[random.nextInt(strKarakter.length)] + strProvider[random.nextInt(strProvider.length)] + "" + strDomain[random.nextInt(strDomain.length)]);
        }

    }

}
