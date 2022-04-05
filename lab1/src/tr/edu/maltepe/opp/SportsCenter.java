package tr.edu.maltepe.opp;

import java.util.Vector;

public class SportsCenter
{
    private Vector <Person> PeopleInSportsCenter = new Vector<>();
    private Vector <Person> SwimmingPool = new Vector<>();
    private Vector <Person> FootballField = new Vector<>();

    public void printPeopleInSportsCenter()
    {
        if(PeopleInSportsCenter.size()>0)
        {
            System.out.println("People list of sports center :");
            for (Person person : PeopleInSportsCenter)
            {
                System.out.println(person.getName());
            }
        }
        else
            System.out.println("There is no one in sports center!");
    }

    public void printPeopleInSwimmingPool()
    {
        if(SwimmingPool.size()>0)
        {
            System.out.println("People list of in swimming pool :");
            for (Person person : SwimmingPool)
            {
                System.out.println(person.getName());
            }
        }
        else
            System.out.println("There is no one in swimming pool!");
    }

    public void printPeopleInFootballField()
    {
        if(FootballField.size()>0)
        {
            System.out.println("People list of in football field :");
            for (Person person : FootballField)
            {
                System.out.println(person.getName());
            }
        }
        else
            System.out.println("There is no one in football field!");
    }



    public Vector<Person> getPeopleInSportsCenter()
    {
        return PeopleInSportsCenter;
    }
    public void setPeopleInSportsCenter(Vector<Person> peopleInSportsCenter)
    {
        PeopleInSportsCenter = peopleInSportsCenter;
    }

    public Vector<Person> getSwimmingPool()
    {
        return SwimmingPool;
    }
    public void setSwimmingPool(Vector<Person> swimmingPool)
    {
        SwimmingPool = swimmingPool;
    }

    public Vector<Person> getFootballField()
    {
        return FootballField;
    }
    public void setFootballField(Vector<Person> footballField)
    {
        FootballField = footballField;
    }

}