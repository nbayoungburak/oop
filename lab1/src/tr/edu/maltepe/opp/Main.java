package tr.edu.maltepe.opp;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

         final Scanner scan = new Scanner(System.in);
        {
            String nameOfProf;
            int ageOfProf;
            String nameOfStudent;
            int ageOfStudent;

            System.out.println("Enter the name of professor :");
            nameOfProf = scan.nextLine();
            System.out.println("Enter the age of professor :");
            ageOfProf = scan.nextInt();

            System.out.println("Enter the name of student :");
            nameOfStudent = scan.nextLine();
            System.out.println("Enter the age of student :");
            ageOfStudent = scan.nextInt();

            Professors professor1 = new Professors(nameOfProf, ageOfProf);
            Student student1 = new Student(nameOfStudent, ageOfStudent);

            professor1.Introduce();
            student1.Introduce();
            professor1.teaching();
            student1.learning();

        }

    }
}