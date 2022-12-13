package TemplatePattern;

public class SecondTypeOfHumanLyfecycle extends Human{
    @Override
    void growUp() {
        System.out.println("Grows up by the age of 18");
    }

    @Override
    void findAJob() {
        System.out.println("Finds a job at the age of 25");
    }

    @Override
    void becomeAParent() {
        System.out.println("Becomes a parent at the age of 26");

    }

    @Override
    void retire() {
        System.out.println("Retires at the age of 47");

    }
}
