package creational.abstractfactory.entities;

import creational.abstractfactory.interfaces.Application;
import creational.abstractfactory.interfaces.Button;
import creational.abstractfactory.interfaces.CheckBox;
import creational.abstractfactory.interfaces.GUIFactory;

public class ApplicationImpl implements Application {
    private Button button;
    private CheckBox checkBox;

    public ApplicationImpl(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    @Override
    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
