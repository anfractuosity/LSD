import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
public class GUI extends JFrame {


	 GUI() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		try {
			BufferedImage myPicture = ImageIO.read(new File("piet.jpg"));
			 Graphics2D g2d = myPicture.createGraphics();
			int x = myPicture.getWidth();
			int y = myPicture.getHeight();
		
			HashSet<Line> lines = new HashSet<Line>();


			double [] arr = myPicture.getData().getPixels(0,0,x,y,new double[x*y*3]);

			double [] arr2 = new double[x*y];
		
			System.out.println(arr.length);
			int c=0;
			for(int i = 0; i < arr.length-3; i+=3) {
				double B = arr[i];
				double G = arr[i+1];
				double R = arr[i+2];

				//R/=255.0;G/=255.0;B/=255.0;

				double level = R * 0.2126 + G * 0.7152 + B * 0.0722;



				arr2[c++] = level;
			}

			LSD lsd = new LSD();

		




			System.out.println(arr.length);

			double [] out = lsd.lsd(arr2,x,y);

			for(int i = 0; i < lsd.n_out; i++) {
				for (int j = 0; j < 7; j++)
				
				lines.add(new Line(out[7 * i + 0], out[7 * i + 1],
						out[7 * i + 2], out[7 * i + 3]));

			}

			
			for ( Line l : lines) {
				g2d.drawLine((int)l.x1,(int)l.y1,(int)l.x2,(int)l.y2);
				

			}


			System.out.println(lsd.n_out);
		 
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			
			add(picLabel);


		} catch (IOException e) {

		}
		

		

		setSize(600,600);

	        //Display the window.
        	setVisible(true);
	}


	public static void main(String [] args){
		new GUI();
	
	}


}
