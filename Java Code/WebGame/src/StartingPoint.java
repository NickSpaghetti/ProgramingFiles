import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class StartingPoint extends Applet implements Runnable {
	int x = 400;
	int y = 25;
	int dx = 2;
	int dy = 1;
	int radius = 20;
	private Image i;
	private Graphics doubleG;
	
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		setSize(800,600);
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		Thread thread = new Thread(this); //makes a new thread and refers to this as the start thread.
		thread.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//thread information
		while (true){
			if(x + dx > this.getWidth()-radius-1){//if x + change in x (dx) greater than the witdh of the applet than stop.
				x = this.getWidth() - radius-3;//makes it so all the pix are touching the wall
				dx = -dx;//makes the ball bounce off the wall
			}else if(x + dx  < 0 + radius){// if x plus change of x (dx) is less than 0 + radius boucse off the wall.
				x = 0 + radius;//statement to make x = to radius.
				dx = -dx;//makes it bounce off the wall.
			
			}else{
				x+=dx;//keep going.
			}
			
			if(y + dy > this.getHeight()-radius-1){//if y + change in y (dy) greater than the witdh of the applet than stop.
				y = this.getHeight() - radius-3;//makes it so all the pix are touching the wall
				dy = -dy;//makes the ball bounce off the wall
			}else if(y + dy  < 0 + radius){// if y plus change of y (dx) is less than 0 + radius boucse off the wall.
				y = 0 + radius;//statement to make y = to radius.
				dy = -dy;//makes it bounce off the wall.
			
			}else{
				y+=dy;//keep going.
			}
			x += dx;
			y += dy;
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	public void update(Graphics g) { //double buffer code
		if(i == null ){
			i = createImage(this.getSize().width, this.getSize().height);
			//^this line of code gets the (800,600) size from the init Method.
			doubleG = i.getGraphics();//this sets doubleG = to i(image), and it gets the graphics of this image
			//^this type of update is know as double buffer.
		}
		//this stops the flickering in the image of the image.
		doubleG.setColor(getBackground());//this gets the background color of the applet.
		doubleG.fillRect(0, 0, this.getSize().width, this.getSize().height);//fills the Rect with the same size as our default applet.
		
		doubleG.setColor(getForeground());
		paint(doubleG);
		
		g.drawImage(i,0,0,this);
	}
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.CYAN);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}

	

}
