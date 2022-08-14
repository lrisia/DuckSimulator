package composite_pattern;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        echo();
        numberOfQuacks++;
    }

    public void echo() {
        System.out.print("echo: ");
        duck.quack();
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
