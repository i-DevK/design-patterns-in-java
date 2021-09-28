package creational.abstractfactory;

import creational.abstractfactory.enums.OperatingSystem;
import creational.abstractfactory.factories.ApplicationFactory;
import creational.abstractfactory.interfaces.Application;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Application app1 = ApplicationFactory.getApplicationConfiguration(OperatingSystem.WINDOWS);
        app1.paint();
        System.out.println("==============******============");
        Application app2 = ApplicationFactory.getApplicationConfiguration(OperatingSystem.MAC);
        app2.paint();
        System.out.println("==============******============");
        Application app3 = ApplicationFactory.getApplicationConfiguration(OperatingSystem.LINUX);
        app3.paint();
        System.out.println("==============******============");
    }
}
