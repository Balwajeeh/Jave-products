
public class Time1 {
	private int hour;
	private int minute;
	private int second;
	public void setTime(int hour, int minute, int second) {
		if (hour<0||hour>=24||minute<0||minute>=60||second<0||second>=60) {
			throw new IllegalArgumentException("hour, minute and/or second was out of range");
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		
			
	}
	public String toUniversalString() {
		return String.format("%O2d:%O2d:%O2d", hour, minute,second);
	}
	public String toString() {
		return String.format("%d:%O2d:%O2d %s",
				((hour==0||hour==12)?12:hour%12),
				minute, second, (hour<12?"AM":"PM"));
	}

}
