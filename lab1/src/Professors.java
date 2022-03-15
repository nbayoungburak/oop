public class Professors extends Person {

    Professors(String name, int age)
    {
        super(name, age);
    }

    public void teaching()
    {
        System.out.println(name + " is teaching OOP to his students.");
    }


}
