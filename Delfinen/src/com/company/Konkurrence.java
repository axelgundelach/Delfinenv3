package com.company;

public class Konkurrence {

    private String niveau;
    private String diciplin;
    private String time;

    public Konkurrence(String niveau, String diciplin, String time){
        this.niveau = niveau;
        this.diciplin= diciplin;
        this.time = time;
    }

    public String getNiveau(){
        return this.niveau;
    }

    public String getDiciplin(){
        return this.diciplin;
    }

    public String getTime(){
        return this.time;
    }

    public String setNiveau(String time){
        this.time = time;
        return time;
    }

    public String toString(){
        return "Niveau: " + this.niveau + "Diciplin: " + this.diciplin + "Time" + this.time;
    }
}
