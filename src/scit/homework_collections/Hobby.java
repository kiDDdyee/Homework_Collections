package scit.homework_collections;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    String hobbyName;
    String hobbyFrequency;
    List<Adresa> adress = new ArrayList<Adresa>();

    public Hobby() {

    }

    public Hobby(String hobbyName, String hobbyFrequency, List<Adresa> adress) {
        this.hobbyName = hobbyName;
        this.hobbyFrequency = hobbyFrequency;
        this.adress = adress;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public String getHobbyFrequency() {
        return hobbyFrequency;
    }

    public void setHobbyFrequency(String hobbyFrequency) {
        this.hobbyFrequency = hobbyFrequency;
    }

    public List<Adresa> getAdress() {
        return adress;
    }

    public void setAdress(List<Adresa> adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return " are hobby de: " +  hobbyName + " si practizeaza de : " + hobbyFrequency + ". Adresa de a practica: " + adress;
    }
}