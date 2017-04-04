public class DayOfTheWeek{
 
    public static void main(String[] args)
    {
    	PickDay pick = new PickDay();
    	
    	pick.setAnswer();
    	pick.check();
    	pick.dayIsLike(Day.valueOf(pick.getAnswer()));
    }
}