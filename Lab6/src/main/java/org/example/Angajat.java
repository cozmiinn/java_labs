package org.example;

import java.time.LocalDate;

class Angajat{
    private String numele;
    private String postul;
    private LocalDate data_angajarii;
    private float salariu;

    public Angajat(String numele, String postul, LocalDate data_angajarii, float salariu){
        this.numele=numele;
        this.postul=postul;
        this.data_angajarii=data_angajarii;
        this.salariu=salariu;
    }

    public Angajat(){}

    public String getNumele(){
        return numele;
    }

    public String getPostul(){
        return postul;
    }

    public LocalDate getData_angajarii(){
        return data_angajarii;
    }

    public float getSalariu(){
        return salariu;
    }

    public void setNumele(String numele){
        this.numele=numele;
    }

    public void setPostul(String postul){
        this.postul=postul;
    }

    public void setData_angajarii(LocalDate data_angajarii){
        this.data_angajarii=data_angajarii;
    }

    public void setSalariu(float salariu){
        this.salariu=salariu;
    }
    @Override
    public String toString(){
        String text="";
        text="Angajat " + this.numele + " cu postul de " + this.postul + ". Angajat din " + this.data_angajarii + ". Salariu " + this.salariu;
        return text;
    }
}