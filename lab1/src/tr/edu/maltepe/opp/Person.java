package tr.edu.maltepe.opp;

public class Person {

    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void Introduce(){System.out.println("My name is " + this.name +" I am "+ this.age +" years old");}

}

