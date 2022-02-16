package Lab04B;

import java.lang.Math;

/**
 * Abstract class to be inherited by subclasses Grad, Lecturer ad Faculty
 */
public abstract class Instructor {
    private int age;
    private int unreadMail;
    private int eccentricities;

    Instructor(int age, int unreadMail) {
        this.age = age;
        this.unreadMail = unreadMail;
    }

    public int getAge() { return this.age; }

    public int getUnreadMail() { return this.unreadMail; }

    public int getEccentricities() { return eccentricities; }

    public abstract void cope();

    /**
     * Method to return unreadMail or return value of 1000 if unreadMail exceeds such a value
     * @return unreadMail if less than 1000 else 1000
     */
    public int stress() {
        if (this.unreadMail <= 1000) {
            return this.unreadMail;
        } else {
            return 1000;
        }
    }

    /**
     * Method to return the level of respect of an Instructor
     * @return return respect if less than or equal to 0 else return 0
     */
    public int respect() {
        int respect = this.age - this.eccentricities;

        if (respect >= 0) {
            return respect;
        } else {
            return 0;
        }
    }

    /**
     * Method to reduce the value of unread mail
     * @param readMail value of how much mail to be read
     */
    public void reduceMail(int readMail) {
         int mail = this.unreadMail - readMail;

         if (mail < 0) {
             this.unreadMail = 0;
         } else {
            this.unreadMail = mail;
         }
    }

    /**
     * Method to add additional eccentricities to Instructor
     * @param eccentricities number of eccentricities to add (value can be negative)
     */
    public void addToEccentricities(int eccentricities) {
         int ecc = this.eccentricities + eccentricities;

         if (ecc < 0) {
             this.eccentricities = 0;
         } else {
             this.eccentricities = ecc;
         }
    }

    /**
     * Method to add additional Mail to the unread pile, alters eccentricities on a 50% basis by 2 or -2
     * @param newMail amount of mail to update unread amount by
     */
    public void getMail(int newMail) {
        this.unreadMail += newMail;

        if (Math.random() > 0.20) {
            if (Math.random() > 0.50) {
                addToEccentricities(2);
            } else {
                addToEccentricities(-2);
            }
        }
    }

    /**
     * Method to print the stats of a given Instructor
     * @return a string contain all variables
     */
    public String toString() {
        return "Age " + this.age + " has respect " + this.respect() +
                " and " + this.eccentricities + " number of eccentricities and "
                + this.unreadMail + " number of unread messages.";
    }
}
