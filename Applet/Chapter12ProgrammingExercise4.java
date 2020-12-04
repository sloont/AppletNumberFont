//TO BE COMPILED WITH JAVA 10 or lower
//Used javac --release 8 filename.java to test

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Chapter12ProgrammingExercise4 extends JApplet 
               implements KeyListener, ItemListener, ListSelectionListener
{
   private boolean lcd1, lcd2, lcd3, lcd4, lcd5, lcd6, lcd7;
   private int c;
   
   private Container pane;
   
   private Color currentColor = Color.black;
   private Color bgColor = Color.white;
   private JRadioButton redRB, greenRB, blueRB, magentaRB, cyanRB, yellowRB, blackRB, pinkRB;
   private ButtonGroup colorBG;
   
   private JList backgroundJList;
   private JScrollPane bgSelection;
   private String[] colors = {"Red", "Green", "Blue", 
                      "Magenta", "Cyan", "Yellow", 
                      "Black", "Pink"};
   
   private JLabel digitJL, colorJL, backgroundJL;
   
   
   @Override
   public void init()
   {  
      
      pane = this.getContentPane();
      pane.setLayout(null);          
            
      redRB = new JRadioButton("Red");
      greenRB = new JRadioButton("Green");
      blueRB = new JRadioButton("Blue");
      magentaRB = new JRadioButton("Magenta");
      cyanRB = new JRadioButton("Cyan");
      yellowRB = new JRadioButton("Yellow");
      blackRB = new JRadioButton("Black");
      pinkRB = new JRadioButton("Pink");
      
      redRB.setSize(80,20);
      greenRB.setSize(80,20);
      blueRB.setSize(80,20);
      magentaRB.setSize(80,20);
      cyanRB.setSize(80,20);
      yellowRB.setSize(80,20);
      blackRB.setSize(80,20);
      pinkRB.setSize(80,20);
      
      redRB.setLocation(110,20);
      greenRB.setLocation(110,40);
      blueRB.setLocation(110,60);
      magentaRB.setLocation(110,80);
      cyanRB.setLocation(110,100);
      yellowRB.setLocation(110,120);
      blackRB.setLocation(110,140);
      pinkRB.setLocation(110,160);
      
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
      
      backgroundJList = new JList(colors);
      backgroundJList.setVisibleRowCount(4);
      backgroundJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      backgroundJList.addListSelectionListener(this);
      
      bgSelection = new JScrollPane(backgroundJList);
      bgSelection.setSize(80, 80);
      bgSelection.setLocation(210, 60);
      pane.add(bgSelection);
      
      digitJL = new JLabel("Digit", SwingConstants.CENTER);
      colorJL = new JLabel("Color", SwingConstants.CENTER);
      backgroundJL = new JLabel("Background", SwingConstants.CENTER);
      
      digitJL.setSize(80, 20);                
      colorJL.setSize(80, 20);
      backgroundJL.setSize(80, 20);
      
      digitJL.setLocation(10, 210);
      colorJL.setLocation(110, 210);
      backgroundJL.setLocation(210, 210);
      
      digitJL.setOpaque(true);
      colorJL.setOpaque(true);
      backgroundJL.setOpaque(true);
      
      pane.add(digitJL);
      pane.add(colorJL);
      pane.add(backgroundJL);
      
      
      
      
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
      
      g.drawLine (100,0,100,200);
      
      g.drawLine (200,0,200,200);
      
      g.drawLine (300,0,300,240);
      
      g.drawLine (0,0,300,0);
      
      g.drawLine (0,200,300,200);
      
      g.drawLine (0,240,300,240);
      
      g.setColor(currentColor);

      pane.setBackground(bgColor);
      
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
   
   @Override
   public void valueChanged(ListSelectionEvent e)
   {
      String color = colors[backgroundJList.getSelectedIndex()];
      
      if (color == "Red")
         bgColor = Color.red;
      else if (color == "Green")
         bgColor = Color.green;
      else if (color == "Blue")
         bgColor = Color.blue;
      else if (color == "Magenta")
         bgColor = Color.magenta;
      else if (color == "Cyan")
         bgColor = Color.cyan;
      else if (color == "Yellow")
         bgColor = Color.yellow;
      else if (color == "Black")
         bgColor = Color.black;
      else if (color == "Pink")
         bgColor = Color.pink;
         
      repaint();
   }
}