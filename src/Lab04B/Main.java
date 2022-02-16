/**
 * Name: William Lafleur
 * Date: February 15, 2022
 * Description: program to test the implementation of inheritance by
 *              creating an abstract Instructor class with subclasses of Faculty, Lecturer and Grad. They inherit the
 *              same variables from the super class but override certain methods to obtain unique functionality
 */

package Lab04B;

public class Main {
    public static void main(String[] args) {
        Faculty flty = new Faculty(87, 1);
        Grad grd = new Grad(41, 80);
        Lecturer ltr = new Lecturer(70, 29);

        // creation of array holding different Instructor types
        Instructor[] intructors = new Instructor[3];
        intructors[0] = flty;
        intructors[1] = grd;
        intructors[2] = ltr;

        // traversing a loop of 10 (i.e. 10 days) and then outputting
        for (int i = 0; i < 10; i++) {
            int mail = (i * 10) + 50;

            for (Instructor inst : intructors) {

                inst.getMail(mail);

                if ((i % 2) == 0) {
                    double random = Math.random();
                    int number = (int) (random * 10);
                    inst.reduceMail(number);
                }

            }
        }

        System.out.println("After 10 days here are the results: ");
        printList(intructors);
    }

    /**
     * Method to print out an Array of Instructor object instances
     * @param intructors array of type Person
     */
    public static void printList(Instructor[] intructors) {
        for(Instructor inst : intructors) {
            System.out.println(inst.toString());
        }
    }
}
