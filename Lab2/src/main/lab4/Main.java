import Composite.HumanInfo;
import FactoryCreator.AbstractFactory;
import FactoryCreator.FactoryCreator;
import FactoryCreator.HumanTypeSpecifications;
import HumanAdapter.HumanBuilderImplementation;
import HumanBuilder.Human;
import HumanBuilder.HumanBuilder;
import HumanBuilder.HumanType;
import HumanDecorator.AfricanHuman;
import HumanDecorator.EuropeanHuman;
import HumanDecorator.IHuman;
import HumanDecorator.OrdinaryHuman;
import Proxy.HumanPassportDetails;
import Proxy.ProxyPassportDetailsAnnouncement;
import Strategy.Adolescent;
import Strategy.Adult;
import Strategy.Senior;
import TemplatePattern.FirstTypeOfHumanLifecycle;
import TemplatePattern.SecondTypeOfHumanLyfecycle;

public class Main {
    public static void main(String[] args) {
        /*Prototype creational design pattern*/
        System.out.println("------------Prototype creational design pattern");
        Human prototype = AbstractFactory.getPrototype(HumanType.European);
        if (prototype != null) {
            System.out.println("Prototype found!");
            prototype.setEyeColor("blue");
            prototype.setHairColor("blond");
            System.out.println(prototype.toString());
        }
        System.out.println("-----------------------------------------");

        /*Factory and Abstract Factory creational design patterns*/
        /*Singleton creational design pattern is presented in FactoryCreator class*/
        System.out.println("------------Factory and Abstract Factory creational design patterns");
        FactoryCreator creator = FactoryCreator.getInstance();
        AbstractFactory humanFactory = creator.getHumanTypeBuilder(HumanType.African);
        HumanBuilder humanBuilder = humanFactory.getHumanBuilder(HumanTypeSpecifications.negroidBrownEyes);
        ((HumanBuilder) humanBuilder).specifySkinColor("dark");
        humanBuilder.specifyHairColor("brunette");
        humanBuilder.returnHumanDescription();
        System.out.println(humanBuilder.getHuman().toString());
        System.out.println("-----------------------------------------");

        /*Adapter structural design pattern*/
        System.out.println("------------Adapter structural design pattern");
        HumanBuilderImplementation builderImpl = new HumanBuilderImplementation();

        builderImpl.build("Woman", "Blue");
        builderImpl.build("Man", "Green");
        builderImpl.build("ОНО", "brown");

        System.out.println("-----------------------------------------");

        /*Decorator structural design pattern*/
        System.out.println("------------Decorator structural design pattern");

        IHuman europeanHuman = new EuropeanHuman(new OrdinaryHuman());
        europeanHuman.create();
        System.out.println("\n");

        IHuman africanHuman = new AfricanHuman(new EuropeanHuman(new OrdinaryHuman()));
        africanHuman.create();
        System.out.println("-----------------------------------------");

        /*Proxy structural design pattern*/
        System.out.println("------------Proxy structural design pattern");

        HumanPassportDetails passportDetails = new ProxyPassportDetailsAnnouncement("MoldavianPassport");

        passportDetails.printPassportDetails();
        passportDetails.printPassportDetails();

        System.out.println("-----------------------------------------");

        /*Composite structural design pattern*/
        System.out.println("------------Composite structural design pattern");
        HumanInfo human1 = new HumanInfo("Hina", "Asian", 18);
        HumanInfo human2 = new HumanInfo("Scott", "African American", 15);
        HumanInfo human3 = new HumanInfo("Andrew", "European", 33);
        HumanInfo human4 = new HumanInfo("Jorge", "Latino", 30);
        HumanInfo human5 = new HumanInfo("Juliette", "American", 10);
        HumanInfo human6 = new HumanInfo("Rebecca", "African American", 40);


        human4.addGroupmate(human6);
        human4.addGroupmate(human3);

        human2.addGroupmate(human5);
        human2.addGroupmate(human1);

        System.out.println(human2);
        for (HumanInfo youngAgeHumanGroup : human2.getGroup()) {
            System.out.println("Young age group: " + youngAgeHumanGroup);
        }
        for (HumanInfo middleAgeHumanGroup : human4.getGroup()) {
            System.out.println("Middle age group: " + middleAgeHumanGroup);
        }
        System.out.println("-----------------------------------------");

        /*Template behavioral design pattern*/

        TemplatePattern.Human firstType = new FirstTypeOfHumanLifecycle();
        System.out.println("Construct first type of human lifecycle:");
        firstType.live();

        TemplatePattern.Human secondType = new SecondTypeOfHumanLyfecycle();
        System.out.println("\nConstruct second type of human lifecycle:");
        secondType.live();

        System.out.println("-----------------------------------------");

        /*Iterator behavioral design pattern*/

        Iterator.HumanRepository humanRepository = new Iterator.HumanRepository();

        for (Iterator.Iterator iterator = humanRepository.getIterator();
             iterator.hasNext(); ) {
            String humanName = (String) iterator.next();
            System.out.println("Person: " + humanName);
        }


        System.out.println("-----------------------------------------");

        /*Strategy behavioral design pattern*/

        Strategy.BuildContext buildContext = new Strategy.BuildContext(new Adolescent());
        System.out.println("Searching for an adolescent: " + buildContext.executeStrategy(18));

        buildContext = new Strategy.BuildContext(new Adult());
        System.out.println("Searching for an adult: " + buildContext.executeStrategy(35));

        buildContext = new Strategy.BuildContext(new Senior());
        System.out.println("Searching for a senior: " + buildContext.executeStrategy(67));
    }
}
