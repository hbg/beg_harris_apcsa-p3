import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class User {
	private String hiddenUsername;
	MongoClientURI uri = new MongoClientURI("mongodb://root:password1@ds155815.mlab.com:55815/eclipseworkspace");
	MongoClient mongoClient = new MongoClient(uri);
	MongoDatabase db = mongoClient.getDatabase(uri.getDatabase());
	MongoCollection<Document> users = db.getCollection("users");

	public User(String s) throws IOException {
		configureUser(s);
		retrieveUsers();
	}
	public void retrieveUsers() {
		MongoCursor<Document> cursor = users.find().iterator();
		while (!cursor.hasNext()) {
			Document d = cursor.next();
			assert d.get("username") != null;
		}
	}
	public void configureUser(String username) throws IOException {
		Avatar a = new Avatar(500, 500, 100); //	Creates an avatar image
		String hiddenUsername = a.getMd5(username);
		
		this.createUser(username, hiddenUsername, a);
	}
	private void createUser(String u, String hu, Avatar a) throws IOException {
		File f = new File( hu );
		if (f.mkdir()) {
			f = new File(hu + "/user.txt");
			FileWriter fw = new FileWriter(f);
			fw.write(hu + "\n" + u + "\n" + a.getMd5(a.getStringID()) + ".png\n");
			db.getCollection("users").insertOne(new Document("username", u).append("hash", hu).append("image_uri", a.getMd5(a.getStringID()) + ".png"));

		    
		}
		else {
			f = new File("fails.txt");
			FileWriter fw = new FileWriter(f);
			fw.append("Failed for user: " + hu + "/" + u + "\n");
			fw.close();
		}
		
	}
}
