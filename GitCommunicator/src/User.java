import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class User {
	private String hiddenUsername;
	public User(String s) throws IOException {
		configureUser(s);
	}
	
	public void configureUser(String username) throws IOException {
		Avatar a = new Avatar(512, 512, 64); //	Creates an avatar image
		String hiddenUsername = a.getMd5(username);
		this.createUser(username, hiddenUsername, a);
	}
	private void createUser(String u, String hu, Avatar a) throws IOException {
		File f = new File( hu );
		if (f.mkdir()) {
			f = new File(hu + "/user.txt");
			FileWriter fw = new FileWriter(f);
			fw.write(hu + "\n" + u + "\n" + a.getMd5(a.getStringID()) + ".png\n");
			Desktop dt = Desktop.getDesktop();
		    dt.open(new File("images/" + a.getMd5(a.getStringID()) + ".png"));
		    new ProcessBuilder("rundll32 url.dll,FileProtocolHandler", "images/" + a.getMd5(a.getStringID()) + ".png").start();
			fw.close();
		}
		else {
			f = new File("fails.txt");
			FileWriter fw = new FileWriter(f);
			fw.append("Failed for user: " + hu + "/" + u + "\n");
			fw.close();
		}
		
	}
}
