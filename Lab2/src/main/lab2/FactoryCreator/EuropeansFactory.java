package main.lab2.FactoryCreator;

import main.lab2.HumanBuilder.HumanBuilder;
import main.lab2.HumanBuilder.CaucasoidBlondHairBuilder;
import main.lab2.HumanBuilder.CaucasoidBlueEyesBuilder;

public class EuropeansFactory extends AbstractFactory {
    public HumanBuilder getHumanBuilder(HumanTypeSpecifications humanTypeSpecifications) {
        HumanBuilder builder = null;
        switch (humanTypeSpecifications) {
            case caucasoidBlondHair:
                builder = new CaucasoidBlondHairBuilder();
                break;
            case caucasoidBlueEyes:
                builder = new CaucasoidBlueEyesBuilder();
                break;
            default:
                System.out.println("Not specified");
                break;
        }
        return builder;
    }
}
