package drawing;
import java.awt.image.*;
import java.util.*;

public class ImageLibrary {
	
	//// Attributes ////
	private static HashMap<String, BufferedImage> lib;
	
	//// Methods ////
	public static BufferedImage getImage(String s){
		return lib.get(s);
	}
	public static void insertImage(String fileName, String imageName){
		// TODO
	}
	public static void insertAnimatedImage(String fileName, String imageName){
		// TODO
	}

}
