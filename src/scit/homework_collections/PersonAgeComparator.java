package scit.homework_collections;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Persoane> {

    @Override
    public int compare(Persoane person1, Persoane person2) {
        if (person1.getAge() > person2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
