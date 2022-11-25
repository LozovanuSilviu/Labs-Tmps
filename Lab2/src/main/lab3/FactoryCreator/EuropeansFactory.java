package main.lab3.FactoryCreator;


import main.lab3.HumanBuilder.CaucasoidBlondHairBuilder;
import main.lab3.HumanBuilder.CaucasoidBlueEyesBuilder;
import main.lab3.HumanBuilder.HumanBuilder;

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
