import acm.graphics.*;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
	
	// Instance Variables:
	
	public static int width;
	public static int height;
	public static int[][] originalArray;
	public static int[][] newArray;
	
	GImage milkMaid = new GImage("Vermeer_Milkmaid.jpg");
	
	// Run Method:
	
	public void run() {
		add(flipHorizontal(milkMaid));
	}
	
	// Class Method:
	
	private GImage flipHorizontal(GImage image) {
		// Original image array
		originalArray = image.getPixelArray();
		// Same as original, but we'll be changing it
		newArray = image.getPixelArray();
		
		width = originalArray[0].length;
		height = originalArray.length;
		
		for (int yPos = 0; yPos < height; yPos++) { // Gets the rows of pixels
			for(int horizontalBegin = 0; horizontalBegin < width; horizontalBegin++) {	// Goes through the row of pixels
				int horizontalEnd = width - horizontalBegin - 1;	
				newArray[yPos][horizontalBegin] = originalArray[yPos][horizontalEnd];
			}
		}
		return new GImage(newArray);
	}
}