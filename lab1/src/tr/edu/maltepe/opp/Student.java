package tr.edu.maltepe.opp;

public class Student extends Person
{


    public Student() {}
    public Student(String name, int id) {super(name, id);}
    public Student(String name, int id, boolean isInSportCenter, boolean isInSwimmingPool, boolean isInFootballField)
    {
        super(name, id, isInSportCenter, isInSwimmingPool, isInFootballField);
    }



}
