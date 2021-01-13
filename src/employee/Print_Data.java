
package employee;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;

 class Print_Data implements ActionListener {
     JFrame f;
     JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;
     String name,fname,age,mobno,email,adharno,E_id,jobpost,education,address;
     JButton b;
    
    Print_Data(String e_id){
        try{
            conn c2 = new conn();
            String str = "select * from employee where employeeId = '"+e_id+"'";
            ResultSet rs = c2.s.executeQuery(str);
            
            while(rs.next()){
                
               name = rs.getString("name");
               fname = rs.getString("fathername");
               age = rs.getString("age");
               mobno = rs.getString("mobileNo");
               email = rs.getString("email");
               adharno = rs.getString("adharNo");
               E_id = rs.getString("employeeId");
               jobpost = rs.getString("jobPost");
               education = rs.getString("education");
               address = rs.getString("address");
            }
         }catch(Exception e){
            e.printStackTrace();
        }
         f = new JFrame("Print Data");
         f.setSize(595,642);
         f.setLocation(200,50);
         
          l= new JLabel();
          l.setBounds(0,0,595,642);
          l.setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/print.jpg"));
          l.setIcon(i1);
          f.add(l);
         
          
          l1 = new JLabel("Employee Details");
          l1.setBounds(50,10,300,30);
          l1.setFont(new Font("serif" ,Font.BOLD,25));
          l.add(l1);
          
          l2 = new JLabel("Employee Id :");
          l2.setBounds(50,60,300,30);
          l2.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l2);
          
           l3 = new JLabel(E_id);
          l3.setBounds(300,60,300,30);
          l3.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l3);
          
           l4 = new JLabel("Name :");
          l4.setBounds(50,100,300,30);
          l4.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l4);
          
           l5 = new JLabel(name);
          l5.setBounds(300,90,300,30);
          l5.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l5);
          
          
           l6 = new JLabel("Father Name :");
          l6.setBounds(50,140,300,30);
          l6.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l6);
          
          
           l7 = new JLabel(fname);
          l7.setBounds(300,140,300,30);
          l7.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l7);
          
            l8 = new JLabel("Age :");
          l8.setBounds(50,180,300,30);
          l8.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l8);
          
          
            l9 = new JLabel(age);
          l9.setBounds(300,180,300,30);
          l9.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l9);
          
            l10 = new JLabel("Mobile No :");
          l10.setBounds(50,220,300,30);
          l10.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l10);
          
            l11 = new JLabel(mobno);
          l11.setBounds(300,220,300,30);
          l11.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l11);
          
           l12 = new JLabel("Email :");
          l12.setBounds(50,260,300,30);
          l12.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l12);
          
            l13 = new JLabel(email);
          l13.setBounds(300,260,300,30);
          l13.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l13);
          
            l14 = new JLabel("AdharNo :");
          l14.setBounds(50,300,300,30);
          l14.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l14);
          
            l15 = new JLabel(adharno);
          l15.setBounds(300,300,300,30);
          l15.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l15);
          
            l16 = new JLabel("JobPost");
          l16.setBounds(50,340,300,30);
          l16.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l16);
          
            l17 = new JLabel(jobpost);
          l17.setBounds(300,340,300,30);
          l17.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l17);
          
            l18 = new JLabel("Education :");
          l18.setBounds(50,380,300,30);
          l18.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l18);
          
            l19 = new JLabel(education);
          l19.setBounds(300,380,300,30);
          l19.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l19);
          
            l20 = new JLabel("Address :");
          l20.setBounds(50,420,300,30);
          l20.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l20);
          
            l21 = new JLabel(address);
          l21.setBounds(300,420,300,30);
          l21.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l21);
          
           b = new JButton("CANCIL");
          b.setBounds(50,460,100,30);
         b.setFont(new Font("serif" ,Font.BOLD,20));
          b.setBackground(Color.BLACK);
          b.setForeground(Color.WHITE);
          b.addActionListener(this);
          l.add(b);
          
           /* l23 = new JLabel("Age :");
          l23.setBounds(300,460,300,30);
          l23.setFont(new Font("serif" ,Font.BOLD,20));
          l.add(l23);*/
           f.setVisible(true);
          
          
         
        }
    public void actionPerformed(ActionEvent ae){
      if (ae.getSource()==b){
          f.setVisible(false);
           new details();
           }
    }
    
    
    public static void main(String [] args){
      Print_Data pd  = new Print_Data("print data");
    }
    
}
