import java.awt.events.*;
import javax.swing.*;


class WindowTester implements WindowListener{
  public void windowOpened(WindowEvent e){
    System.out.println("Opened.");
  }
  public void windowClosing(WindowEvent e){
    System.out.println("Closing.");
  }
  public void windowIconified(WindowEvent e){
    System.out.println("Icnonified.");
  }
  public void windowDeiconified(WindowEvent e){
    System.out.println("Deicoinified");
  }
  public void windowDeactivated(WindowEvent e){
    System.out.println("Deactived");
  }
  public void windowActivated(WindowEvent e){
    System.out.println("Activated.");
  }
  public void windowClosed(WindowEvent e){
    System.out.println("Closed.");
  }
  public void creategui(){
    JFrame frame = new JFrame("WindowListener Tester");
    frame.addWindowListener(this);
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    new WindowTester().creategui();
  }
}

class KeyTester implements KeyListener{
  public void keyTyped(KeyEvent e){}
  public void keyReleased(KeyEvent e){}
  public void keyPressed(KeyEvent e){
    System.out.print(e.getKeyCode());
    if (e.getKeyCode() == KeyEvent.VK_E){
      System.out.print(" - E \n");
    } else{
      System.out.print(" - Not E \n");
    }
  }
  public void createGUI(){
    JFrame frame = new JFrame();
    frame.addKeyListener(this);
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    new KeyTester().createGUI();
  }
}

// SIMPLE EASY EXAMPLE:
// CLICKER.
//Click on the frame to earn clicks!
//Check the consol and see how many clicks you can click!
//WARNING!
//Some lags.
//Clicks aren't saving

class MouseTester implements MouseListener{
  int i = 0;
  
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public void mouseClicked(MouseEvent e){
    i++;
    System.out.println(i);
  }
  public void mousePressed(MouseEvent e){}

  public void createGUI(){
    JFrame frame = new JFrame();
    frame.addMouseListener(this);
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    new MouseTester().createGUI();
  }
}
