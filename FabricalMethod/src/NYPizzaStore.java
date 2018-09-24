/**
 * Created by Alex on 10.08.2016.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if (item.equals("pepperony")) {
            return new NYStylePepperonyPizza();
        }
        else if (item.equals("calm")) {
            return new NYStyleCalmPizza();
        }
        else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        else return null;
    }
}
