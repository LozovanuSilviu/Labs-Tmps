package TemplatePattern;


public class FirstTypeOfHumanLifecycle extends Human
{
    @Override
    void growUp() {
        System.out.println("Becomes an adult by the age of 18");
    }
    @Override
    void findAJob() {
        System.out.println("Finds a job at the age of 15");
    }
    @Override
    void becomeAParent() {
        System.out.println("Becomes a parent at the age of 45");

    }
    @Override
    void retire() {
        System.out.println("Retires at the age of 38");
    }
}
