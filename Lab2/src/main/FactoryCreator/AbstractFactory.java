package main.FactoryCreator;

import main.HumanBuilder.HumanBuilder;
import main.HumanBuilder.Human;

import java.util.HashMap;
import java.util.Map;
import main.HumanBuilder.HumanType;

public abstract class AbstractFactory {
    public abstract HumanBuilder getHumanBuilder(HumanTypeSpecifications negroidBrownEyes);
    public static Map<HumanType, Human> prototypes = new HashMap<HumanType, Human>();

    public static Human getPrototype(HumanType humanType) {
        try {
              prototypes.put(humanType, new Human());
            return prototypes.get(humanType).clone();
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

}
