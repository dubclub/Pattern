import java.util.ArrayList;
import java.util.Iterator;


public class Flock implements Quackable {


    ArrayList ducks = new ArrayList();




    public void add(Quackable quacker) {
        ducks.add(quacker) ;
    }

    @Override
    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
