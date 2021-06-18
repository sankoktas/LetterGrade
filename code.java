/** Translates a letter grade into a number grade.
 * @author (Fikri Şan Köktaş)
 * @version (16 December 2020)*/
import java.util.Scanner;
public class KFS_LetterGrade_Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a letter grade: ");
        String grade = in.nextLine();
        String A; String B; String C; String D; String F;
        if (grade.equals("A") || grade.equals("A+"))
        {
            System.out.println("4.0");
        }
        else if (grade.equals("A-"))
        {
            System.out.println("3.7");
        }
        else if (grade.equals("B"))
        {
            System.out.println("3");
        }
        else if (grade.equals("B+"))
        {
            System.out.println("3.3");
        }
        else if (grade.equals("B-"))
        {
            System.out.println("2.7");
        }
        else if (grade.equals("C"))
        {
            System.out.println("2");
        }
        else if (grade.equals("C+"))
        {
            System.out.println("2.3");
        }
        else if (grade.equals("C-"))
        {
            System.out.println("1.7");
        }
        else if (grade.equals("D"))
        {
            System.out.println("1");
        }
        else if (grade.equals("D+"))
        {
            System.out.println("1.3");
        }
         else if (grade.equals("D-"))
        {
            System.out.println("0.7");
        }
        else if (grade.equals("F"))
        {
            System.out.println("0");
        }
        else 
        {
            System.out.println("What you entered is not a valid letter grade.");
        }
    }
}
