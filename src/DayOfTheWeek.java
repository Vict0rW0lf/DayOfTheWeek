import java.util.Scanner;
 
enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}
 
public class DayOfTheWeek
{
    Day day;
 
    // Constructor
    public DayOfTheWeek(Day day)
    {
        this.day = day;
    }
 
    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day)
        {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
 
    public static void main(String[] args)
    {
    	String answer, upperCase;
        
    	Scanner kb = new Scanner(System.in);
    	
    	System.out.print("Ask about a day of the day: ");
    	
    	answer = kb.next();
    	
    	upperCase = answer.toUpperCase();
    	
    	DayOfTheWeek t1 = new DayOfTheWeek(Day.valueOf(upperCase));
        t1.dayIsLike();
        
        kb.close();
    }
}