package creational.abstractfactory.entities;

import creational.abstractfactory.interfaces.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Button painted for Mac");
    }
}
