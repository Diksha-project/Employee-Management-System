
package employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


  class login implements ActionListener{
   JFrame f;
   JLabel l1,l2;
   JTextField t1;
   JPasswordField t2;
   JButton b1,b2;
   String s1,s2;
   login(){
     f = new JFrame("login");
     f.setLayout(null);
     f.setBackground(Color.WHITE);
     f.setSize(700,300);
     f.setLocation(350,200);
     
     
     l1 = new JLabel("username");
     l1.setBounds(50,30,100,50);
     f.add(l1);
     
     l2 = new JLabel("password");
     l2.setBounds(50,70,100,50);
     f.add(l2);
     
     t1 = new JTextField();
     t1.setBounds(200, 40, 200, 25);
     f.add(t1);
     
     t2 = new JPasswordField();
     t2.setBounds(200,80,200,25);
     f.add(t2);
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/login.jpg"));
     Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel l3 = new JLabel(i3);
     l3.setBounds(450,30,150,150);
     f.add(l3);
     
     JButton b1 = new JButton("LOGIN");
     b1.setBounds(40,140,120,30);
     b1.setFont(new Font("serif",Font.BOLD,15));
     b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.addActionListener(this);
      f.add(b1);
      
      JButton b2 = new JButton("CANCLE");
     b2.setBounds(180,140,120,30);
     b2.setFont(new Font("serif",Font.BOLD,15));
     b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      b2.addActionListener(this);
      f.add(b2);
      
     
     
     f.setVisible(true);
      
    }
   
  
   public void actionPerformed(ActionEvent ae){
       
      
       
         try{
            conn c1 = new conn();
            String u = t1.getText();
            String v = t2.getText();
            
            String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){
                new details().f.setVisible(true);
                f.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                f.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        login l=new login();
    }
   }
       
 
