package com.company;

public class Konkurrence {

    private String niveau;
    private String diciplin;
    private String time;
    private String age;
    private String name;

    public Konkurrence(String name, String age, String niveau, String diciplin, String time){
        this.name = name;
        this.age = age;
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

    public String getName(){
        return this.name;
    }

    public String getAge(){
        return this.age;
    }

    public String setNiveau(String time){
        this.time = time;
        return time;
    }

    public String toString(){
        return "Niveau: " + this.niveau + "Diciplin: " + this.diciplin + "Time" + this.time;
    }
}
