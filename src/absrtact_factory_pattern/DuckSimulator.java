package absrtact_factory_pattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory countingEchoDuckFactory = new CountingEchoDuckFactory();
        System.out.println("\nDuck Simulator: With Abstract Factory Without Decorate");
        simulator.simulate(duckFactory);
        System.out.println("\nDuck Simulator: With Abstract Factory With Counting");
        simulator.simulate(countingDuckFactory);
        System.out.println("\nDuck Simulator: With Abstract Factory With Counting and Echo");
        simulator.simulate(countingEchoDuckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        System.out.println("Duck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
        System.out.println("The ducks quacked and echo " + QuackCounterEcho.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
