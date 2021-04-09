package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Organizator joc = new Organizator();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader (System.in));
        int n,k;

        try {
            k = Integer.parseInt(reader.readLine());
            n = Integer.parseInt(reader.readLine());

            for (int i = 0; i < n; ++i) {
                String linie = reader.readLine();
                String[] meci = linie.split(" ");
                joc.adaugaMeci(meci[0], Integer.parseInt(meci[1]),
                        meci[4], Integer.parseInt(meci[3]));
            }
                joc.afiseazaFinal();

        }
        catch(IOException exc){
            System.out.println("Eroare la citire");
        }







    }
}
