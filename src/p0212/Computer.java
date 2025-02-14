package p0212;

public class Computer {

	private String cpu;
	private String hdd;
	private String ram;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + "]";
	}
}
