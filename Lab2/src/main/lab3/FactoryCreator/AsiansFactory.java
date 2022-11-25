package main.lab3.FactoryCreator;


import main.lab3.HumanBuilder.HumanBuilder;
import main.lab3.HumanBuilder.MongoloidGreenEyesBuilder;
import main.lab3.HumanBuilder.MongoloidRightHanded;

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
