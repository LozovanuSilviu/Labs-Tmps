package main.lab3.FactoryCreator;


import main.lab3.HumanBuilder.Human;
import main.lab3.HumanBuilder.HumanBuilder;
import main.lab3.HumanBuilder.HumanType;

import java.util.HashMap;
import java.util.Map;

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
