package creational.abstractfactory.entities;

import creational.abstractfactory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Button painted for Windows");
    }
}
