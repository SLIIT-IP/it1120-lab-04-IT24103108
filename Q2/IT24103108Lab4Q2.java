import java.util.Scanner;

public class IT24103108Lab4Q2
{
    public static void main(String[] args)
    {
        int labm,labp,examm,examp;
        double finalm = 0;
        Scanner number = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        examm = number.nextInt();
        System.out.print("Please enter lab submission marks (out of 100): ");
        labm = number.nextInt();
        

        if (labm <= 100 && labm >= 0 && examm <= 100 && examm >= 0)
        { }

        else
        {   
            System.out.print("Invalid input for exam marks. Terminating progam.");
            
        }

        System.out.print("Please enter percentage given for the exam: ");
        examp = number.nextInt();
        System.out.print("Please enter percentage given for the lab submission: ");
        labp = number.nextInt();

        if ((examp + labp)!=100)
        {
            System.out.print("The percentages must add up to 100. Terminating program.");
            System. exit(0);
        }
        else
        {   
            finalm = ((examm * examp) / 100.0) + ((labm * labp) / 100.0);
            System.out.print("Final Exam Mark is : " + finalm );
        }
    }   
}