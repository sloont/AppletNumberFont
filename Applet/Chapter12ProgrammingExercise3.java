//TO BE COMPILED WITH JAVA 10 or lower
//Used javac --release 8 filename.java to test

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter12ProgrammingExercise3 extends JApplet implements KeyListener, ActionListener
{
   private boolean lcd1, lcd2, lcd3, lcd4, lcd5, lcd6, lcd7;
   private int c;
   
   private Color currentColor = Color.black;
   
   private JMenuBar menuBar = new JMenuBar();
   private JMenu colorMenu;
   private JMenuItem redI, greenI, blueI, magentaI, cyanI, yellowI, blackI, pinkI;
   
   
   
   @Override
   public void init()
   {  
   
      setJMenuBar(menuBar);
      
      colorMenu = new JMenu("Color");
      menuBar.add(colorMenu);
      
      redI = new JMenuItem("Red");
      greenI = new JMenuItem("Green");
      blueI = new JMenuItem("Blue");
      magentaI = new JMenuItem("Magenta");
      cyanI = new JMenuItem("Cyan");
      yellowI = new JMenuItem("Yellow");
      blackI = new JMenuItem("Black");
      pinkI = new JMenuItem("Pink");
      
      colorMenu.add(redI);
      colorMenu.add(greenI);
      colorMenu.add(blueI);
      colorMenu.add(magentaI);
      colorMenu.add(cyanI);
      colorMenu.add(yellowI);
      colorMenu.add(blackI);
      colorMenu.add(pinkI);
      
      redI.addActionListener(this);
      greenI.addActionListener(this);
      blueI.addActionListener(this);
      magentaI.addActionListener(this);
      cyanI.addActionListener(this);
      yellowI.addActionListener(this);
      blackI.addActionListener(this);
      pinkI.addActionListener(this);
      
      this.addKeyListener(this);
      this.setFocusable(true);
      this.requestFocusInWindow();

   }
   
   

   public void drawNum() {
            
      lcd1 = false;
      lcd2 = false;
      lcd3 = false;
      lcd4 = false;
      lcd5 = false;
      lcd6 = false;
      lcd7 = false;
      
      switch (c)
      {
      
      case 49:
      //1
         lcd5 = true;
         lcd7 = true;
         break;

      case 50:
      //2
         lcd1 = true;
         lcd2 = true;
         lcd3 = true;
         lcd5 = true;
         lcd6 = true;
         break;

      case 51:
      //3
         lcd1 = true;
         lcd2 = true;
         lcd3 = true;
         lcd5 = true;
         lcd7 = true;
         break;
         
      case 52:
      //4               
         lcd2 = true;
         lcd4 = true;
         lcd5 = true;
         lcd7 = true;
         break;

      case 53:
      //5
         lcd1 = true;
         lcd2 = true;
         lcd3 = true;
         lcd4 = true;
         lcd7 = true;
         break;
         
      case 54:
      //6
         lcd1 = true;
         lcd2 = true;
         lcd3 = true;
         lcd4 = true;
         lcd6 = true;
         lcd7 = true;
         break;
         
      case 55:
      //7
         lcd1 = true;
         lcd5 = true;
         lcd7 = true;
         break;

      case 56:
      //8
         lcd1 = true;
         lcd2 = true;
         lcd3 = true;
         lcd4 = true;
         lcd5 = true;
         lcd6 = true;
         lcd7 = true;
         break;

      case 57:          
      //9
         lcd1 = true;
         lcd2 = true;
         lcd4 = true;
         lcd5 = true;
         lcd7 = true;
         break;
         
      case 48:
         //0
         lcd1 = true;
         lcd3 = true;
         lcd4 = true;
         lcd5 = true;
         lcd6 = true;
         lcd7 = true;
         break;  
      
      default:
         lcd2 = true;
         
      }//end switch
      
   }

   @Override
   public void paint(Graphics g)
   {  
      super.paint(g);
      g.setColor(Color.black);
      g.drawLine(0,120,200,120);
      g.drawLine(100,20,100,220);
      g.setColor(currentColor);
 
      //1
      if (lcd1)
         g.fillRect(60,30,80,20);
      //2
      if (lcd2)
         g.fillRect(60,110,80,20);
      //3
      if (lcd3)
         g.fillRect(60,190,80,20);
      //4
      if (lcd4)
         g.fillRect(60,30,20,90);
      //5
      if (lcd5)
         g.fillRect(120,30,20,90);
      //6
      if (lcd6)
         g.fillRect(60,120,20,90);
      //7
      if (lcd7)
         g.fillRect(120,120,20,90);      
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
      JMenuItem item = (JMenuItem) e.getSource();
   
      if (item == redI)
         currentColor = Color.red;
      else if (item == greenI)
         currentColor = Color.green;
      else if (item == blueI)
         currentColor = Color.blue;
      else if (item == magentaI)
         currentColor = Color.magenta;
      else if (item == cyanI)
         currentColor = Color.cyan;
      else if (item == yellowI)
         currentColor = Color.yellow;
      else if (item == blackI)
         currentColor = Color.black;
      else if (item == pinkI)
         currentColor = Color.pink;
         
      repaint();
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