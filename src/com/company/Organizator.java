package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Organizator {
    private HashMap<String, Echipa> echipe;
    public Organizator(){
        echipe = new HashMap<String, Echipa>();
    }

    public void adaugaMeci(String echipa1, int goluri1, String echipa2, int goluri2){
        if (!echipe.containsKey(echipa1)){
            echipe.put(echipa1, new Echipa(echipa1));
        }
        if (!echipe.containsKey((echipa2))){
            echipe.put(echipa2, new Echipa(echipa2));
        }


        if (goluri1 > goluri2){
            echipe.get(echipa1).adaugaVictorie(goluri1, goluri2);
            echipe.get(echipa2).adaugaInfrangere(goluri2, goluri1);
        }
        else if (goluri1 == goluri2){
            echipe.get(echipa1).adaugaRemiza(goluri1, goluri2);
            echipe.get(echipa2).adaugaRemiza(goluri2, goluri1);
        }
        else{
            echipe.get(echipa1).adaugaInfrangere(goluri1,goluri2);
            echipe.get(echipa2).adaugaVictorie(goluri2, goluri1);
        }
    }

    public void afiseazaFinal(){
        ArrayList<Echipa> listaEchipe = new ArrayList<>();

        for (Echipa ech : echipe.values()){
            listaEchipe.add(ech);
        }
        Collections.sort(listaEchipe);

        for (Echipa ech : listaEchipe){
            System.out.println(ech);

        }

    }

}
