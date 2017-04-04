import java.util.Scanner;

public class DayOfTheWeek{
 
    public static void main(String[] args)
    {
    	String answer, upperCase;
        
    	Scanner kb = new Scanner(System.in);
    	
    	System.out.print("Ask about a day of the day: ");
    	
    	answer = kb.next();
    	
    	upperCase = answer.toUpperCase();
    	
    	PickDay pick = new PickDay(Day.valueOf(upperCase));
        pick.dayIsLike();
        
        kb.close();
    }
}