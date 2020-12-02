import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter12ProgrammingExercise1 extends JApplet
{
   private int num = 1;
   
   public void init()
   {  
      this.setFocusable(true);
      this.addKeyListener(new KeyAdapter()
      {
         public void keyTyped(KeyEvent e)
         {

            int c = e.getKeyCode();
            switch (c)
            {
            
            case KeyEvent.VK_1:
            //1
               num = 1;
               break;
      
            case KeyEvent.VK_2:
            //2
               num = 2;
               break;
      
            case KeyEvent.VK_3:
            //3
               num = 3;
               break;
               
            case KeyEvent.VK_4:
            //4               
               num = 4;
               break;
      
            case KeyEvent.VK_5:
            //5
               num = 5;
               break;
               
            case KeyEvent.VK_6:
            //6
               num = 6;
               break;
               
            case KeyEvent.VK_7:
            //7
               num = 7;
               break;
      
            case KeyEvent.VK_8:
            //8
               num = 8;
               break;
      
            case KeyEvent.VK_9:          
            //9
               num = 9;
               break;
               
            case KeyEvent.VK_0:
             //0
               num = 0;
               break;  
            
            default:
               num = 0;
               
            }//end switch
            repaint();
            
         }
      });
   }
   
   public void paint(Graphics g)
   {  
      super.paint(g);
      g.setColor(Color.black);
      
      switch (num)
      {
      
      case 1:
      //1
         g.fillRect(30, 20, 10, 10);
         g.fillRect(40, 10, 10, 10);
         g.fillRect(50, 10, 10, 60);
         g.fillRect(30, 70, 50, 10);
         break;

      case 2:
      //2
         g.fillRect(30, 20, 10, 10);
         g.fillRect(40, 10, 20, 10);
         g.fillRect(60, 20, 10, 10);
         g.fillRect(50, 30, 10, 10);
         g.fillRect(40, 40, 10, 10);
         g.fillRect(30, 50, 10, 30);
         g.fillRect(40, 70, 30, 10);
         break;

      case 3:
      //3
         g.fillRect(30, 20, 10, 10);
         g.fillRect(40, 10, 20, 10);
         g.fillRect(60, 20, 10, 10);
         g.fillRect(50, 30, 10, 10);
         g.fillRect(60, 40, 10, 30);
         g.fillRect(40, 70, 20, 10);
         g.fillRect(30, 60, 10, 10);
         break;
         
      case 4:
      //4
         g.fillRect(30, 20, 10, 10);
         g.fillRect(40, 10, 20, 10);
         g.fillRect(50, 20, 10, 20);
         g.fillRect(20, 30, 10, 20);
         g.fillRect(30, 40, 40, 10);
         g.fillRect(50, 50, 10, 30);
         break;

      case 5:
      //5
         g.fillRect(30, 10, 10, 40);
         g.fillRect(40, 10, 30, 10);
         g.fillRect(40, 40, 20, 10);
         g.fillRect(60, 40, 10, 30);
         g.fillRect(30, 70, 30, 10);
         break;
         
      case 6:
      //6
         g.fillRect(30, 20, 10, 50);
         g.fillRect(40, 10, 20, 10);
         g.fillRect(60, 20, 10, 10);
         g.fillRect(40, 40, 20, 10);
         g.fillRect(40, 70, 20, 10);
         break;
         
      case 7:
      //7
         g.fillRect(30, 10, 40, 10);
         g.fillRect(60, 20, 10, 20);
         g.fillRect(50, 40, 10, 20);
         g.fillRect(40, 60, 10, 20);
         break;

      case 8:
      //8
         g.fillRect(40, 10, 20, 10);
         g.fillRect(40, 40, 20, 10);
         g.fillRect(40, 70, 20, 10);
         g.fillRect(30, 20, 10, 20);
         g.fillRect(60, 20, 10, 20);
         g.fillRect(30, 50, 10, 20);
         g.fillRect(60, 50, 10, 20);
         break;

      case 9:          
      //9
         g.fillRect(40, 10, 20, 10);
         g.fillRect(60, 20, 10, 50);
         g.fillRect(30, 20, 10, 20);
         g.fillRect(40, 40, 20, 10);
         g.fillRect(40, 70, 20, 10);
         break;
         
      case 0:
       //0
         g.fillRect(40, 10, 20, 10);
         g.fillRect(40, 70, 20, 10);
         g.fillRect(60, 20, 10, 50);
         g.fillRect(30, 20, 10, 50);
         g.fillRect(50, 30, 10, 10);
         g.fillRect(40, 40, 10, 10);
         
      }//end switch  
   }
}