package main.lab3.FactoryCreator;


import main.lab3.HumanBuilder.HumanBuilder;
import main.lab3.HumanBuilder.NegroidBrownEyeBuilder;
import main.lab3.HumanBuilder.NegroidLeftHanded;

public class AfricansFactory extends AbstractFactory{
    public HumanBuilder getHumanBuilder(HumanTypeSpecifications humanTypeSpecifications) {

        HumanBuilder builder = null;
        switch (humanTypeSpecifications) {
            case negroidLeftHanded:
                builder = new NegroidLeftHanded();
                break;
            case negroidBrownEyes:
                builder = new NegroidBrownEyeBuilder();
                break;
            default:
                System.out.println("Not specified");
                break;
        }
        return builder;
    }
}
