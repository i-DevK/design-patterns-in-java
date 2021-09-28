package creational.abstractfactory.factories;

import creational.abstractfactory.entities.ApplicationImpl;
import creational.abstractfactory.enums.OperatingSystem;
import creational.abstractfactory.interfaces.Application;

public class ApplicationFactory {
    public static Application getApplicationConfiguration(OperatingSystem os) {
        Application app;
        switch (os) {
            case WINDOWS:
                app = new ApplicationImpl(new WindowsGUIFactory());
                break;
            case MAC:
                app = new ApplicationImpl(new MacGUIFactory());
                break;
            case LINUX:
                app = new ApplicationImpl(new LinuxGUIFactory());
                break;
            default:
                app = new ApplicationImpl(new WindowsGUIFactory());
                break;
        }
        return app;
    }

}
