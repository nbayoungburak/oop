package tr.edu.maltepe.opp;


public class Main {
    public static void main(String[] args) {


        Student student1 = new Student();
        Professor professor1 = new Professor();
        SportsCenter maltepeSportsCenter = new SportsCenter();

        student1.swim(maltepeSportsCenter);
        professor1.goSportCenter(maltepeSportsCenter);
        student1.goSportCenter(maltepeSportsCenter);
        student1.swim(maltepeSportsCenter);
        professor1.playFootball(maltepeSportsCenter);
        maltepeSportsCenter.printPeopleInSportsCenter();
        maltepeSportsCenter.printPeopleInSwimmingPool();
        maltepeSportsCenter.printPeopleInFootballField();
        student1.playFootball(maltepeSportsCenter);
        student1.stopSwim(maltepeSportsCenter);
        student1.playFootball(maltepeSportsCenter);
        maltepeSportsCenter.printPeopleInFootballField();
        maltepeSportsCenter.printPeopleInSportsCenter();
        student1.exitSportCenter(maltepeSportsCenter);
        professor1.exitSportCenter(maltepeSportsCenter);
        maltepeSportsCenter.printPeopleInSportsCenter();
        maltepeSportsCenter.printPeopleInSwimmingPool();
        maltepeSportsCenter.printPeopleInFootballField();


    }
}