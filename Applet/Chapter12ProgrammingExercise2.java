//TO BE COMPILED WITH JAVA 10 or lower
//Used javac --release 8 filename.java to test

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter12ProgrammingExercise2 extends JApplet implements KeyListener, ItemListener
{
   private boolean lcd1, lcd2, lcd3, lcd4, lcd5, lcd6, lcd7;
   private int c;
   
   private Color currentColor = Color.black;
   private JRadioButton redRB, greenRB, blueRB, magentaRB, cyanRB, yellowRB, blackRB, pinkRB;
   private ButtonGroup colorBG;
   
   
   
   @Override
   public void init()
   {  
      
      Container pane = this.getContentPane();
      pane.setLayout(null);          ///Potentially change layout later
      
      redRB = new JRadioButton("Red");
      greenRB = new JRadioButton("Green");
      blueRB = new JRadioButton("Blue");
      magentaRB = new JRadioButton("Magenta");
      cyanRB = new JRadioButton("Cyan");
      yellowRB = new JRadioButton("Yellow");
      blackRB = new JRadioButton("Black");
      pinkRB = new JRadioButton("Pink");
      
      redRB.setSize(100,20);
      greenRB.setSize(100,20);
      blueRB.setSize(100,20);
      magentaRB.setSize(100,20);
      cyanRB.setSize(100,20);
      yellowRB.setSize(100,20);
      blackRB.setSize(100,20);
      pinkRB.setSize(100,20);
      
      redRB.setLocation(120,20);
      greenRB.setLocation(120,40);
      blueRB.setLocation(120,60);
      magentaRB.setLocation(120,80);
      cyanRB.setLocation(120,100);
      yellowRB.setLocation(120,120);
      blackRB.setLocation(120,140);
      pinkRB.setLocation(120,160);
      
      redRB.addItemListener(this);
      greenRB.addItemListener(this);
      blueRB.addItemListener(this);
      magentaRB.addItemListener(this);
      cyanRB.addItemListener(this);
      yellowRB.addItemListener(this);
      blackRB.addItemListener(this);
      pinkRB.addItemListener(this);

      pane.add(redRB);
      pane.add(greenRB);
      pane.add(blueRB);
      pane.add(magentaRB);
      pane.add(cyanRB);
      pane.add(yellowRB);
      pane.add(blackRB);
      pane.add(pinkRB);

      colorBG = new ButtonGroup();
      colorBG.add(redRB);
      colorBG.add(greenRB);
      colorBG.add(blueRB);
      colorBG.add(magentaRB);
      colorBG.add(cyanRB);
      colorBG.add(yellowRB);
      colorBG.add(blackRB);
      colorBG.add(pinkRB);
      
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
      g.setColor(currentColor);
      
      //1
      if (lcd1)
         g.fillRect(10,10,80,20);
      //2
      if (lcd2)
         g.fillRect(10,90,80,20);
      //3
      if (lcd3)
         g.fillRect(10,170,80,20);
      //4
      if (lcd4)
         g.fillRect(10,20,20,80);
      //5
      if (lcd5)
         g.fillRect(70,20,20,80);
      //6
      if (lcd6)
         g.fillRect(10,100,20,80);
      //7
      if (lcd7)
         g.fillRect(70,100,20,80);
      
   }
   
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      if (e.getSource() == redRB)
         currentColor = Color.red;
      else if (e.getSource() == greenRB)
         currentColor = Color.green;
      else if (e.getSource() == blueRB)
         currentColor = Color.blue;
      else if (e.getSource() == magentaRB)
         currentColor = Color.magenta;
      else if (e.getSource() == cyanRB)
         currentColor = Color.cyan;
      else if (e.getSource() == yellowRB)
         currentColor = Color.yellow;
      else if (e.getSource() == blackRB)
         currentColor = Color.black;
      else if (e.getSource() == pinkRB)
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