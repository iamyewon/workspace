package project726;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class APanel extends JPanel{
   public APanel(){
      this.setBackground(Color.RED);
   }
}
class BPanel extends JPanel{
   public BPanel() {
      this.setLayout(null);
   }
}

public class Ex1{
   public static void main(String[] args) {
   JFrame jf = new JFrame();
   jf.setSize(500, 600);
   jf.setLayout(new GridLayout(0,1));
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   APanel ap = new APanel();
   //JTextField jtf = new JTextField(20);
   JTextArea jta = new JTextArea(5,20);
   // jtf.setSize(100, 200); - ?ȵ?.
   ap.add(jta);
   
   BPanel bp = new BPanel();
   JButton jbtn = new JButton("Click Me");
   jbtn.setSize(100,100);
   jbtn.setLocation(200,50);
   bp.add(jbtn);
   
   jf.add(ap);
   jf.add(bp);
   
   jf.setVisible(true);
   
   }
}