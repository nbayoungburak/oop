package tr.edu.maltepe.opp;

public class Person {

    public String name;
    public int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }





    public void Introduce(){System.out.println("My name is " + this.name +" I am "+ this.age +" years old");}

}

