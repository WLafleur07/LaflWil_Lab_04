package Lab04B;

public class Faculty extends Instructor {

    public Faculty(int age, int unreadMail) {
        super(age,unreadMail);
    }

    /**
     * Method to cope with unread mail
     */
    public void cope() {
        super.addToEccentricities(30);
    }

    /**
     *
     * @return respect level of Faculty member if greater than 0 else returns 0
     */
    public int respect() {
        int respect = super.getAge() + super.getEccentricities();

        if (respect >= 0) {
            return respect;
        } else {
            return 0;
        }
    }
}
