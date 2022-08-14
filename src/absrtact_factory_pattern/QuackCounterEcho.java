package absrtact_factory_pattern;

public class QuackCounterEcho implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounterEcho (Quackable duck) {
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
