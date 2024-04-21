package application;

public class UserInfo {

	private String Name;
	private int IC;
	private int HpNo;
	private String Email;
	private String UserID;

	// Default Constructor
	public UserInfo() {

	}

	public UserInfo(String nm, int ic, int hpno, String em, String uid) {
		Name = nm;
		IC = ic;
		HpNo = hpno;
		Email = em;
		UserID = uid;
	}

	// Set & Get Name
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	// Set & Get IC
	public int getIC() {
		return IC;
	}

	public void setIC(int iC) {
		IC = iC;
	}

	// Set & Get HpNo
	public int getHpNo() {
		return HpNo;
	}

	public void setHpNo(int hpNo) {
		HpNo = hpNo;
	}

	// Set & Get Email
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	// Set & Get UserID
	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	// ToString
	public String toString() {
		return ("Name: " + Name + "IC: " + IC + "PhoneNo: " + HpNo + "Email: " + Email + "UserID: " + UserID);
	}

}
