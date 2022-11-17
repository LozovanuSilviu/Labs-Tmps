# Topic: *Creational Design Patterns*
### Author: *Lozovanu Silviu*
------
## Theory :
Creational design patterns are :

   * Singleton
   * Builder
   * Prototype
   * Factory Method
   * Abstract Factory
   
## Implementation :
In this project I've implemented 5 creational design patterns i.e. (Singleton, Builder, Prototype, Factory Method and Abstract Factory) with the emphasis on the fundamental object _**Player**_. The player class contains 4 attributes and the *get* and *set* methods as you can see in *Player.java* file. Also in that file is a method called *clone()* which is used to return a clone of the object if it exists in the *HashMap* which I'm maintaining in _**AbstractFactory**_ class.

The simplest DP, Singleton I've implemented in _**FactoryCreator**_ class. Then I declare the constructor as private so that the class could be instantiated only from _getInstance()_ method which is a static one and by a simple if i.e. : 
~~~
if (instance == null) {
    synchronized (FactoryCreator.class) {
        if (instance == null) {
            instance = new FactoryCreator();
        }
    }
 }
 ~~~
*The builder DP ensures that a program can create different objects by the same creational process. In my project there are 2 stages to create the player. First is chosen the factory by human type and then in the coresponding factory is chosen a builder class. 

*Prototype DP I have implemented in Abstract Factory class and invoke it in Main class checking whether I have such a prototype already created and just clone it, in my case I don't create any, so it returns null pointer exception.

*The factory methods that I've used in my project are in _**HumanBuilder**_ class. There are multiple classes which inherit the top one.Then depending on human type specification parameter it is chosen one of them.

*I have the factories which get the corresponding builder for each human type. These factories extend the _**AbstractFactory**_ which is being used in _**FactoryCreator**_ class. 

The process from _**FactoryCreator**_ is in the following lines in _**Main**_:
~~~
 FactoryCreator creator = FactoryCreator.getInstance();
         AbstractFactory humanFactory = creator.getHumanTypeBuilder(HumanType.African);
         HumanBuilder humanBuilder = humanFactory.getHumanBuilder(HumanTypeSpecifications.negroidBrownEyes);
~~~

