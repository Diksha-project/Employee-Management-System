
package employee;
 
   import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Update_employee implements ActionListener{ 
JFrame f;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
JButton b1,b2;
String E_id,dat,age;
int i=0;

    
    Update_employee(String Idee){
        super();
        
       
        f = new JFrame("Update_employee");
        f.setSize(900,600);
        f.setLocation(150,100);
        f.setBackground(Color.WHITE);
        
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/update.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,600,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
         l1.setBounds(0,0,900,600);
         l1.setLayout(null);
          //l1.setIcon(i3);
         f.add(l1);
          
          E_id = Idee;
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
           
           
           b1 = new JButton("UPDATE");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,450,150,40);
        b1.addActionListener(this);
        l1.add(b1);
        
         b2 = new JButton("CANCEL");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,450,150,40);
       b1.addActionListener(this);
        l1.add(b2);
         //f.add(l1);
          f.setVisible(true);
        ShowData(E_id);
    }
     void ShowData(String s){
         try{
        conn C3 = new conn();
        String str = "select * from employee where employeeId = '"+s+"' ";
        ResultSet rs = C3.s.executeQuery(str);
        while(rs.next()){
            i=1;
            t1.setText(rs.getString(1));
            t2.setText(rs.getString(2));
            t3.setText(rs.getString(3));
            t4.setText(rs.getString(4));
            t5.setText(rs.getString(5));
            t6.setText(rs.getString(6));
            t7.setText(rs.getString(7));
            t8.setText(rs.getString(8));
            t9.setText(rs.getString(9));
            t10.setText(rs.getString(10));
            
             }
        if(i==0){
             
               JOptionPane.showMessageDialog(null, "ID not found");
               new Search_Employee();
             }
         }catch(Exception e){}
     }
       
         
   
     
     
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==b1 && i==1 ){
            try{
                conn con = new conn();
             String s = "update employee set name = '"+t1.getText()+"',fatherName = '"+t2.getText()+"',age = '"+t3.getText()+"',mobileNo = '"+t4.getText()+"',email = '"+t5.getText()+"',adharNo = '"+t6.getText()+"',employeeId = '"+t7.getText()+"',jobPost = '"+t8.getText()+"',education = '"+t9.getText()+"',address = '"+t10.getText()+"'where employeeId = '"+E_id +"'";
              con.s.executeUpdate(s);
              f.setVisible(false);
              JOptionPane.showMessageDialog(null,"successfully updated");
              new Search_Employee();
             }catch(Exception e){
                 System.out.println("The Error Is:"+e);
             }
        }
            if(ae.getSource()==b2){
            f.setVisible(false);
            details d=new details();
            }
   }
  
public static void main(String [] args){
    new Update_employee("Update Employee");
}
}
    



