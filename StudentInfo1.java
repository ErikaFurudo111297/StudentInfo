import java.util.Scanner;

public class StudentInfo1 {
    public static int TotalGrade(int Maths, int English, int CS){
        return Maths + English + CS;
    }
    public static void main(String[] args) {
        int StudentID;
        int Maths, English, CS;
        String FirstName, LastName;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your Student ID: ");
        StudentID = input.nextInt();

        System.out.print("Please enter your forename: ");
        FirstName = input.next();

        System.out.print("Please enter your surname: ");
        LastName = input.next();

        System.out.printf("Hello, %s %s!%n", FirstName, LastName);
        System.out.print("Please enter your grade for Maths: ");
        Maths = input.nextInt();

        System.out.print("Please enter your grade for English: ");
        English = input.nextInt();

        System.out.print("Please enter your grade for CS: ");
        CS = input.nextInt();

        int result = TotalGrade(Maths, English, CS);
        System.out.printf("Your total grade is %d/300.", result);
        input.close();
    }
}