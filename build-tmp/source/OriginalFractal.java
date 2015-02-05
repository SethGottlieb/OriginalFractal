import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

private double f = 5; 
public void setup() 
{   
	size(1200,900);    
} 
public void draw() 
{   
	background(0); 
	noFill();
	stroke(255);
	fractal((float)width/2, (float)height/2, (float)60);
} 
public void fractal(float x,float y, float d) 
{    
	double endTop = y - 2*d;
	double endBottom = y + 2*d;
	double endLeft = x - 2*d;
	double endRight = x + 2*d;
	ellipse(x, y, d, d);
	if(d > 35)
	{
		fractal((float)(endLeft), y, (float)(d-f)); 
		fractal((float)(endRight), y, (float)(d-f)); 
		fractal(x, (float)(endTop), (float)(d-f)); 
		fractal(x, (float)(endBottom), (float)(d-f)); 
	}
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
