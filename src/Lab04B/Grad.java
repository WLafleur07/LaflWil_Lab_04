package Lab04B;

public class Grad extends Instructor {

    Grad(int age, int unreadMail) {
        super(age, unreadMail);
    }

    /**
     * Method to cope with unread mail
     */
    public void cope() {
        super.reduceMail(super.getUnreadMail());

        if (Math.random() > 0.50) {
            super.addToEccentricities(3);
        } else {
            super.addToEccentricities(-3);
        }
    }

    /**
     * Method to increase Grad's stress level over the standard 1000 threshold
     * @return the stress level of Grad
     */
    public int stress() {
        if (super.getUnreadMail() < 1500)
            return super.getUnreadMail();
        else
            return 1500;
    }
}
