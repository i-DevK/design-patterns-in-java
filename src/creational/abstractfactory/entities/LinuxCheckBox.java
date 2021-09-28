package creational.abstractfactory.entities;

import creational.abstractfactory.interfaces.CheckBox;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("CheckBox painted for Linux");
    }
}
