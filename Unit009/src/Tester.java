import java.io.FileNotFoundException;

public class Tester {
	public static void main(String... args) throws FileNotFoundException {
		Cases c =new Cases();
		c.createCaseFile("test.txt");
		c.createDialog();
		System.out.println(c);
	}
}
