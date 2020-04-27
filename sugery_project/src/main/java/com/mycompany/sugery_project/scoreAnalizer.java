/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*; 
import java.lang.Object; 
import java.sql.Time;
import java.util.Date;
import javafx.scene.shape.Circle;

@SuppressWarnings("serial")
public class scoreAnalizer extends JPanel implements MouseListener, MouseMotionListener{
   private static final Logger LOGGER = Logger.getLogger(scoreAnalizer.class.getName());
   private static int MAX_SCORE = 200;
   private static int MIN_SCORE = 30;
   private static final int PREF_W = 800;
   private static final int PREF_H = 650;
   private static final int BORDER_GAP = 30;
   private static final Color GRAPH_COLOR = Color.green;
   private static final Color GRAPH_POINT_COLOR = new Color(150, 50, 50, 180);
   private static final Stroke GRAPH_STROKE = new BasicStroke(3f);
   private static final int GRAPH_POINT_WIDTH = 12;
   private static final int Y_HATCH_CNT = 5;
   private ArrayList<Integer> scores = new ArrayList<Integer>();  //TODO: not necessary
   private ArrayList<String> dates = new ArrayList<String>(); 
   private User user; 
   private entryTable dataTable = new entryTable();
   private List<Point> graphPoints;
   private List<Circle> graphCircles; 
   private Circle lastDisplayedCircle = new Circle(); 
   private long recentDisplayTime; //TODO initialize
   private Graphics2D graph; //TODO idk if necessary
   private JFrame frame = new JFrame("Score Graph"); 

   
   public scoreAnalizer(User usr) { //TODO modify the score
       this.user = usr;
       for(Map.Entry e : this.user.getHM().entrySet()){
           scores.add((Integer)e.getValue());
           dates.add((String)e.getKey()); 
       }
       MAX_SCORE = this.user.getMaxScoreValue();
       MIN_SCORE = this.user.getMinScoreValue(); 
       addMouseListener(this); // not sure if necessary
       addMouseMotionListener(this);
       graphPoints = new ArrayList<Point>(); 
       graphCircles = new ArrayList<Circle>(); 
  
   }
   //TODO scaling problem
   //TODO add score metrics 
   //TODO line in the middle(?)
   
   @Override
   protected void paintComponent(Graphics g) {
       //parent : contentPane
       super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g;
      this.graph = g2; 
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      g2.setColor(Color.white);
      double xScale = ((double) getWidth() - 2 * BORDER_GAP) / (scores.size() - 1);
      double yScale = ((double) getHeight() - 2 * BORDER_GAP) / (MAX_SCORE - 1);
      /*yScale = (MAX_SCORE - MIN_SCORE)/ this.user.getHM().size();
      yScale = yScale > 4.5 ? 4.5 : yScale;
      */ yScale = 590 / (MAX_SCORE - MIN_SCORE);
      yScale = yScale <= 0 ? 2 : yScale;
      System.out.println("yScale: " + yScale);
      //List<Point> graphPoints = new ArrayList<Point>();
      for (int i = 0; i < scores.size(); i++) {
         int x1 = (int) (i * xScale + BORDER_GAP);
         int y1 = (int) ((MAX_SCORE - scores.get(i)) * yScale + BORDER_GAP);
         System.out.print("score : " + scores.get(i));
         System.out.print(" y value: " + y1);
         System.out.println(" y scale: " + yScale);
         y1 = (y1 < 30) ? 30 : y1;
         y1 = (y1 > 620) ? 620 : y1; // MAX_SCORE : y1;
         
         graphPoints.add(new Point(x1, y1)); // changed from y1
         graphCircles.add(new Circle(x1, y1, 10));          // y range[30-620]
         
         System.out.println(" added points (y change?)  " + x1 + " " + y1);
      }

      // create x and y axes 
      
      g2.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, BORDER_GAP, BORDER_GAP);
        g2.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, getWidth() - BORDER_GAP, getHeight() - BORDER_GAP);
 
      
      // create hatch marks for y axis. 
      for (int i = 0; i < Y_HATCH_CNT; i++) {
         int x0 = BORDER_GAP;
         int x1 = GRAPH_POINT_WIDTH + BORDER_GAP;
         int y0 = getHeight() - (((i + 1) * (getHeight() - BORDER_GAP * 2)) / Y_HATCH_CNT + BORDER_GAP);
         int y1 = y0;
         g2.drawLine(x0, y0, x1, y1);
         g2.drawString(Integer.toString((i+1) * ((MAX_SCORE - MIN_SCORE)/(Y_HATCH_CNT))), 
                 x1, y1);
      }

      // and for x axis
//      TODO: int numHatch = scores.size() > 10 ? 10 : scores.size();
//      change x1
        int numHatch = scores.size(); 
        if(numHatch < 20){
            for (int i = 0; i < numHatch - 1; i++) {
                 int x0 = (i + 1) * (getWidth() - BORDER_GAP * 2) / (scores.size() - 1) + BORDER_GAP;
                 int x1 = x0;
                 int y0 = getHeight() - BORDER_GAP;
                 int y1 = y0 - GRAPH_POINT_WIDTH;
                 g2.drawLine(x0, y0, x1, y1);
              }
        }

      Stroke oldStroke = g2.getStroke();
      g2.setColor(GRAPH_COLOR);
      g2.setStroke(GRAPH_STROKE);
      for (int i = 0; i < graphPoints.size() - 1; i++) {
         int x1 = graphPoints.get(i).x;
         int y1 = graphPoints.get(i).y;
         int x2 = graphPoints.get(i + 1).x;
         int y2 = graphPoints.get(i + 1).y;
         g2.drawLine(x1, y1, x2, y2);         
      }

      g2.setStroke(oldStroke);      
      g2.setColor(GRAPH_POINT_COLOR);
      for (int i = 0; i < graphPoints.size(); i++) {
         int x = graphPoints.get(i).x - GRAPH_POINT_WIDTH / 2;
         int y = graphPoints.get(i).y - GRAPH_POINT_WIDTH / 2;
         int ovalW = GRAPH_POINT_WIDTH;
         int ovalH = GRAPH_POINT_WIDTH;
         g2.fillOval(x, y, ovalW, ovalH);
         
      }
   }

    
   @Override
   public Dimension getPreferredSize() {
      return new Dimension(PREF_W, PREF_H);
   }

   public  void createAndShowGui() {
      List<Integer> scores = new ArrayList<Integer>();
      Random random = new Random();
      int maxDataPoints = 16;
      int maxScore = 20;
      for (int i = 0; i < maxDataPoints ; i++) {
         scores.add(random.nextInt(maxScore));
      }
      scoreAnalizer mainPanel = new scoreAnalizer(this.user); // hmm weird
                         
                    
      
      mainPanel.setBackground(Color.BLACK);
      //JFrame frame = new JFrame("Score Graph"); // make this a parameter?
      this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.frame.getContentPane().add(mainPanel);
      this.frame.pack();
      this.frame.setLocationByPlatform(true);
      this.frame.setVisible(true);
      this.frame.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) {  // handler
            if(ke.getKeyCode() == ke.VK_ESCAPE) {
                frame.setVisible(false);
            }
        } 
            });
   }

    @Override
    public void mouseClicked(MouseEvent e) {
        int idx; 
        Date date = new Date(); 
            
        for(Circle c : graphCircles){ // efficiency?
            if(c.contains(e.getX(), e.getY())){
                if(lastDisplayedCircle != c || date.getTime() - recentDisplayTime > 2000){
                    idx = graphCircles.indexOf(c);
                    JOptionPane.showMessageDialog(new JFrame("Score"), 
                    "Value " + scores.get(idx) +
                    " registered at: " + dates.get(idx)); // (e.getIndex)
                    lastDisplayedCircle = c; 
                    recentDisplayTime = date.getTime();
                    }
                }
            
            }
        
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Point loc = e.getLocationOnScreen();
        System.out.println("loc value: " + loc);
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseMoved(MouseEvent e){

        }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
   

}
/**
 *
 * @author mikowhy
 */

