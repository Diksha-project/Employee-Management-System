
package employee;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;


 class Main implements ActionListener {
    JFrame f;
    JLabel l1;
    JButton b1,b2;
    
    Main(){
        f = new JFrame(" Register Page ! ");
        f.setSize(700,400);
        f.setLocation(150,150);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/Main.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l1 = new JLabel(i3);
       f.add(l1);
       
       b1 = new JButton ("register yourself");
       b1.setBounds(30,50,300,30);
       b1.setFont(new Font("serif",Font.BOLD,25));
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.WHITE);
       b1.addActionListener(this);
       l1.add(b1);
       
       b2 = new JButton ("Login Here");
       b2.setBounds(30,130,300,30);
       b2.setFont(new Font("serif",Font.BOLD,25));
       b2.setBackground(Color.BLACK);
       b2.setForeground(Color.WHITE);
       b2.addActionListener(this);
       l1.add(b2);
        f.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            Register r = new Register();
            
        }
        
          if(ae.getSource()==b2){
              login l = new login();
           
        }
    }
    public static void main(String [] args){
        Main m = new Main();
    }
    
}
