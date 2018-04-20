import java.awt.Color;
import java.util.Scanner;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class ProjectThree extends ImageUtils {
	public static void main(String[] args) {
			System.out.println("Hi look what color would you like to see this beatiful image: red, green, or blue?");
			
			Scanner sc = new Scanner(System.in);
			String color= sc.nextLine();
			
			if (color.equalsIgnoreCase("red")) {
				System.out.println("You chose the red one, once it is done editing just simply pick the red image!");
			} 
			else if (color.equalsIgnoreCase("green")) {
				System.out.println("You chose the green one, once it is done editing just simply pick the green image!");
			}
			else if (color.equalsIgnoreCase("blue")) {
				System.out.println("You chose the blue one, once it is done editing just simply pick the blue image!");
			}
			System.out.println("");
			System.out.println("Thank you! Have a great time viewing the images!");
			
			
			ImageUtils image = new ImageUtils();
			Color[][] original = image.loadImage("src/LennaCV.png");    
			image.addImage(original, "Original Image");
			Color[][] greenColor = GreenImage(original);
			image.addImage(greenColor, "Green Color" );
			Color[][] redColor = redImage(original);
			image.addImage(redColor, "Red Color" );
			Color[][] blueColor = blueImage(original);
			image.addImage(blueColor, "Blue Color" );
			image.display();
	}


		public static Color[][] GreenImage(Color[][] img){ 
			Color[][] tmp = ImageUtils.cloneArray(img);
			for(int i = 0; i < tmp.length; i++) {
				for(int j = 0; j < tmp[i].length; j++) {
					Color picture = img[i][j];
					int red = picture.getRed();
					int green = picture.getGreen();
					int blue = picture.getBlue();
					int r1 = red-(red-6);
					int g1 = green;
					int b1 = blue-(blue-9);				

					tmp[i][j] = new Color(r1,g1,b1);
			}
				
				}
			return tmp;
		}
		
			public static Color[][] redImage(Color[][] img){
				Color[][] tmp = ImageUtils.cloneArray(img);

				for( int i = 0; i < tmp.length; i++) {
					for( int j = 0; j < tmp[i].length; j++) {

						Color picture = img[i][j];

						int red = picture.getRed();
						int green = picture.getGreen();
						int blue = picture.getBlue();
						int r1 = red;
						int g1 = green - (green-6);
						int b1 = blue - (blue-9);

						tmp[i] [j] = new Color(r1,g1,b1);
				}
					}
				return tmp;
				}

			public static Color[][] blueImage(Color[][] img){
				Color[][] tmp = ImageUtils.cloneArray(img);

				for(int i = 0; i < tmp.length; i++) {
					for(int j = 0; j< tmp[i].length; j++) {
						Color picture = img[i][j];

					int red = picture.getRed();
					int green = picture.getGreen();
					int blue = picture.getBlue();
						int r1 = red-(red-6);
						int g1 = green-(green-9);
						int b1 = blue;

						tmp[i][j ]= new Color(r1,g1,b1);
				}
					}
				return tmp;
				
			} 
				}

