package main.FactoryCreator;

import main.HumanBuilder.HumanBuilder;
import main.HumanBuilder.NegroidLeftHanded;
import main.HumanBuilder.NegroidBrownEyeBuilder;

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
