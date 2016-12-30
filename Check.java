import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Check extends JFrame implements ActionListener {
	String username,password;
	String moviename, movietime,daytime,seatnum;
	int totalprice,num;
	
	JPanel ma3 = new JPanel(new GridLayout(0,7,60,9));

	public Check(String username, String password,String moviename,String daytime,String movietime,int totalprice,String seatnum,int num) {

		this.moviename = moviename;
		this.daytime=daytime;
		this.movietime = movietime;
		this.seatnum = seatnum;
		this.totalprice = totalprice;
		this.username=username;
		this.password=password;
		this.num=num;
		
		setTitle("用户信息");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JPanel ma = new JPanel(new GridLayout(3, 1));
		JPanel ma1 = new JPanel(new GridLayout(1, 2));
		JPanel ma2 = new JPanel(new GridLayout(0,7,60,9));

		JLabel name = new JLabel();
		JLabel weicome = new JLabel();
		name.setText(username);
		name.setFont(new Font("", Font.BOLD, 22));
		weicome.setText("欢迎查看您的个人用户信息！");
		name.setForeground(Color.BLUE);

		ma1.add(name);
		ma1.add(weicome);

		JLabel moviena = new JLabel();
		JLabel moviemassge = new JLabel();
		JLabel tickets = new JLabel();
		JLabel time = new JLabel();
		JLabel seat = new JLabel();
		JLabel theprice = new JLabel();
		JLabel pay = new JLabel();
		moviena.setText("电影名称");
		// movietu.setFont(new Font("",Font.BOLD,22));
		moviemassge.setText("电影时间");
		// moviemassge.setFont(new Font("",Font.BOLD,22));
		tickets.setText("票数");
		// tickets.setFont(new Font("",Font.BOLD,22));
		time.setText("电影场次");
		seat.setText("座位");
		theprice.setText("总价");
		pay.setText("操作");

		

		ma2.add(moviena);
		ma2.add(moviemassge);
		ma2.add(time);
		ma2.add(seat);
		ma2.add(tickets);
		ma2.add(theprice);
		ma2.add(pay);
		
		
		movieadd(ma3);
		

		ma.add(ma1);
		ma.add(ma2);
		ma.add(ma3);
		JButton exit=new JButton("退出");
		
		getContentPane().add(ma);
		getContentPane().add(exit);
		exit.addActionListener(this);;
		
		setBounds(100, 100, 1000, 1000);
		setVisible(true);
	}

	private void movieadd(JPanel ma3) {
		
		JTextField tmoviename = new JTextField(moviename);
		tmoviename.setEditable(false);
		JTextField tmoviemassge = new JTextField(daytime);
		tmoviemassge.setEditable(false);
		JTextField tmovietime = new JTextField(movietime);
		tmovietime.setEditable(false);
		JTextField tseat = new JTextField(seatnum);
		tseat.setEditable(false);
		JTextField tmovietickets = new JTextField(Integer.toString(num));
		tmovietickets.setEditable(false);
		JTextField tmovieprice = new JTextField(Integer.toString(totalprice));
		tmovieprice.setEditable(false);
		JButton bpay=new JButton("退票");
		bpay.addActionListener(this);
		
		ma3.add(tmoviename);
		ma3.add(tmoviemassge);
		ma3.add(tmovietime);
		ma3.add(tseat);
		ma3.add(tmovietickets);
		ma3.add(tmovieprice);
		ma3.add(bpay);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) (e.getSource());
		if (btn.getLabel() == "退票") {
			ma3.setVisible(false);
			remove(ma3);
		} else if (btn.getLabel() == "退出") {
			setVisible(false);
			dispose();
		} 
	}

}
