package Lab04A;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    /**
     * Method used to compare two Person objects age
     * @param p1
     * @param p2
     * @return
     */
    public int compare(Person p1, Person p2) {

        return p1.getAge() - p2.getAge(); // sorting age in ascending order
    }
}
