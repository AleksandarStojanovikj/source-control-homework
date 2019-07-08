import java.time.LocalDateTime;

public class SomeStuff {
    private final int MULTIPLIER = 31;
    private final String HOMEWORK_STRING = "HOMEWORK";
    private int someNumber;

    public SomeStuff(int someNumber) {
        this.someNumber = someNumber;
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

    public void printLocalDateTime() {
        System.out.println(LocalDateTime.now());
    }

    public void getCurrentMonth() {
        System.out.println(LocalDateTime.now().getMonth());
    }
}
