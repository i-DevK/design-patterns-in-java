package creational.abstractfactory.factories;

import creational.abstractfactory.entities.MacButton;
import creational.abstractfactory.entities.MacCheckBox;
import creational.abstractfactory.interfaces.Button;
import creational.abstractfactory.interfaces.CheckBox;
import creational.abstractfactory.interfaces.GUIFactory;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
