package main.lab3;

import main.lab3.Composite.HumanInfo;
import main.lab3.FactoryCreator.AbstractFactory;
import main.lab3.FactoryCreator.FactoryCreator;
import main.lab3.FactoryCreator.HumanTypeSpecifications;
import main.lab3.HumanAdapter.HumanBuilderImplementation;
import main.lab3.HumanBuilder.Human;
import main.lab3.HumanBuilder.HumanBuilder;
import main.lab3.HumanBuilder.HumanType;
import main.lab3.HumanDecorator.AfricanHuman;
import main.lab3.HumanDecorator.EuropeanHuman;
import main.lab3.HumanDecorator.IHuman;
import main.lab3.HumanDecorator.OrdinaryHuman;
import main.lab3.Proxy.HumanPassportDetails;
import main.lab3.Proxy.ProxyPassportDetailsAnnouncement;

public class Main {
    public static void main(String[] args) {
        /*Prototype creational design pattern*/
        System.out.println("------------Prototype creational design pattern");
        Human prototype = AbstractFactory.getPrototype(HumanType.European);
        if (prototype != null) {
            System.out.println("Prototype found!");
            prototype.setEyeColor("blue");
            prototype.setHairColor("blond");
            System.out.println(prototype.toString());
        }
        System.out.println("-----------------------------------------");

        /*Factory and Abstract Factory creational design patterns*/
        /*Singleton creational design pattern is presented in FactoryCreator class*/
        System.out.println("------------Factory and Abstract Factory creational design patterns");
        FactoryCreator creator = FactoryCreator.getInstance();
        AbstractFactory humanFactory = creator.getHumanTypeBuilder(HumanType.African);
        HumanBuilder humanBuilder = humanFactory.getHumanBuilder(HumanTypeSpecifications.negroidBrownEyes);
        humanBuilder .specifySkinColor("dark");
        humanBuilder .specifyHairColor("brunette");
        humanBuilder .returnHumanDescription();
        System.out.println(humanBuilder .getHuman().toString());
        System.out.println("-----------------------------------------");

        /*Adapter structural design pattern*/
        System.out.println("------------Adapter structural design pattern");
        HumanBuilderImplementation builderImpl = new HumanBuilderImplementation();

        builderImpl.build("Woman", "Blue");
        builderImpl.build("Man", "Green");
        builderImpl.build("ОНО", "brown");

        System.out.println("-----------------------------------------");

        /*Decorator structural design pattern*/
        System.out.println("------------Decorator structural design pattern");

        IHuman europeanHuman = new EuropeanHuman(new OrdinaryHuman());
        europeanHuman.create();
        System.out.println("\n");

        IHuman africanHuman = new AfricanHuman(new EuropeanHuman(new OrdinaryHuman()));
        africanHuman.create();
        System.out.println("-----------------------------------------");

        /*Proxy structural design pattern*/
        System.out.println("------------Proxy structural design pattern");

        HumanPassportDetails passportDetails = new ProxyPassportDetailsAnnouncement("MoldavianPassport");

        passportDetails.printPassportDetails();
        passportDetails.printPassportDetails();

        System.out.println("-----------------------------------------");

        /*Composite structural design pattern*/
        System.out.println("------------Composite structural design pattern");
        HumanInfo human1 = new HumanInfo("Hina", "Asian", 18);
        HumanInfo human2 = new HumanInfo("Scott", "African American", 15);
        HumanInfo human3 = new HumanInfo("Andrew", "European", 33);
        HumanInfo human4 = new HumanInfo("Jorge", "Latino", 30);
        HumanInfo human5 = new HumanInfo("Juliette", "American", 10);
        HumanInfo human6 = new HumanInfo("Rebecca", "African American", 40);


        human4.addGroupmate(human6);
        human4.addGroupmate(human3);

        human2.addGroupmate(human5);
        human2.addGroupmate(human1);

        System.out.println(human2);
        for (HumanInfo youngAgeHumanGroup : human2.getGroup()) {
            System.out.println("Young age group: " + youngAgeHumanGroup);
        }
        for (HumanInfo middleAgeHumanGroup : human4.getGroup()) {
            System.out.println("Middle age group: " + middleAgeHumanGroup);
        }
        System.out.println("-----------------------------------------");
    }
}
