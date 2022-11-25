package main.lab2.FactoryCreator;

import main.lab2.HumanBuilder.HumanBuilder;
import main.lab2.HumanBuilder.MongoloidGreenEyesBuilder;
import main.lab2.HumanBuilder.MongoloidRightHanded;

public class AsiansFactory extends AbstractFactory{
    public HumanBuilder getHumanBuilder(HumanTypeSpecifications humanTypeSpecifications) {
        HumanBuilder builder = null;
        switch (humanTypeSpecifications) {
            case mongoloidGreenEyes:
                builder = new MongoloidGreenEyesBuilder();
                break;
            case mongoloidRightHanded:
                builder = new MongoloidRightHanded();
                break;
            default:
                System.out.println("Not specified");
                break;
        }
        return builder;
    }
}
