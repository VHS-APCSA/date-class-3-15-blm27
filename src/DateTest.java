public class DateTest {
	  public static void main( String args[] )
	  {
		  Date date = new Date(1, 1, 1990);
		  date.setMonth(1);
		  date.setDay(1);
		  date.setYear(2000);
		  System.out.println( "The date is:" );
		  date.displayDate();
	  }
}
