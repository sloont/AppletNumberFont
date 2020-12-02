//TO BE COMPILED WITH JAVA 10 or lower
//Used javac --release 8 filename.java to test

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter12ProgrammingExercise1 extends JApplet implements KeyListener
{
   private int num = 1;
   private int c;
   
   @Override
   public void init()
   {  
      
      this.addKeyListener(this);
      this.setFocusable(true);
      this.requestFocusInWindow();

   }

   public void drawNum() {
            
      
      switch (c)
      {
      
      case 49:
      //1
         num = 1;
         break;

      case 50:
      //2
         num = 2;
         break;

      case 51:
      //3
         num = 3;
         break;
         
      case 52:
      //4               
         num = 4;
         break;

      case 53:
      //5
         num = 5;
         break;
         
      case 54:
      //6
         num = 6;
         break;
         
      case 55:
      //7
         num = 7;
         break;

      case 56:
      //8
         num = 8;
         break;

      case 57:          
      //9
         num = 9;
         break;
         
      case 48:
         //0
         num = 0;
         break;  
      
      default:
         num = -1;
         
      }//end switch
      
   }

   @Override
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
         g.fillRect(60, 50, 10, 20);
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
         g.fillRect(30, 60, 10, 10);
         break;
         
      case 0:
       //0
         g.fillRect(40, 10, 20, 10);
         g.fillRect(40, 70, 20, 10);
         g.fillRect(60, 20, 10, 50);
         g.fillRect(30, 20, 10, 50);
         g.fillRect(50, 30, 10, 10);
         g.fillRect(40, 40, 10, 10);
         break;

      default:
         g.fillRect(30, 50, 10, 10);
         g.fillRect(50, 50, 10, 10);
         g.fillRect(70, 50, 10, 10);
      }//end switch  
   }

   @Override
   public void keyTyped(KeyEvent e) {}
   @Override
   public void keyReleased(KeyEvent e) {}
   @Override
   public void keyPressed(KeyEvent e) {
      c = e.getKeyCode();
      this.drawNum();
      repaint();
   }
}