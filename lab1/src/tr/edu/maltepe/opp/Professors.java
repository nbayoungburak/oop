package tr.edu.maltepe.opp;

public class Professors extends Person
{

    //CONSTRUCTORS
    public Professors() {}
    public Professors(String name, int id) {super(name, id);}
    public Professors(String name, int id, boolean isInSportCenter, boolean isInSwimmingPool, boolean isInFootballField)
    {
        super(name, id, isInSportCenter, isInSwimmingPool, isInFootballField);
    }


    public void
    {
        System.out.println("Professor " + getName());
    }



}