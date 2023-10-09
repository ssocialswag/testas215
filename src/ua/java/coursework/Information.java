package ua.java.coursework;

public class Information {

    public  void makeNoise() {

        Person slavik = new Person("General manager - Koziuchko Vyacheslav Vyacheslavovich");
        slavik.display();
        Person manager = new Manager("General manager - Koziuchko Vyacheslav Vyacheslavovich", "The  market ---RENT market--- is one of the most promising markets for people who want to rent premises so that it can be without any problems, please call: phone number-0968372901");
        manager.display();
    }
}
class Person {

    String name;

    public String getName() { return name; }

    public Person(String name){

        this.name=name;
    }

    public void display(){

        System.out.printf("Person %s \n", name);
    }
}

class Manager extends Person{

    String manager;

    public Manager(String name, String information) {

        super(name);
        this.manager = information;
    }
    @Override
    public void display(){

        System.out.printf(" %s now %s \n", super.getName(), manager);
    }
}