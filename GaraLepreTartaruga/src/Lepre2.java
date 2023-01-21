import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.awt.event.*;
import java.awt.geom.*;
import static java.lang.Math.*;


public class Lepre2 extends JPanel implements ActionListener{
	private Random ran = new Random();
	  private int x, y, itar, ilep ;
	  private int val ;
	  private Timer timer ;
	  private GeneralPath tartaruga = new GeneralPath();
	  private GeneralPath lepre = new GeneralPath();
	  private boolean stop = false ;
	    
	  public void paintComponent(Graphics g)
	  { super.paintComponent(g);
	    Graphics2D g2d = (Graphics2D) g;
	    g2d.setBackground(Color.WHITE);
	    g2d.setColor(Color.BLUE);
	    // g.drawArc(50,30,850,850,90,90);
	    g2d.draw(new Arc2D.Double(100,100,650,650,90,90,Arc2D.PIE));
	    val=ran.nextInt(10) + 1 ;
	    itar=calctar(val,itar);
	    if(itar == 300)stop = true;
	    val=ran.nextInt(10) + 1 ;
	    ilep=calclep(val,ilep);
	    if(ilep == 300)stop = true;
	    disegnaT(g2d);
	    disegnaL(g2d);
	    if(itar == 1 && ilep == 1)g2d.drawString("BANG !\nSONO PARTITI !",20,0);
	    if(itar == ilep)g2d.drawString("OUCH !!",0,50);
	    if(itar == 300)g2d.drawString("Ha vinto la tartaruga !",-50,100);
	    else if(ilep == 300)g2d.drawString("Ha vinto la lepre !",-50,100);
	    
	  } 
	  public void actionPerformed(ActionEvent e)
	   { if(!stop) repaint(); }
	  
	  public Lepre2()
	  { tartaruga.moveTo(0,15);
	    tartaruga.lineTo(5,10);
	    tartaruga.lineTo(5,0);
	    tartaruga.lineTo(15,0);
	    tartaruga.lineTo(15,10);
	    tartaruga.lineTo(20,15);
	    tartaruga.moveTo(5,10);
	    tartaruga.lineTo(15,10);
	    lepre.moveTo(0,20);
	    lepre.lineTo(5,15);
	    lepre.lineTo(10,5);
	    lepre.lineTo(15,0);
	    lepre.moveTo(10,5);
	    lepre.lineTo(10,0);
	    lepre.moveTo(5,15);
	    lepre.lineTo(10,20);
	    itar = 1;
	    ilep = 1;
	    x = 1 ;
	    y = 250 ;
	    timer = new Timer(100,this);
	    timer.start();
	  } 
	  
	  public static int calctar(int v, int i)
	   { int ret=1 ;
	     switch (v)
	      { case 1:
	        case 2:
	        case 3:
	        case 4:
	        case 5: ret= min(300, i+3);break; 
	        case 6:
	        case 7: ret= max(1, i-6); break; 
	        case 8:
	        case 9:
	        case 10: ret= min(300, i+1);break;  
	      }; return ret;
	   }

	 public static int calclep(int v,int i)
	  { int ret=1;
	    switch (v)
	     { case 1:
	       case 2: ret= i ; break; 
	       case 3:
	       case 4: ret= min(300, i+9); break; 
	       case 5: ret= max(1, i-12); break; 
	       case 6:
	       case 7:
	       case 8: ret= min(300, i+1); break; 
	       case 9: 
	      case 10: ret= max(1,i-2); break; 
	     };return ret ;
	  }
	  
	  public  void disegnaT(Graphics2D g2d)
	  { g2d.translate(400,400);
	    g2d.translate( - (int) floor(350*cos(PI*itar/600)),
	                   - (int) floor(350*sin(PI*itar/600)));
	    x = 400 - (int)floor(350*cos(PI*itar/600));
	    y = 400 - (int)floor(350*sin(PI*itar/600)); 
	    g2d.setColor(Color.RED);
	    g2d.draw(tartaruga);
	  }
	  
	  public  void disegnaL(Graphics2D g2d)
	  { g2d.translate(-x,-y);
	    g2d.translate(400,400);
	    g2d.translate( - (int)floor(350*cos(PI*ilep/600)),
	                   - (int)floor(350*sin(PI*ilep/600)));
	    g2d.setColor(Color.BLACK);
	    g2d.draw(lepre);
	  }
}
