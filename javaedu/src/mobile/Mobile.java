package mobile;

public  abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {
		
	}
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public abstract void operate(int rtme);
	public abstract void charge(int time);
	
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getbatterySize() {
		return batterySize;
	}
	public void setbatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getosType() {
		return osType;
	}
	public void setosType(String osType) {
		this.osType = osType;
	}
}
