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