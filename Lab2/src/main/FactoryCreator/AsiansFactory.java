package main.FactoryCreator;

import main.HumanBuilder.HumanBuilder;
import main.HumanBuilder.MongoloidGreenEyesBuilder;
import main.HumanBuilder.MongoloidRightHanded;

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
