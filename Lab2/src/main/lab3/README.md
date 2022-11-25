### Author: *Garciu Eugenia*
# Topic: *Structural Design Patterns*

## Theory :
Structural design patterns are :

   * Adapter
   * Bridge
   * Composite
   * Filter
   * Decorator
   * Facade
   * Fly-weight
   * Proxy
## Implementation :
In this project I've implemented 4 structural design patterns i.e. (Adapter, Composite, Decorator and Proxy).
The idea of the project remained the same. The main object of attention remained human being. 

__1. Adapter__ 

For the _**Adapter**_ pattern I have 2 main classes:  _**HumanAdapter**_ and _**HumanBuilderImplementation**_ . In the _**HumanBuilderImplementation**_ class I check whether the specified human gender is correct, if yes, I create an adapter and invoke build method implemented in _**HumanAdapter**_ class. In the adapter class based on gender I create an object of one of the specified classes _**ManBuilder**_ and _**WomanBuilder**_. Based on gender provided, using _**AdvancedHumanBuilder**_ interface implemented in Man and Woman builder classes, I define his or her eye color: 

Below you can see how the builder is used by the output of a program:

![](/Lab2/screenshots/Adapter.png)

__2. Decorator__ 

Here I have the _**IHuman**_ interface in which I specify that all human beings should implement the  _**create()**_ method. In  _**OrdinaryHuman**_ class I have the basic implementation, but to be able to modify it at runtime I've added the  _**HumanDecorator**_ abstract class which then is extended by  _**AfricanHuman**_ and _**EuropeanHuman**_ classes. There I kind of add some appropriate characteristics of a specified human type to an ordinary human being. 

As you can see on the screenshot, here I create an ordinary human being and add specified human type characteristics.

![](/Lab2/screenshots/Adapter.png)

__3. Proxy__ 

For the proxy design pattern I have _**HumanPassportDetails**_ interface which is implemented in both _**PassportDetailsAnnouncement**_ and _**ProxyPassportDetailsAnnouncement**_ classes. So, once instantiated in Main, _**ProxyPassportDetailsAnnouncement**_ class ensures that the client can't do anything out of order with the original class since all of his requests pass through our proxy class. Here we have that passport details once loaded can be displayed immediately without being loaded again.

Screenshot of the output:

![](/Lab2/screenshots/Proxy.png)

__4. Composite__

The last attribute in _**HumanInfo**_ class which is the list of group members is used in the _**Composite Pattern**_. The _**Composite Pattern**_ is used when we need a way to treat a whole group of objects in a similar manner. In my case I have people of different age which can be grouped and treated in a simmilar way, I have created age groups in which are present those people defined in a common list, depending on age criteria.

Screenshot of an output is presented below: 

![](/Lab2/screenshots/Composite.png)