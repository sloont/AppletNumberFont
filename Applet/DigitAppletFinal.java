//TO BE COMPILED WITH JAVA 10 or lower
//Used javac --release 8 filename.java to test

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class DigitAppletFinal extends JApplet 
               implements KeyListener, ItemListener, ListSelectionListener
{  
   //Declare booleans for display interface//We must override this method because we are implementing its interface.
   private boolean lcd1;
   private boolean lcd2;
   private boolean lcd3;
   private boolean lcd4;
   private boolean lcd5;
   private boolean lcd6;
   private boolean lcd7;

   //Declare integer to save the value of the KeyEvent
   private int c;

   //Declare and initialize constants for instances of color String objects
   private static String RED = "Red";
   private static String GREEN = "Green";
   private static String BLUE = "Blue";
   private static String MAGENTA = "Magenta";
   private static String CYAN = "Cyan";
   private static String YELLOW = "Yellow";
   private static String BLACK = "Black";
   private static String PINK = "Pink";

   //Declare container outside of init() so it can be accessed by other methods
   private Container pane;
   
   //Setup variables for digit and background color
   private Color currentColor = Color.black;
   private Color bgColor = Color.white;

   //Declare the eight radio buttons for digit color selection
   private JRadioButton redRB;
   private JRadioButton greenRB; 
   private JRadioButton blueRB; 
   private JRadioButton magentaRB; 
   private JRadioButton cyanRB; 
   private JRadioButton yellowRB; 
   private JRadioButton blackRB; 
   private JRadioButton pinkRB;

   //Declare button group for the radio buttons
   private ButtonGroup colorBG;
   
   //Declare objects for JList and JScrollPane
   private JList backgroundJList;
   private JScrollPane bgSelection;

   //Declare and initialize array of String objects for background color JList
   private String[] colors = {RED, GREEN, BLUE, 
                      MAGENTA, CYAN, YELLOW, 
                      BLACK, PINK};
   
                      //Declare JLabels for applet clarity
   private JLabel digitJL, colorJL, backgroundJL;
   
   
   @Override
   public void init()
   {  
      
      pane = this.getContentPane();
      pane.setLayout(null);          
      
      //Instantiate radio buttons
      redRB = new JRadioButton(RED);
      greenRB = new JRadioButton(GREEN);
      blueRB = new JRadioButton(BLUE);
      magentaRB = new JRadioButton(MAGENTA);
      cyanRB = new JRadioButton(CYAN);
      yellowRB = new JRadioButton(YELLOW);
      blackRB = new JRadioButton(BLACK);
      pinkRB = new JRadioButton(PINK);
      
      //Set radio button sizes
      redRB.setSize(120,20);
      greenRB.setSize(120,20);
      blueRB.setSize(120,20);
      magentaRB.setSize(120,20);
      cyanRB.setSize(120,20);
      yellowRB.setSize(120,20);
      blackRB.setSize(120,20);
      pinkRB.setSize(120,20);
      
      //Set location for radio buttons
      redRB.setLocation(115,20);
      greenRB.setLocation(115,40);
      blueRB.setLocation(115,60);
      magentaRB.setLocation(115,80);
      cyanRB.setLocation(115,100);
      yellowRB.setLocation(115,120);
      blackRB.setLocation(115,140);
      pinkRB.setLocation(115,160);
      
      //Add item listener to radio buttons
      redRB.addItemListener(this);
      greenRB.addItemListener(this);
      blueRB.addItemListener(this);
      magentaRB.addItemListener(this);
      cyanRB.addItemListener(this);
      yellowRB.addItemListener(this);
      blackRB.addItemListener(this);
      pinkRB.addItemListener(this);

      //Add radio buttons to Container pane
      pane.add(redRB);
      pane.add(greenRB);
      pane.add(blueRB);
      pane.add(magentaRB);
      pane.add(cyanRB);
      pane.add(yellowRB);
      pane.add(blackRB);
      pane.add(pinkRB);

      //Initialize the button group for the radio buttons
      colorBG = new ButtonGroup();

      //Add each radio button to the button group
      colorBG.add(redRB);
      colorBG.add(greenRB);
      colorBG.add(blueRB);
      colorBG.add(magentaRB);
      colorBG.add(cyanRB);
      colorBG.add(yellowRB);
      colorBG.add(blackRB);
      colorBG.add(pinkRB);
      
      //Initialize JList object for background color choice
      //Set single selection model and add appropriate Listener
      backgroundJList = new JList(colors);
      backgroundJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      backgroundJList.addListSelectionListener(this);
      
      //Initialize JScrollPane object for JList
      //Set size and location then add to Container pane
      bgSelection = new JScrollPane(backgroundJList);
      bgSelection.setSize(120, 120);
      bgSelection.setLocation(265, 40);
      pane.add(bgSelection);
      
      //Instantiate JLabels with appropriate Strings and formatting
      digitJL = new JLabel("Digit", SwingConstants.CENTER);
      colorJL = new JLabel("Color", SwingConstants.CENTER);
      backgroundJL = new JLabel("Background", SwingConstants.CENTER);
      
      //Set JLabel size
      digitJL.setSize(80, 20);                
      colorJL.setSize(120, 20);
      backgroundJL.setSize(120, 20);
      
      //Set JLabel location
      digitJL.setLocation(10, 210);
      colorJL.setLocation(115, 210);
      backgroundJL.setLocation(265, 210);
      
      //Set opaque for visual clarity when background color changes
      digitJL.setOpaque(true);
      colorJL.setOpaque(true);
      backgroundJL.setOpaque(true);
      
      //Add JLabels to Container pane
      pane.add(digitJL);
      pane.add(colorJL);
      pane.add(backgroundJL);
      
      //Add this as KeyListener because the class implements the interface
      this.addKeyListener(this);

      //Must allow focusing
      this.setFocusable(true);
      

   }
   //Method with a switch to manipulate the booleans for the digit display
   //Cases correspond to KeyEvent codes
   public void drawNum() {
   
   //Everytime drawNum() is called, set booleans to false. (Blank Display)       
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
      
      //Display something other than the digits in case of non-digit input
      default:
         lcd2 = true;
         
      }//end switch
      
   }

   @Override
   public void paint(Graphics g)
   {  
      super.paint(g);
      
      //set color and draw lines to make the space look nicer
      g.setColor(Color.black);
      
      g.drawLine (100,0,100,200);
      
      g.drawLine (250,0,250,200);
      
      g.drawLine (400,0,400,240);
      
      g.drawLine (0,0,400,0);
      
      g.drawLine (0,200,400,200);
      
      g.drawLine (0,240,400,240);

      g.drawLine (0,0,0,240);
      
      //Set the current color to the color decided by radio buttons
      g.setColor(currentColor);

      //Set the background of the applet to color selected in JList
      pane.setBackground(bgColor);
      
      //These if statements connect the booleans to fillRect calls
      //Seven are needed for proper digit display
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
         g.fillRect(10,10,20,90);
      //5
      if (lcd5)
         g.fillRect(70,10,20,90);
      //6
      if (lcd6)
         g.fillRect(10,100,20,90);
      //7
      if (lcd7)
         g.fillRect(70,100,20,90);
      
   }
   
   //We must override this method because we are implementing its interface.
   @Override
   public void itemStateChanged(ItemEvent e)
   {
      
      //Check the source of the ItemEvent and set currentColor appropriately
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
         
      //Must repaint after the ItemEvent is handled!
      repaint();
   }

   //We must override this method because we are implementing its interface.
   @Override
   public void keyTyped(KeyEvent e) {
      //Not used currently.
   }

   //We must override this method because we are implementing its interface.
   @Override
   public void keyReleased(KeyEvent e) {
      //Not used currently.
   }

   //We must override this method because we are implementing its interface.
   @Override
   public void keyPressed(KeyEvent e) {

      //Save the KeyEvent key code in the global c
      //Call drawNum() method and remember to repaint()
      c = e.getKeyCode();
      this.drawNum();
      repaint();
   }
   
   //We must override this method because we are implementing its interface.
   @Override
   public void valueChanged(ListSelectionEvent e)
   {
      //Instantiate a local String variable that will point to the appropriate
      //constant for the color selected in the list.
      String color = colors[backgroundJList.getSelectedIndex()];
      
      //We use equals method because they should point to the same String object
      if (color.equals(RED))
         bgColor = Color.red;
      else if (color.equals(GREEN))
         bgColor = Color.green;
      else if (color.equals(BLUE))
         bgColor = Color.blue;
      else if (color.equals(MAGENTA))
         bgColor = Color.magenta;
      else if (color.equals(CYAN))
         bgColor = Color.cyan;
      else if (color.equals(YELLOW))
         bgColor = Color.yellow;
      else if (color.equals(BLACK))
         bgColor = Color.black;
      else if (color.equals(PINK))
         bgColor = Color.pink;
         
      //Remember to refresh the Graphics object with repaint!
      repaint();
   }
}