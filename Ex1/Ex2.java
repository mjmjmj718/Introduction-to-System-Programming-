public class Ex2
{
	public static void main(String arg[])
	{
		Time time = new Time();
		time.IncreSecond();
		System.out.println(time);

		for(int i = 0; i < 59; i++)
		{
			time.IncreSecond();
		}
		System.out.println(time);
		time.IncreSecond();
		System.out.println(time);
		
		System.out.println("===================");
		Time time1 = new Time(23,59,59);
		time1.IncreSecond();
		System.out.println(time1);
	}
}

class Time 
{
	private int hour;	
	private int minute;
	private int second;

	Time()
	{
		this.hour   = 0;
		this.minute = 0;
		this.second = 0;
	}

	Time(int hour, int minute, int second)
	{
		this.hour   = hour;
		this.minute = minute;
		this.second = second;
	}

	int getHour()
	{
		return this.hour;
	}

	int getMinute()
	{
		return this.minute;
	}

	int getSecond()
	{
		return this.second;
	}

	void IncreSecond()
	{
		if(++this.second == 60)
		{
			this.IncreMinute();
			this.second = 0;
		}
	}

	void IncreMinute()
	{
		if(++this.minute == 60)
		{
			this.IncreHour();
			this.minute = 0;
		}
	}

	void IncreHour()
	{
		if(++this.hour == 24)
		{
			this.hour   = 0;
			this.minute = 0;
			this.second = 0;
		}
	}

	public String toString()
	{
		return String.format("%02d", getHour()) + ":" + String.format("%02d", getMinute()) + ":" + String.format("%02d", getSecond());
	}
}

