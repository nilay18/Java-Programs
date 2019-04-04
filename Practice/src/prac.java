import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class prac {
	public static void  main(String[] args)
	{
		Clock clk = Clock.systemDefaultZone();
		System.out.println(clk);
		System.out.println(clk.millis());
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		System.out.println(LocalDate.now());	
		System.out.println(LocalTime.now());
	}
}
