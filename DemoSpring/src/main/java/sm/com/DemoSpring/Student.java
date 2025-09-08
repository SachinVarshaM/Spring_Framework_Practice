package sm.com.DemoSpring;

public class Student {

	private int stdid;
	private String stdname;
	private String stdaddress;
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getStdaddress() {
		return stdaddress;
	}
	public void setStdaddress(String stdaddress) {
		this.stdaddress = stdaddress;
	}
	public Student(int stdid, String stdname, String stdaddress) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdaddress = stdaddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdaddress=" + stdaddress + "]";
	}
	
	
}
