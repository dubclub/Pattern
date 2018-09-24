package com.company;

/**
 * Created by Alex on 19.08.2016.
 */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = false;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;

    }

    public void fill() {

        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }

    }

    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}
