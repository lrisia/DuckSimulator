package composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        Iterator iterator = quackers.iterator();
        boolean firstQuacker = true;
        while (iterator.hasNext()) {
            Quackable quackers = (Quackable) iterator.next();
            if (firstQuacker) {
                quackers.quack();
                quackers.quack();
                firstQuacker = false;
            }
            quackers.quack();
        }
    }
}
