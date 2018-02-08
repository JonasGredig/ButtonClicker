package ch.baumink.buttonclicker.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;


public class ClickModel  {

    private long i = 0;

    public long getAmount() {
        return this.i;
    }

    public boolean setNumber(long number) {
        i = number;
        return false;
    }

}
