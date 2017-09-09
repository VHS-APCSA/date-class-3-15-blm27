public class Date 
{
	private int day;
	private int month;
	private int year;
	public Date()
	{
		this.day = 1;
		this.month = 1;
		this.year = 1900;			
	}
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
	public int getDay()
	{
		return day;
	}
	public void setMonth(int month)
	{
		this.month = month;
	}
	public int getMonth()
	{
		return month;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getYear()
	{	
		return year;
	}
	public void displayDate()
	{
		System.out.println(getMonth() + "/" + getDay() + "/" + getYear());
	}
}

