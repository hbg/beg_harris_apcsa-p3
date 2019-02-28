import java.io.IOException;

public class Runner {
	public static void main(String...strings) {
		try {
			User u = new User("apcsa");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
