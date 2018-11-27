

public class MallardDuck implements Quackable {

    Observable observable;

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public MallardDuck () {
        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
