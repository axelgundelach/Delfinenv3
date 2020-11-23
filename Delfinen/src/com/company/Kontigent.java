package com.company;

public class Kontigent {

    private String name;
    private String age;
    private String membership;
    private String abonnement;

    public Kontigent(String name, String age, String membership, String abonnement) {
        this.name = name;
        this.age = age;
        this.membership = membership;
        this.abonnement = abonnement;
    }


    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }

    public String getMembership() {
        return this.membership;
    }

    public String getAbonnement(){
        return this.abonnement;
    }

    public String setAbonnement(int i){
        String a = String.valueOf(i);
        this.abonnement = a;
        return abonnement;
    }

    public String toString(){
        return this.name + " with the age : " + this.age + "with the adress : " +  " with the memembership : " + this.membership;
    }
}
