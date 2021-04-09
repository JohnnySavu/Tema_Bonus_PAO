package com.company;

public class Echipa implements Comparable<Echipa>{
    private int score;
    private int goluriDate;
    private int goluriPrimite;
    private String nume;

    Echipa (String nume){
        score = 0;
        goluriDate = 0;
        goluriPrimite = 0;
        this.nume = nume;
    }

    public void adaugaVictorie(int goluriDate, int goluriPrimite){
        this.goluriDate += goluriDate;
        this.goluriPrimite += goluriPrimite;
        this.score += 3;
    }
    public void adaugaRemiza(int goluriDate, int goluriPrimite){
        this.goluriDate += goluriDate;
        this.goluriPrimite += goluriPrimite;
        this.score += 1;
    }
    public void adaugaInfrangere(int goluriDate, int goluriPrimite){
        this.goluriDate += goluriDate;
        this.goluriPrimite += goluriPrimite;
    }

    public int compareTo(Echipa echipa){
        if (this.score < echipa.score)
            return 1;
        else if (this.score == echipa.score)
            return 0;
        return -1;
    }

    public String toString(){
        return this.nume + " " + this.score + " " + this.goluriDate + " " + this.goluriPrimite;
    }
}
