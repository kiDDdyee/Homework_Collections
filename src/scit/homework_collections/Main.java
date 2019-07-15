package scit.homework_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        treeSet();
    }

    public static void treeSet() {

        Persoane vlad = new Somer("Vlad", "Barbu", 34);
        Persoane mirabela = new Student("Mirabela", "Zahan", 20);
        Persoane anca = new Angajat("Anca", "Fesnic", 28);
        Persoane mircea = new Student("Mircea", "Alexandru", 21);
        Persoane adrian = new Angajat("Adrian", "Paul", 38);
        Persoane luci = new Somer("Lucian", "Marinaru", 45);
        Persoane iza = new Student("Izabela", "Vancea", 23);

        Adresa adress1 = new Adresa("Oradea", "Alea strandului", 5);
        Adresa adress2 = new Adresa("Cluj-Napoca", "Augustin Bunea", 1);
        Adresa adress3 = new Adresa("Targu-Mures", "Principală", 246);
        Adresa adress4 = new Adresa("Cluj-Napoca", "Bulevardul 1 Decembrie 1918 ", 41);
        Adresa adress5 = new Adresa("Bucuresti", "Eroilor", 27);
        Adresa adress6 = new Adresa("Cluj-Napoca", "Ploieşti", 6);
        Adresa adress7 = new Adresa("Cluj-Napoca", "Iuliu Hatieganu", 12);
        Adresa adress8 = new Adresa("Sibiu", "Ion Barbu", 184);
        Adresa adress9 = new Adresa("Cluj-Napoca", "Horticultorilor", 1);

        List<Adresa> swimmingAdress = new ArrayList<Adresa>();
        swimmingAdress.add(adress7);
        swimmingAdress.add(adress1);
        swimmingAdress.add(adress4);
        List<Adresa> footballAdress = new ArrayList<Adresa>();
        footballAdress.add(adress2);
        footballAdress.add(adress9);
        footballAdress.add(adress3);
        List<Adresa> pingpongAdress = new ArrayList<Adresa>();
        pingpongAdress.add(adress6);
        pingpongAdress.add(adress5);
        pingpongAdress.add(adress8);

        Hobby swimming = new Hobby("INOT", "3 ori pe saptamana", swimmingAdress);
        Hobby pingpong = new Hobby("PING-PONG", "2 ori pe saptamana", pingpongAdress);
        Hobby football = new Hobby("FOOTBALL", "din 2 in 2 saptamani", footballAdress);


        Set<Persoane> nameList = new TreeSet<>(new PersonLastNameComparator());
        nameList.add(vlad);
        nameList.add(mirabela);
        nameList.add(anca);
        nameList.add(mircea);
        nameList.add(adrian);
        nameList.add(luci);
        nameList.add(iza);

        System.out.println("Dupa ordonare de nume de familie: ");
        System.out.println(nameList);

        Set<Persoane> ageList = new TreeSet<>(new PersonAgeComparator());
        ageList.add(vlad);
        ageList.add(mirabela);
        ageList.add(anca);
        ageList.add(mircea);
        ageList.add(adrian);
        ageList.add(luci);
        ageList.add(iza);

        System.out.println("Dupa ordonare de varsta: ");
        System.out.println(ageList);

        Map<Persoane, Hobby> personHobby = new HashMap<Persoane, Hobby>();
        personHobby.put(vlad, swimming);
        personHobby.put(anca, football);
        personHobby.put(iza, swimming);
        personHobby.put(mirabela, pingpong);
        personHobby.put(mircea, football);
        personHobby.put(adrian, football);
        personHobby.put(luci, pingpong);

        System.out.println();
        for (Persoane persoane : personHobby.keySet()) {
            System.out.println(persoane.getFirstName() + " " + persoane.getLastName() + " " + personHobby.get(persoane));

        }

    }
}
