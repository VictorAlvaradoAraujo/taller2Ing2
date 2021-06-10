package labcodeinspection;

import java.util.logging.Logger;

/**
*
*
* @author Victor Alvarado
*/
public class Email {

	private String m_firstName; //NOPMD  
	private String m_lastName; //NOPMD   
	private String password = null; //NOPMD  
	private String department; //NOPMD  
	private int defaultpasswordLength = 8; //NOPMD  
	private String email;//NOPMD Correct

	public Email(String firstName, String lastName) {//NOPMD contructor correct
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	/**
	*
	*
	*  Function showInfo
	*/
	public void showInfo() {

		Logger.getLogger("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		Logger.getLogger("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	/**
	*
	*
	* @Function 
	*/
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
	    default: // empty case - this is interpreted as an intentional fall-through
	    	this.department = "null";
	    	break;
		}
	}

	private String randomPassword(final int length) {
		  String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*"; //NOPMD  
		char[] password = new char[length];//NOPMD  
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);//NOPMD  
		}
		return new String(password);
	}
	/**
	*
	*
	* public method 
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase() + this.m_lastName.toLowerCase()//NOPMD is simple damage
		+ "@" + this.department+ ".espol.edu.ec";
	}
}
