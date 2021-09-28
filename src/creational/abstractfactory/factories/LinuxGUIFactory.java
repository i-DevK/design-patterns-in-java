package creational.abstractfactory.factories;

import creational.abstractfactory.entities.LinuxButton;
import creational.abstractfactory.entities.LinuxCheckBox;
import creational.abstractfactory.interfaces.Button;
import creational.abstractfactory.interfaces.CheckBox;
import creational.abstractfactory.interfaces.GUIFactory;

public class LinuxGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
