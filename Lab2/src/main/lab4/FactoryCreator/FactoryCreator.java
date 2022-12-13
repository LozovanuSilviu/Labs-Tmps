package FactoryCreator;

import HumanBuilder.HumanType;

public final class FactoryCreator<factory> {
    private static  FactoryCreator instance;
    public static FactoryCreator getInstance() {
        if (instance == null) {
            synchronized (FactoryCreator.class) {
                if (instance == null) {
                    instance = new FactoryCreator();
                }
            }
        }
        return instance;
    }
    public AbstractFactory getHumanTypeBuilder(HumanType humanType){
        switch (humanType) {
            case African:
                return new AfricansFactory();
            case Asian:
                return new AsiansFactory();
            case European:
                return new EuropeansFactory();
            default:
                return null;
        }
    }

}
