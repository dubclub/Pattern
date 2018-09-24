/**
 * Created by Alex on 10.08.2016.
 */
public abstract class PizzaStore {

    Pizza orderPizza(String type) {

        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
