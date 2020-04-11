package com.company;

import java.util.Scanner;
import java.io.PrintStream;

public class Main
{
    static String nazywamSie = "";
    static int wiek = 0;
    static Scanner wpisz = new Scanner(System.in);
    static String licencja = "1234";

    public static void nazywamSie()
    {
        System.out.println("Wprowadź swoję imię: \n");
        nazywamSie = wpisz.nextLine();
        System.out.println("Nazywasz się " + nazywamSie );
    }
    public static void ileLat()
    {
        System.out.println("Powiedz mi ile masz lat?\n");
        wiek = Integer.parseInt(wpisz.nextLine());
        System.out.println("Masz " + wiek + " Lat");
    }

    public static void zaRok()
    {
        System.out.println("Za rok będziesz miał: " + (++wiek ) + " lata");
    }

    public static void sprawdzLicencje(String kod)
    {
    if(licencja.equals(kod));
    }

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("Witaj\n");
            nazywamSie();
            ileLat();
            zaRok();

            if(wiek>0 && wiek<=12)
            {
                System.out.println("Nie masz dostępu do programu");
                break;
            }
            else if(wiek>12 && wiek<=40)
            {
                System.out.println("Masz dostęp do programu \n Proszę wpisz kod licencji 5hXi3POXa");
                String kod = (wpisz.nextLine());
                sprawdzLicencje(kod);
            }
        }
        /*
        if(wiek>0 && wiek<=12)
        {
            System.out.println("Nie masz dostępu do programu");
        }
        else if(wiek>12 && wiek<=40)
        {
            System.out.println("Masz dostęp do programu");
        }

        /*
        String nazywamSie;
        int wiek = 0;

        Scanner inReader = new Scanner(System.in);
        System.out.println("Jak się nazywasz?");
        nazywamSie = inReader.nextLine();
        System.out.println("Ile masz lat?");
        wiek = inReader.nextInt();
        System.out.println(nazywamSie + " masz " + wiek + " Lat");
        System.out.println("Za rok będziesz miał: " + (++wiek ) + " lata");
        */
    }
}