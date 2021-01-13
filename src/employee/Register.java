
package employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;
public class Register implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3;
    JPasswordField p;
    JTextField t1;
    JButton b1;
    
    Register(){
        
        f = new JFrame("Resister YourSelf");
        f.setSize(500,200);
        f.setLocation(150,150);
        
        l1 = new JLabel();
        l1.setLayout(null);
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/register.jpg"));
       Image i2 = i1.getImage().getScaledInstance(500,200,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
         l1.setBounds(0,0,500,300);
         l1.setLayout(null);
      l1.setIcon(i1);
        f.add(l1);
        
        l2 = new JLabel("USERNAME");
        l2.setBounds(20,20,200,20);
        l2.setFont(new Font("serif",Font.BOLD,20));
        l1.add(l2); 
        
        t1 = new JTextField();
        t1.setBounds(200,20,150,20);
        t1.setFont(new Font("serif",Font.BOLD,20));
        l1.add(t1); 
        
        l2 = new JLabel("PASSWORD");
        l2.setBounds(20,75,200,20);
        l2.setFont(new Font("serif",Font.BOLD,20));
        l1.add(l2); 
        
        p = new JPasswordField();
        p.setBounds(200,75,150,20);
        p.setFont(new Font("serif",Font.BOLD,20));
        l1.add(p);
        
        b1 = new JButton("SUBMIT");
        b1.setBounds(100,125,125,20);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l1.add(b1);
        
        f.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae ){
        String a = t1.getText();
        String b = p.getText();
        if(ae.getSource()==b1)
        try{
            conn n = new conn();
            String str = "insert into login values('"+a+"','"+b+"')";
            n.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null,"Details Submitted Successfully");
            f.setVisible(false);
             new details();
            }catch(Exception e){
                System.out.println("error is : "+e);
            
        }
        
    }
    
    public static void main(String [] args){
        Register r = new Register();
    } 
    
}
