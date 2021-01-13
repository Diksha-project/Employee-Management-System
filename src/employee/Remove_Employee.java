
package employee;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Remove_Employee  implements ActionListener{
    
 JFrame f;
 JTextField t;
 JLabel l,l1,l2,l3,l4,l5,l6,l7;
 JButton b1,b2,b3,b4;
  Remove_Employee() {
      f = new JFrame("Remove Employee");
      f.setSize(500, 500);
      f.setLocation(150, 150);
       
       l = new JLabel();
       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("employee/icons/remove.jpg"));
       l.setIcon(i1);
       f.add(l);
       
        l1=new JLabel("Employee Id");
        l1.setBounds(50,50,250,30);
        l1.setForeground(Color.white);
        l1.setFont(new Font("serif",Font.BOLD,25)); 
        l.add(l1);

        t=new JTextField();
        t.setBounds(250,50,150,30);
        l.add(t);


        b1=new JButton("Search");
        b1.setBounds(200,100,100,30);
        b1.addActionListener(this);
        l.add(b1);
        
        
         b2=new JButton("back");
        b2.setBounds(360,100,100,30);   
        b2.addActionListener(this);
        l.add(b2);


        l2=new JLabel("Name:"); 
        l2.setBounds(50,150,250,30);
        l2.setForeground(Color.white);
         l2.setFont(new Font("serif",Font.BOLD,20)); 
        l.add(l2);

        l3=new JLabel();    
        l3.setBounds(200,150,350,30);
        l3.setForeground(Color.white);
        l3.setFont(new Font("serif",Font.BOLD,20)); 
        l.add(l3);

        l4=new JLabel("Mobile No:");
        l4.setBounds(50,200,250,30);
        l4.setForeground(Color.white);
        l4.setFont(new Font("serif",Font.BOLD,20)); 
        l.add(l4);


        l5=new JLabel();
        l5.setBounds(200,200,350,30);
        l5.setForeground(Color.white);
        l5.setFont(new Font("serif",Font.BOLD,20));
        l.add(l5);



        l6=new JLabel("Email Id:");
        l6.setBounds(50,250,250,30);
        l6.setForeground(Color.white);
        l6.setFont(new Font("serif",Font.BOLD,20)); 
        l.add(l6);

        l7=new JLabel();
        l7.setBounds(200,250,350,30);
        l7.setForeground(Color.white);
        l7.setFont(new Font("serif",Font.BOLD,20)); 
         l.add(l7);

        b3=new JButton("Remove");
        b3.setBounds(120,300,100,30);
        b3.addActionListener(this);
        l.add(b3);


        b4=new JButton("Cancel");
        b4.setBounds(300,300,100,30);
        b4.addActionListener(this);
        l.add(b4);
        l2.setVisible(false);
        l4.setVisible(false);
        l6.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        f.setVisible(true);
      }
  
  public void actionPerformed(ActionEvent ae){
      
      if(ae.getSource()==b1){
          try{
              conn c = new conn();
              String str = "select name,mobileNo,email from employee where employeeId = '"+t.getText()+"' ";
               ResultSet rs = c.s.executeQuery(str);
               int i = 0;
               while(rs.next()){
                   String name = rs.getString(1);
                   String mob = rs.getString(2);
                   String email = rs.getString(3);
                   l2.setVisible(true);
                   l4.setVisible(true);
                    l6.setVisible(true);
                    b3.setVisible(true);
                    b4.setVisible(true);
                    i=1;
                    l3.setText(name);
                    l5.setText(mob);
                    l7.setText(email);
               }
               if(i==0){
                   JOptionPane.showMessageDialog(null,"Id not Found");
               }
              }catch(Exception e){}
              
          
      }
      if(ae.getSource()==b3){
      try{
           conn con = new conn();
          String str = "delete from employee where employeeId = '"+t.getText()+"'";
          con.s.executeUpdate(str);
          JOptionPane.showMessageDialog(null,"deleted successfully");
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l6.setVisible(false);
                l5.setVisible(false);
                l7.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
      

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Exception occured while deleting record "+ex);
            }
      }
      
       if(ae.getSource()==b2){
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            details d=new details();
        }
        }
      
      public static void main(String [] args){
       new Remove_Employee();
      
  }
    
}
