public class Main {


    public static void main(String[] args) {

        static final Scanner scan = new Scanner(System.in);
        public static void main(String[] args);
        {
            String nameOfProf;
            int ageOfProf;
            String nameOfStudent;
            int ageOfStudent;

            System.out.println("Enter the name of professor :");
            System.out.println("Enter the age of professor :");


            System.out.println("Enter the name of student :");
            System.out.println("Enter the age of student :");


            Professors professor1 = new Professors(nameOfProf,ageOfProf);
            student student1 = new student(nameOfStudent,ageOfStudent);

            professor1.Introduce();
            student1.Introduce();
            professor1.teaching();
            student1.learning();



        }
}