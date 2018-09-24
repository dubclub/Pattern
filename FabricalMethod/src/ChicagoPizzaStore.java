/**
 * Created by Alex on 10.08.2016.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else if (item.equals("pepperony")) {
            return new ChicagoStylePepperonyPizza();
        }
        else if (item.equals("calm")) {
            return new ChicagoStyleCalmPizza();
        }
        else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        else return null;
    }
}
