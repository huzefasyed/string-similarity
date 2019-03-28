/**
 Class which contains all the code.
 @author Huzefa Syed
 @Version 1.0  28/03/2019


 */
import java.math.BigDecimal;
import java.util.Scanner;

public class LoveCalc {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the love calculator");


     //Takes the users input for the first person

        String person1;
        System.out.println("Enter the name of the first person: ");
        person1 = userInput.next();


         // Takes the users input for the second person.

        String person2;
        System.out.println("Enter the name of the second person");
        person2 = userInput.next();

        float person1sum = 0;
        float person2sum = 0;

        // This will loop through all the characters within the String,
        // the charAt will be used to get the values.
        person1sum = getPersonsum(person1, person1sum);

        person2sum = getPersonsum(person2, person2sum);

        if(person2sum < person1sum) {
            float temp = person1sum;
            person1sum = person2sum;
            person2sum = temp;
        }

        float result = person1sum/person2sum*100;
        System.out.println("The love calculator says: " + person1 +  " and " + person2 + " love each other by: " + round(result, 1) + "%");
    }
// Rounds float to 1 decimal place.
    public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd;
    }
    // Iterates through the contents of Person1+Person2 and add thems together. Method was made to avoid code duplication.
    private static float getPersonsum(String person, float personsum) {
        for (int i = 0; i < person.length(); i++) {
            char c = person.charAt(i);
            int y = c;
            personsum += y;
        }
        return personsum;
    }
}