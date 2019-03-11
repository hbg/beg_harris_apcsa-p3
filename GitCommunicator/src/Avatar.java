import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class Avatar {
	private String sID;
	private int width, height, scale;
	
	public Avatar(int i, int j) {
		createRandomAvatar(i, j);
	}
	
	public Avatar(int i, int j, int k) {
		createRandomAvatar(i, j, k);
	}
	
	public void setVariables(int i, int j, Integer... k) {
		width = i;
		height = j;
		if (k.length != 0)
	    	 scale = k[0];
	     else
	    	 scale = 1;
	}
	public Object[] getVariables() {
		return new Object[] {sID, width, height, scale};
	}
	public void setStringID(String s) {
		sID = s;
	}
	public String getStringID() {
		return sID;
	}
	/**
	 *
	 *	@param width The width of the image (px)
	 *	@param height The height of the image (px)
	 *	@param optional Scales the image to preserve resolution (optional)
	 *	@author Harris
	 *	
	 *
	 */
	public void createRandomAvatar(int width, int height, Integer... optional) {
			//image dimension
			     //create buffered image object img
			     BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			     //file object
			     if (optional.length != 0)
			    	 scale = optional[0];
			     else
			    	 scale = 1;
			     setVariables(width, height, scale);
			     File f = null;
			     Random r = new Random();
			     int[][] px = new int[height/scale][width/scale];
			     Color c = new Color(r.nextInt(256), r.nextInt(256),r.nextInt(256));
			     //create random image pixel by pixel
			     for(int y = 0; y < height; y+=scale){
			       for(int x = 0; x < width/2; x+=scale){
			         int i = r.nextInt(2);
			         px[y/scale][x/scale] = i+x*y;
			         Color n = new Color(0);
			         if(r.nextInt(2) == 1) n = new Color(240, 240, 240);
			         else n = c;
			         for (int j=0; j<scale; j++) {
			        	 for (int j1=0; j1<scale; j1++) {
			        		 img.setRGB(x+j, y+j1, n.getRGB());
			        		 img.setRGB(width-1-(x+j), y+j1, n.getRGB());
			        	 }
			         }
			       }
			     }
			     String out = "";
			     for (int[] a1 : px) {
			    	 for (int i=0; i<a1.length; i+=1) {
			    		 out += (char) (a1[i] % 26 + 'a');
			    	 }
			    	 out+="\n";
			     }
			     setStringID(out);
			     
			     //write image
			     try{
			       f = new File("images/" + getMd5(out) + ".png");
			       ImageIO.write(img, "png", f);
			     }catch(IOException e){
			       System.out.println(e);
			     }
		  }
	//	Not my method, hence the bad code ;P. Just kidding... it's probably better than I could've done
	public static String getMd5(String input) 
    { 
        try { 
  
            MessageDigest md = MessageDigest.getInstance("MD5"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32)
                hashtext = "0" + hashtext; 
            return hashtext; 
        }  
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 

}