import java.util.Scanner;

enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}

public class PickDay {
	
	Scanner kb = new Scanner(System.in);
	String answer;
	Day day;
    
	public void setAnswer(){
		System.out.println("What is your favorite day of the week? ");
		String answer = kb.next();
		String upperCase = answer.toUpperCase();			
		this.answer = upperCase;	
	}
	
	public String getAnswer(){
		return answer;		
	}
	
	public static boolean contains(String test) {

	    for (Day c : Day.values()) {
	        if (c.name().equals(test)) {
	            return true;
	        }
	    }

	    return false;
	}	
    
    public void check(){
    	while(contains(answer) == false){
    		System.out.println("Oops, that's not a valid input!");
    		setAnswer();
    	}
    }

	public void dayIsLike(Day day)
    {	
		this.day = day;
		
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
}
 