//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		setPassword("");
	}
	public PasswordCheck(String pw) {
		setPassword(pw);
	}
	public void setPassword(String pw) {
		password = pw;
	}

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		String attempt = "";
		do {
			System.out.println("Enter the password ::");
			attempt = keyboard.next();
			System.out.println(attempt.equals(password) ? "VALID" : "INVALID");
		} while (!attempt.equals(password));
	}
}