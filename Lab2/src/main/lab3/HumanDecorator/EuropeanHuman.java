package main.lab3.HumanDecorator;

public class EuropeanHuman extends HumanDecorator{
    public EuropeanHuman(IHuman human) {
        super(human);
    }

    @Override
    public void create() {
        super.create();
        System.out.print(" Adding characteristics of an European ");
    }
}
