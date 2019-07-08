import java.time.LocalDateTime;

public class SomeStuff {
    private final int MULTIPLIER = 31;
    private final String HOMEWORK_STRING = "HOMEWORK";
    private int userNumber;
    private String someString;

    public SomeStuff(int userNumber, String someString) {
        this.userNumber = userNumber;
        this.someString = someString;
    }

    public void printSomething() {
        System.out.println(HOMEWORK_STRING);
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber * MULTIPLIER;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public void printLocalDateTime() {
        System.out.println(LocalDateTime.now());
    }

    public void getCurrentMonth() {
        System.out.println(LocalDateTime.now().getMonth());
    }
}
