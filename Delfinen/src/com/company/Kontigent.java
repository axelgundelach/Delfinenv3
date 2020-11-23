package com.company;

public class Kontigent {

    private String name;
    private String age;
    private String membership;

    public Kontigent(String name, String age, String membership) {
        this.name = name;
        this.age = age;
        this.membership = membership;
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

    public String toString(){
        return this.name + " with the age : " + this.age + "with the adress : " +  " with the memembership : " + this.membership;
    }
}
