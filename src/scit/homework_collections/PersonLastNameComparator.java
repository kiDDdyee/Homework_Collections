package scit.homework_collections;

import java.util.Comparator;

public class PersonLastNameComparator implements Comparator<Persoane>{

    @Override
    public int compare(Persoane person1, Persoane person2) {
        return person1.getLastName().compareTo(person2.getLastName());
    }
}
