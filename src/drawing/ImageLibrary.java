package drawing;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;

public class ImageLibrary {
	
	//// Attributes ////
	private static HashMap<String, BufferedImage> lib;
	
	//// Methods ////
	public static BufferedImage getImage(String s){
		return lib.get(s);
	}
	public static void insertImage(String fileName, String imageName){
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File(fileName));
		    lib.put(imageName, img);
		} catch (IOException e) {
			System.out.println(fileName + " failed to load\n" + imageName + " set to null.");
			lib.put(imageName, null);
		}
	}
	public static void insertAnimatedImage(String fileName, String imageName){
		// TODO
	}
	
	public ImageLibrary(){
		// Load images
		lib = new HashMap<String, BufferedImage>();
		insertImage("images/oyster.png", "oyster");
		insertImage("images/pollutant.png", "pollutant");
		insertImage("images/larvae.png", "larvae");
		insertImage("images/invasive_item.png", "invasive_item");
		insertImage("images/oyster_tower.png", "oyster_tower");
		insertImage("images/pollutant_tower.png", "pollutant_tower");
		insertImage("images/invasive_item_tower.png", "invasive_item_tower");
	}

}
