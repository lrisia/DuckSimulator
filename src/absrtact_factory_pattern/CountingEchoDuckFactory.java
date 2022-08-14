package absrtact_factory_pattern;

public class CountingEchoDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounterEcho(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounterEcho(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounterEcho(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounterEcho(new RedheadDuck());
    }
}
