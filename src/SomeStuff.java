import java.time.LocalDateTime;

public class SomeStuff {
    private final int MULTIPLIER = 31;
    private final String HOMEWORK_STRING = "HOMEWORK";
    private int someNumber;
    private String someString;

    public SomeStuff(int someNumber, String someString) {
        this.someNumber = someNumber;
        this.someString = someString;
    }

    public void printSomething() {
        System.out.println(HOMEWORK_STRING);
    }

    public int getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(int someNumber) {
        this.someNumber = someNumber * MULTIPLIER;
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
