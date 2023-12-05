import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator{
	String s1="";
	String result="";
	JLabel jlab;
	JTextField jtf;
	Calculator(){
		 JFrame jfrm = new JFrame("Calculator");
		 jfrm.setLayout(new FlowLayout());
		 jfrm.setSize(1000,2000);
		 jfrm.setVisible(true);
		 jtf = new JTextField(16);
                 jfrm.add(jtf);

		 
		 jlab = new JLabel("Enter");
                 jfrm.add(jlab);
		 JButton jb0 = new JButton("0");
		 JButton jb = new JButton("1");
		 JButton jb2 = new JButton("2");
		 JButton jb3 = new JButton("3");
		 JButton jb4 = new JButton("4");
		 JButton jb5 = new JButton("5");
		 JButton jb6 = new JButton("6");
		 JButton jb7 = new JButton("7");
		 JButton jb8 = new JButton("8");
		 JButton jb9 = new JButton("9");
		 JButton jbA = new JButton("+");
		 JButton jbS = new JButton("-");
		 JButton jbM = new JButton("x");
		 JButton jbD = new JButton("/");
		 JButton jbE = new JButton("%");
		 
		 
                 jfrm.add(jb0);
		 jfrm.add(jb);
		 jfrm.add(jb2);
		 jfrm.add(jb3);
		 jfrm.add(jb4);
		 jfrm.add(jb5);
		 jfrm.add(jb6);
		 jfrm.add(jb7);
		 jfrm.add(jb8);
		 jfrm.add(jb9);
		 jfrm.add(jbA);
		 jfrm.add(jbS);
		 jfrm.add(jbM);
		 jfrm.add(jbD);
		 jfrm.add(jbE);
		 
		 jb.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "1";
                 jtf.setText(result);
            }
         });

                 jb2.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "2";
                 jtf.setText(result);
            }
         });
       
                 jb3.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "3";
                 jtf.setText(result);
            }
         });
       
         jb4.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "4";
                 jtf.setText(result);
            }
         });
         
         jb5.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "5";
                 jtf.setText(result);
            }
         });
         
         jb6.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "6";
                 jtf.setText(result);
            }
         });
         
         jb7.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "7";
                 jtf.setText(result);
            }
         });
         
         
         jb8.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "8";
                 jtf.setText(result);
            }
         });
       
         jb9.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "9";
                 jtf.setText(result);
            }
         });
       
         jb0.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                 s1 = jtf.getText();
                 result = s1 + "0";
                 jtf.setText(result);
            }
         });
       
         
       
         
       
       
         
       
         
       
         
		 
	}

	public static void main(String args[]){
		Calculator c1 = new Calculator();
		}
		
}                                                                                                       



