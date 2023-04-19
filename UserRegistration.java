package cab_booking;

public class UserRegistration {
	
	private int userid;
	private long mobileno;
	private String username, email;
	
	
	
	public UserRegistration(int userid, long mobileno, String username, String email) {
		super();
		this.userid = userid;
		this.mobileno = mobileno;
		this.username = username;
		this.email = email;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
