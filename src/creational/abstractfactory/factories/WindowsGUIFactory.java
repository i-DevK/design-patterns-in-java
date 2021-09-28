package creational.abstractfactory.factories;

import creational.abstractfactory.entities.WindowsButton;
import creational.abstractfactory.entities.WindowsCheckBox;
import creational.abstractfactory.interfaces.Button;
import creational.abstractfactory.interfaces.CheckBox;
import creational.abstractfactory.interfaces.GUIFactory;

public class WindowsGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
