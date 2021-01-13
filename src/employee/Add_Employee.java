
package employee;
//import java.sql.*;
import java.awt.*;
import java.awt.event.*;
//import java.io.*;
import javax.swing.*;



 class Add_Employee implements ActionListener {
     JFrame f;
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
     JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
     JButton b1,b2,b3;
     ImageIcon i1,i3;
     
     Add_Employee(){
         
         f=new JFrame("Add_Employee");
         f.setSize(900,600);
         f.setLocation(200,50);
        //f.setFont(new Font("serif",Font.BOLD,15));
         f.setVisible(true);
         
         i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/add_employee.jpg"));
         Image i2 = i1.getImage().getScaledInstance(900,600,Image.SCALE_DEFAULT);
         i3 = new ImageIcon(i2);
                 
         
         l1 = new JLabel(i3);
          l1.setBounds(0,0,900,600);
          //l1.setIcon(i3);
          f.add(l1);
          
          l2 = new JLabel("NAME");
          l2.setBounds(50,50,100,50);
          l2.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l2);
          t1 = new JTextField();
           t1.setBounds(200,70,180,25);
           l1.add(t1);
           
           
           
          
            l3 = new JLabel(" FATHER'S NAME");
          l3.setBounds(40,100,150,50);
          l3.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l3);
          
          t2 = new JTextField();
           t2.setBounds(200,120,180,25);
           l1.add(t2);
           
          
            l4 = new JLabel(" AGE");
          l4.setBounds(40,150,150,50);
          l4.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l4);
          t3 = new JTextField();
           t3.setBounds(200,170,180,25);
           l1.add(t3);
           
              
            l5 = new JLabel(" MOBILE NO");
          l5.setBounds(40,200,150,50);
          l5.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l5);
          
          t4 = new JTextField();
           t4.setBounds(200,220,180,25);
           l1.add(t4);
           
          
           
           l6 = new JLabel(" EMAIL");
          l6.setBounds(40,250,150,50);
          l6.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l6);
          
          t5 = new JTextField();
           t5.setBounds(200,270,180,25);
           l1.add(t5);
           
           
           l7 = new JLabel("ADHAR NO");
          l7.setBounds(500,50,150,50);
          l7.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l7);
          t6 = new JTextField();
           t6.setBounds(650,70,180,25);
           l1.add(t6);
           
           l8 = new JLabel(" EMPLOYEE ID");
          l8.setBounds(490,100,150,50);
          l8.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l8);
          t7 = new JTextField();
           t7.setBounds(650,120,180,25);
           l1.add(t7);
           
           
          l9 = new JLabel(" JOB POST");
          l9.setBounds(490,150,150,50);
          l9.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l9);
          t8 = new JTextField();
           t8.setBounds(650,170,180,25);
           l1.add(t8);
           
           
       l10 = new JLabel(" EDUCATION");
          l10.setBounds(490,200,150,50);
          l10.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l10);
          t9 = new JTextField();
           t9.setBounds(650,220,180,25);
           l1.add(t9);
           
       
             l11 = new JLabel(" ADDRESS");
          l11.setBounds(490,250,150,50);
          l11.setFont(new Font("serif",Font.ITALIC,20));
          l1.add(l11);
           t10 = new JTextField();
           t10.setBounds(650,270,180,25);
           l1.add(t10);
           
           
           b1 = new JButton("SUBMIT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,450,150,40);
        b1.addActionListener(this);
       
        l1.add(b1);
        
      
        
         b2 = new JButton("CANCEL");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,450,150,40);
       b2.addActionListener(this);
        l1.add(b2);
         f.setVisible(true);
     }
         
         
  public void actionPerformed(ActionEvent ae){
       String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        
        if(ae.getSource()== b1){
            try{
                conn cc = new conn();
               
               String q = "insert into employee values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"')";
               cc.s.executeUpdate(q);
               JOptionPane.showMessageDialog(null, "Details Successfully Inserted");
               f.setVisible(false);
               new details();
                }catch(Exception ee){
                    System.out.println("The error is:"+ee);
                }
            
        }
        if(ae.getSource() == b2){
                        
              f.setVisible(false);
               details d1 = new details();
                }
        }
      
   
 public static void main(String[] args){
      new Add_Employee(); 
 }
    
}
