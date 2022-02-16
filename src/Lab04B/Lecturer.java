package Lab04B;

public class Lecturer extends Instructor {

    Lecturer(int age, int unreadMail) {
        super(age, unreadMail);
    }

    /**
     * Method to cope with unread mail
     */
    public void cope() {
        super.reduceMail((int)(getUnreadMail() * 0.6));
    }
}
