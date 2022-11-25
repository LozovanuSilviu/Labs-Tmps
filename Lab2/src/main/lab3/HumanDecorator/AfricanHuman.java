package main.lab3.HumanDecorator;

public class AfricanHuman extends HumanDecorator{
    public AfricanHuman(IHuman human) {
        super(human);
    }

    @Override
    public void create() {
        super.create();
        System.out.print(" Adding characteristics of an African ");
    }
}
