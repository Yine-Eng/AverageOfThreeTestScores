import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
     //Introduce a scanner object called "keyboard".
     Scanner keyboard = new Scanner(System.in);
     
     //Declare variables for test scores and average.
     int firstTestScore,
         secondTestScore,
         thirdTestScore;
     double average;
       

     //Display a message to tell the user to input the first test score.
      System.out.println("Enter your first test score.");
     //Take user's entry for the first test score.
     firstTestScore = keyboard.nextInt();
     
     //Display user's entry for the first test score to the user.
     System.out.println("You entered "+ firstTestScore + " as your first test score.");
     
     //Display a message to tell the user to input the second test score.
     System.out.println("Enter your second test score.");
     //Take user's entry for the second test score.
     secondTestScore = keyboard.nextInt();
     
     //Display user's entry for the second test score to the user.
     System.out.println("You entered " + secondTestScore + " as your third test score");
     
     //Display a message to tell the user to input the third test score.
     System.out.println("Enter your third test score.");
     //Take the user's entry for the third test score
     thirdTestScore = keyboard.nextInt();
     
     //Display the user's entry for the third test score to the user.
     System.out.println("You entered " + thirdTestScore +" as your third test score");
     
     //Calculate the user's average for the three test scores.
     average = (firstTestScore + secondTestScore + thirdTestScore) / 3.0;
     
     /*Use if-else statements to get the user's grade range and display it with the respective letter grade.*/
     //Condition that will result in getting letter grade F.
     if (average < 60)
     {
       System.out.println("Your average for the three test " + " scores you entered is " + average + " and your letter grade" + " is F" );
     }
       //Condition tha will result in getting letter grade D.
     else if (average >= 60 && average <=69)
     {System.out.println("Your average for the three test " + "scores you entered is " + average + " and you letter grade " + "is D");
       }
     //Condition that will result in getting letter grade C.
       else if (average >= 70 && average <= 79)
       {System.out.println("Your average for the three test " + "scores you entered is " + average + " and your letter grade" + " is C");
       }
     //Condition that will result in getting letter grade B.
       else if (average >= 80 && average <= 89)
       {System.out.println("Your average for the three test " + " scores you entered is" + average + " and you letter grade" + " is B");
       }
     //Condition that will result in getting letter grade A.
       else if (average >= 90 && average <=100)
       {System.out.println("Your average for the three test" + " scores you entered is " + average + " and your letter grade " + "is A");
       }
     
       /*Let's introduce a last if-else statement to check users who input huge scores which are more than 100*/
       else {
         System.out.println("You entered score(s) which are greater than " + "100 for the test scores you entered. " + "This has made your average fall out of the 0-100 range. " + "Check your three entries and " + "re-run the code!");
       }
   }
}
