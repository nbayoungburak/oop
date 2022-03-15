public class Professors extends person {

    Professors(String name, int age)
    {
        super(name, age);
    }

    public void teaching()
    {
        System.out.println(name + " is teaching OOP to his students.");
    }


}
