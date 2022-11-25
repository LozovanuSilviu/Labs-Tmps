package main.lab2;

import main.lab2.FactoryCreator.AbstractFactory;
import main.lab2.FactoryCreator.FactoryCreator;
import main.lab2.HumanBuilder.Human;
import main.lab2.HumanBuilder.HumanBuilder;
import main.lab2.HumanBuilder.HumanType;
import main.lab2.FactoryCreator.HumanTypeSpecifications;

public class Main {
    public static void main(String[] args) {
        Human prototype = AbstractFactory.getPrototype(HumanType.European);
        if (prototype != null) {
            System.out.println("Prototype found!");
            prototype.setEyeColor("blue");
            prototype.setHairColor("blond");
            System.out.println(prototype);
        }
        FactoryCreator creator = FactoryCreator.getInstance();
        AbstractFactory humanFactory = creator.getHumanTypeBuilder(HumanType.African);
        HumanBuilder humanBuilder = humanFactory.getHumanBuilder(HumanTypeSpecifications.negroidBrownEyes);
        humanBuilder .specifySkinColor("dark");
        humanBuilder .specifyHairColor("brunette");
        humanBuilder .returnHumanDescription();
        System.out.println(humanBuilder .getHuman().toString());

    }
}
