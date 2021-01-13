
package employee;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class details  implements ActionListener{
    JFrame f ;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5;
    details(){
      f = new JFrame();
      f.setSize(700, 500);
      f.setLocation(300,150);
      
      
      l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/details.jpg"));
        l1.setIcon(i1);
        f.add(l1);
      
      l2 = new JLabel("EMPLOYEE DETAILS");
      l2.setBounds(20,25,300,30);
      l2.setFont(new Font("serif",Font.BOLD,25));
      l1.add(l2);
      
      b1 = new JButton("Add");
      b1.setBounds(400,75,100,25);
      b1.setFont(new Font("serif",Font.BOLD,15));
       b1.addActionListener(this);
      l1.add(b1);
      
      
      b2 = new JButton("View");
      b2.setBounds(550,75,100,25);
      b2.setFont(new Font("serif",Font.BOLD,15));
       b2.addActionListener(this);
      l1.add(b2);
      
      
      b3 = new JButton("Remove");
      b3.setBounds(400,125,100,25);
      b3.setFont(new Font("serif",Font.BOLD,15));
       b3.addActionListener(this);
      l1.add(b3);
      
      
      b4 = new JButton("Update");
      b4.setBounds(550,125,100,25);
      b4.setFont(new Font("serif",Font.BOLD,15));
      b4.addActionListener(this);
      l1.add(b4);
      
      b5 = new JButton("login");
      b5.setBounds(400,175,100,25);
      b5.setFont(new Font("serif",Font.BOLD,15));
      b5.addActionListener(this);
      l1.add(b5);
      
      f.setVisible(true);
    }
    

 public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Search_Employee();
        }
        if(ae.getSource()==b5){
            f.setVisible(false);
            new login();
        }
    } 
 

public static void  main(String[] args){
details d = new details();
}
}




