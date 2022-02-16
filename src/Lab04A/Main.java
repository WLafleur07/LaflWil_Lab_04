/**
 * Name: William Lafleur
 * Date: February 15, 2022
 * Description: program to test the implementation of inheritance by
 *              creating a Person class and two additional classes to make comparisons between Person age and name
 */

package Lab04A;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Zoe", 50);
        Person p2 = new Person("Yim", 20);
        Person p3 = new Person("Xames", 3);
        Person p4 = new Person("Lerry", 10);
        Person p5 = new Person("Berome", 22);

        List<Person> people = Arrays.asList(p1, p2, p3, p4, p5);

        printList(people);

        Collections.sort(people, new LexicographicComparator());
        System.out.println("");

        printList(people);

        Collections.sort(people, new AgeComparator());
        System.out.println("");

        printList(people);
    }

    /**
     * Method to print out a List of Person object instances
     * @param people List of type Person
     */
    public static void printList(List<Person> people) {
        for(Person person : people) {
            System.out.println(person.toString());
        }
    }
}
