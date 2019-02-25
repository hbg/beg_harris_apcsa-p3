import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;

public class Cases {
	private ArrayList<Object> cases = new ArrayList<Object>();
	private File f;
	public ArrayList<Object> getCases() {
		return cases;
	}
	public Cases() {};
	public Cases(ArrayList<Object> o) {
		setCases(o);
	}
	public File getFile() {
		return f;
	}
	public void setCases(ArrayList<Object> o) {
		cases = o;
	}
	
	public void appendCases(ArrayList<Object> o) {
		cases.add(o);
	}
	
	public void appendObject(Object o) {
		cases.add(o);
	}
	public void removeObject(Object o) {
		cases.remove(o);
	}
	public void readCaseByLine(Scanner scanner) {
		while (scanner.hasNextLine())
			cases.add(scanner.nextLine());
	}
	public void readCaseByLine(File f) throws FileNotFoundException {
		Scanner scanner = new Scanner(f);
		while (scanner.hasNextLine())
			cases.add(scanner.nextLine());
	}
	public void readCaseByLine() throws FileNotFoundException {
		Scanner scanner = new Scanner(f);
		while (scanner.hasNextLine())
			cases.add(scanner.nextLine());
	}
	public boolean equalsOutput(File f, Object[] output) throws FileNotFoundException {
		Scanner scanner = new Scanner(f);
		int i = 0;
		while (scanner.hasNextLine()) {
			if (!scanner.nextLine().equals(output[i])) return false;
			i+=1;
		}
		return true;
	}
	
	public void createDialog() throws FileNotFoundException {

		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			readCaseByLine(selectedFile);
		}
	}
	
	public void createCaseFile(String name) throws FileNotFoundException {
		File f = new File(System.getProperty("user.dir") + "/" + name);
		try {
			f.createNewFile();
			this.f = f;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String toString() {
		String out = "[";
		for (int i = 0; i<cases.size(); i++)
			out+= ((i==cases.size()-1) ? "(\"CASE " + i + "\", \"" + cases.get(i) + "\")" : "(\"CASE " + i + "\", \"" + cases.get(i) + "\"), ");
		return out + "]";
	}
}
