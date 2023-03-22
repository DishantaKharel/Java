import javax.swing.*;     //importing all files from swing package
import java.awt.*;        //importing all files from awt package
/**
 * Creates a GUI for student registration form
 *
 * Dishant kharel
 * @version (a version number or a date)
 */
public class gui
{
    public gui()
    {
        JFrame jf = new JFrame("Form1");           //creating a frame, everything is added in frame and frame is displayed
        JLabel jl1 = new JLabel("Student ID:");    //creating a label according to the needs
        JLabel jl2 = new JLabel("School Year:");
        JLabel jl3 = new JLabel("First Name:");
        JLabel jl4 = new JLabel("Last Name:");
        JLabel jl5 = new JLabel("Middle Name:");
        JLabel jl6 = new JLabel("Address:");
        JLabel jl7 = new JLabel("Date of Birth:");
        JLabel jl8 = new JLabel("Place of Birth:");
        JLabel jl9 = new JLabel("Age:");
        JLabel jl10 = new JLabel("Gender:");
        JLabel jl11 = new JLabel("Status:");
        JLabel jl12 = new JLabel("Year:");
        JLabel jl13 = new JLabel("Guardian:");
        JLabel jl14 = new JLabel("Relation:");
        JLabel jl15 = new JLabel("Address:");
        JLabel jl16 = new JLabel("Contact#:");
        JLabel jl17 = new JLabel("0 OF 0");
        JLabel head = new JLabel("Students Registration Form");
        
        JTextField jf1 = new JTextField();       //creates a input box where user can enter datas
        JTextField jf2 = new JTextField();
        JTextField jf3 = new JTextField();
        JTextField jf4 = new JTextField();
        JTextField jf5 = new JTextField();
        JTextField jf6 = new JTextField();
        JTextField jf7 = new JTextField();
        JTextField jf8 = new JTextField();
        JTextArea jt9 = new JTextArea();         //creates a input box with more area where users can enter multiple line of datas
        JTextArea jt10 = new JTextArea();
        JTextArea jt11 = new JTextArea();
        
        JRadioButton jr1 = new JRadioButton(" Male");         //creates a radio button
        JRadioButton jr2 = new JRadioButton(" Female");
        
        String sclyear[] = {"2013-2014","2014-2015","2015-2016"};     //creating a string array to display it in the combobox
        JComboBox jc1 = new JComboBox(sclyear);                       //creates a combobox and uses the string array to show the multiple datas
        String status[] = {"Single","Married","It's Complicated"};
        JComboBox jc2 = new JComboBox(status);
        String dob[] = {"2013-02-12","2014-11-23","2015-01-01","2012-03-30"};
        JComboBox jc3 = new JComboBox(dob);
        String year[] = {"1st","2nd","3rd"};
        JComboBox jc4 = new JComboBox(year);
        
        JButton jb1 = new JButton("New");             //creates a button 
        JButton jb2 = new JButton("Save");
        JButton jb3 = new JButton("|<");
        JButton jb4 = new JButton("<<");
        JButton jb5 = new JButton(">>");
        JButton jb6 = new JButton(">|");
        
        head.setFont(new Font("Monaco",Font.BOLD,25));    //giving a decoration to one of the label(according to the need) 
        
        head.setBounds(250,5,350,50);    //setting the position according to the needs (x-axis,y-axis,width,height) respectively
        
        jl1.setBounds(20,80,65,25);
        jf1.setBounds(95,80,90,25);
        jl2.setBounds(600,80,75,25);
        jc1.setBounds(685,80,110,25);
        
        jl3.setBounds(30,120,65,25);
        jf2.setBounds(105,120,150,25);
        jl4.setBounds(285,120,65,25);
        jf3.setBounds(360,120,150,25);
        jl5.setBounds(550,120,80,25);
        jf4.setBounds(640,120,155,25);
        
        jl6.setBounds(40,160,65,25);
        jt9.setBounds(105,160,150,45);
        jl7.setBounds(280,160,75,25);
        jc3.setBounds(365,160,120,25);
        jl8.setBounds(530,160,80,25);
        jt10.setBounds(625,160,165,45);
        
        jl9.setBounds(60,220,30,25);
        jf5.setBounds(95,220,60,25);
        jl10.setBounds(300,220,50,25);
        jr1.setBounds(360,220,63,25);
        jr2.setBounds(420,220,70,25);
        jl11.setBounds(565,220,50,25);
        jc2.setBounds(625,220,120,25);
        
        jl12.setBounds(60,260,150,25);
        jc4.setBounds(100,260,130,25);
        jl13.setBounds(300,260,150,25);
        jf6.setBounds(365,260,150,25);
        jl14.setBounds(560,260,150,25);
        jf7.setBounds(620,260,150,25);
        
        jl15.setBounds(60,300,150,25);
        jt11.setBounds(140,300,150,25);
        jl16.setBounds(350,300,100,25);
        jf8.setBounds(420,300,160,25);
        
        jb1.setBounds(15,400,100,25);
        jb2.setBounds(125,400,100,25);
        jb3.setBounds(235,400,100,25);
        jb4.setBounds(345,400,100,25);
        jb5.setBounds(625,400,100,40);
        jb6.setBounds(735,400,100,40);
        
        jf.getContentPane().setBackground(Color.GREEN);    //setting a layer of color infront of the frame 
        
        jf.add(head);   //adding every component to the frame
        jf.add(jl1);
        jf.add(jl2);
        jf.add(jl3);
        jf.add(jl4);
        jf.add(jl5);
        jf.add(jl6);
        jf.add(jl7);
        jf.add(jl8);
        jf.add(jl9);
        jf.add(jl10);
        jf.add(jl11);
        jf.add(jl12);
        jf.add(jl13);
        jf.add(jl14);
        jf.add(jl15);
        jf.add(jl16);
        jf.add(jl17);
        jf.add(jf1);
        jf.add(jf2);
        jf.add(jf3);
        jf.add(jf4);
        jf.add(jf5);
        jf.add(jf6);
        jf.add(jf7);
        jf.add(jf8);
        jf.add(jt9);
        jf.add(jt10);
        jf.add(jt11);
        jf.add(jr1);
        jf.add(jr2);
        jf.add(jc1);
        jf.add(jc2);
        jf.add(jc3);
        jf.add(jc4);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);
        jf.add(jb6);
        
        jf.setLayout(null);
        jf.setVisible(true);     //by default visibility of frame is false so setting it to true to be visible
        jf.setSize(900,500);     //setting the height and width of the fram
    }
    
    public static void main(String args[])
    {
        new gui();            //calling the constructor to run the code inside the constructor
    }
}
