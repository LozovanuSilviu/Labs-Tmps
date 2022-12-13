package FactoryCreator;

import HumanBuilder.HumanBuilder;
import HumanBuilder.CaucasoidBlondHairBuilder;
import HumanBuilder.CaucasoidBlueEyesBuilder;

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
