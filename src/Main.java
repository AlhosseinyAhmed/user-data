import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String name = getName();
       String age = getAge();
       String email = getEmail();
       String faculty = getFaculty();

        printName(name);
        printAge(age);
        printEmail(email);
       printFaculty(faculty);

    }

    private static String getName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter your name ");
        return scanner.next();
    }

    private static String getAge()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter your age ");
        return scanner.next();

    }

    private static String getEmail()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter your email ");
        return scanner.next();

    }

    private static String getFaculty()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your faculty ");
        return scanner.next();

    }

    private static void printName(String name)
    {
        System.out.println(" Your name is " + name);
    }

    private static void printAge(String age)
    {
        System.out.println(" Your age is " + age);
    }

    private static void printEmail(String email)
    {
        System.out.println(" Your email is " + email);
    }

    private static void printFaculty(String faculty)
    {
        System.out.println(" Your faculty is " + faculty);
    }

}