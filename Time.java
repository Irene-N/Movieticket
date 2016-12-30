import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Time implements ActionListener{
	String moviename;
	int price;
	String movietime;
	String daytime;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
public Time(String moviename,int price){
	this.moviename=moviename;
	this.price=price;
	
	
	JFrame frm=new JFrame();
	frm.setTitle("电影场次");
	frm.setLayout(null);
	frm.setBounds(400, 200, 450, 320);
	frm.setVisible(true);
	JLabel label_1=new JLabel("今天12-20");
	label_1.setBounds(5, 35, 160, 80);
	label_1.setFont(new Font("",Font.BOLD,30));
	label_1.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_1);
	JLabel label_27=new JLabel(moviename);
	label_27.setBounds(0, 0, 300, 80);
	label_27.setFont(new Font("",Font.BOLD,30));
	label_27.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_27);
	JLabel label_3=new JLabel("11:15");
	label_3.setBounds(5, 85, 160, 80);
	label_3.setFont(new Font("",Font.BOLD,20));
	label_3.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_3);
	JLabel label_9=new JLabel("13:23散场");
	label_9.setBounds(5, 115, 160, 80);
	label_9.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_9.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_9);
	btn1=new JButton();
	 btn1.setText("购买");
	 btn1.setBounds(395, 114, 120, 30);
	 frm.getContentPane().add(btn1);
	 btn1.addActionListener(this);
	
	JLabel label_4=new JLabel("13:40");
	label_4.setBounds(5, 165, 160, 80);
	label_4.setFont(new Font("",Font.BOLD,20));
	label_4.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_4);
	JLabel label_10=new JLabel("15:48散场");
	label_10.setBounds(5, 195, 160, 80);
	label_10.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_10.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_10);
	btn2=new JButton();
	 btn2.setText("购买");
	 btn2.setBounds(395, 194, 120, 30);
	 frm.getContentPane().add(btn2);
	 btn2.addActionListener(this);
	JLabel label_5=new JLabel("16:05");
	label_5.setBounds(5, 245, 160, 80);
	label_5.setFont(new Font("",Font.BOLD,20));
	label_5.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_5);
	JLabel label_11=new JLabel("18:13散场");
	label_11.setBounds(5, 275, 160, 80);
	label_11.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_11.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_11);
	btn3=new JButton();
	 btn3.setText("购买");
	 btn3.setBounds(395, 274, 120, 30);
	 frm.getContentPane().add(btn3);
	 btn3.addActionListener(this);
	 
	JLabel label_6=new JLabel("18:30");
	label_6.setBounds(5, 325, 160, 80);
	label_6.setFont(new Font("",Font.BOLD,20));
	label_6.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_6);
	JLabel label_12=new JLabel("20:38散场");
	label_12.setBounds(5, 355, 160, 80);
	label_12.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_12.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_12);
	btn4=new JButton();
	 btn4.setText("购买");
	 btn4.setBounds(395, 354, 120, 30);
	 frm.getContentPane().add(btn4);
	 btn4.addActionListener(this);
	JLabel label_7=new JLabel("20:55");
	label_7.setBounds(5, 405, 160, 80);
	label_7.setFont(new Font("",Font.BOLD,20));
	label_7.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_7);
	JLabel label_13=new JLabel("22:23散场");
	label_13.setBounds(5, 435, 160, 80);
	label_13.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_13.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_13);
	btn5=new JButton();
	 btn5.setText("购买");
	 btn5.setBounds(395, 434, 120, 30);
	 frm.getContentPane().add(btn5);
	 btn5.addActionListener(this);
	 
	JLabel label_8=new JLabel("21:40");
	label_8.setBounds(5, 485, 160, 80);
	label_8.setFont(new Font("",Font.BOLD,20));
	label_8.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_8);
	JLabel label_14=new JLabel("23:38散场");
	label_14.setBounds(5, 515, 160, 80);
	label_14.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_14.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_14);
	btn6=new JButton();
	 btn6.setText("购买");
	 btn6.setBounds(395, 514, 120, 30);
	 frm.getContentPane().add(btn6);
	 btn6.addActionListener(this);
	 
	 
	 
	 
	 
	 
	 
	 
	JLabel label_2=new JLabel("明天12-21");
	label_2.setBounds(705, 35, 160, 80);
	label_2.setFont(new Font("",Font.BOLD,30));
	label_2.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_2);
	JLabel label_28=new JLabel("所选电影:");
	label_28.setBounds(705, 45, 160, 80);
	label_28.setFont(new Font("",Font.BOLD,30));
	label_28.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_27);
	JLabel label_15=new JLabel("11:15");
	label_15.setBounds(705, 85, 160, 80);
	label_15.setFont(new Font("",Font.BOLD,20));
	label_15.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_15);
	JLabel label_16=new JLabel("13:23散场");
	label_16.setBounds(705, 115, 160, 80);
	label_16.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_16.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_16);
	btn7=new JButton();
	 btn7.setText("购买");
	 btn7.setBounds(1095, 114, 120, 30);
	 frm.getContentPane().add(btn7);
	 btn7.addActionListener(this);
	
	JLabel label_17=new JLabel("13:40");
	label_17.setBounds(705, 165, 160, 80);
	label_17.setFont(new Font("",Font.BOLD,20));
	label_17.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_17);
	JLabel label_18=new JLabel("15:48散场");
	label_18.setBounds(705, 195, 160, 80);
	label_18.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_18.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_18);
	btn8=new JButton();
	 btn8.setText("购买");
	 btn8.setBounds(1095, 194, 120, 30);
	 frm.getContentPane().add(btn8);
	 btn8.addActionListener(this);
	 
	JLabel label_19=new JLabel("16:05");
	label_19.setBounds(705, 245, 160, 80);
	label_19.setFont(new Font("",Font.BOLD,20));
	label_19.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_19);
	JLabel label_20=new JLabel("18:13散场");
	label_20.setBounds(705, 275, 160, 80);
	label_20.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_20.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_20);
	btn9=new JButton();
	 btn9.setText("购买");
	 btn9.setBounds(1095, 274, 120, 30);
	 frm.getContentPane().add(btn9);
	 btn9.addActionListener(this);
	 
	JLabel label_21=new JLabel("18:30");
	label_21.setBounds(705, 325, 160, 80);
	label_21.setFont(new Font("",Font.BOLD,20));
	label_21.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_21);
	JLabel label_22=new JLabel("20:38散场");
	label_22.setBounds(705, 355, 160, 80);
	label_22.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_22.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_22);
	btn10=new JButton();
	 btn10.setText("购买");
	 btn10.setBounds(1095, 354, 120, 30);
	 frm.getContentPane().add(btn10);
	 btn10.addActionListener(this);
	 
	JLabel label_23=new JLabel("20:55");
	label_23.setBounds(705, 405, 160, 80);
	label_23.setFont(new Font("",Font.BOLD,20));
	label_23.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_23);
	JLabel label_24=new JLabel("22:23散场");
	label_24.setBounds(705, 435, 160, 80);
	label_24.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_24.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_24);
	btn11=new JButton();
	 btn11.setText("购买");
	 btn11.setBounds(1095,434, 120, 30);
	 frm.getContentPane().add(btn11);
	 btn11.addActionListener(this);
	 
	JLabel label_25=new JLabel("21:40");
	label_25.setBounds(705, 485, 160, 80);
	label_25.setFont(new Font("",Font.BOLD,20));
	label_25.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_25);
	JLabel label_26=new JLabel("23:38散场");
	label_26.setBounds(705, 515, 160, 80);
	label_26.setFont(new Font("",Font.HANGING_BASELINE,15));
	label_26.setHorizontalAlignment(JLabel.CENTER);
	frm.getContentPane().add(label_26);
	btn12=new JButton();
	 btn12.setText("购买");
	 btn12.setBounds(1095, 514, 120, 30);
	 frm.getContentPane().add(btn12);
	 btn12.addActionListener(this);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(btn1.equals(e.getSource())){
		daytime="12-20";
		movietime="11:15";
	}
	else if(btn2.equals(e.getSource())){
		daytime="12-20";
		movietime="13:40";
	}
	else if(btn3.equals(e.getSource())){
		daytime="12-20";
		movietime="16:05";
	}
	else if(btn4.equals(e.getSource())){
		daytime="12-20";
		movietime="18:30";
	}
	else if(btn5.equals(e.getSource())){
		daytime="12-20";
		movietime="20:55";
	}
	else if(btn6.equals(e.getSource())){
		daytime="12-20";
		movietime="21:40";
	}
	else if(btn7.equals(e.getSource())){
		daytime="12-21";
		movietime="11:15";
	}
	else if(btn8.equals(e.getSource())){
		daytime="12-21";
		movietime="13:40";
	}
	else if(btn9.equals(e.getSource())){
		daytime="12-21";
		movietime="16:05";
	}
	else if(btn10.equals(e.getSource())){
		daytime="12-21";
		movietime="18:30";
	}
	else if(btn11.equals(e.getSource())){
		daytime="12-21";
		movietime="20:55";
	}
	else {
		daytime="12-21";
		movietime="21:40";
	}
	MovieTickets movietickets=new MovieTickets(moviename,daytime,movietime,price);
}
}