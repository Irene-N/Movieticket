import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MovieTickets extends JFrame implements ActionListener {
	Label lmoviename, lmovienames, lmovietime, lmovietimes, lremain, lremains, lprice;
	TextField tremain, tprices, tSold, tTotal;
	String moviename, movietime,daytime;
	String seatnum = " ";
	JButton seat, screen, pay, exti;
	int totalprice = 0;
	int remain = 72;
	int price = 0;
	int num=0;

	@SuppressWarnings("deprecation")
	public MovieTickets(String moviename, String daytime,String movietime, int price) {
		this.moviename = moviename;
		this.daytime=daytime;
		this.movietime = movietime;
		this.price = price;

		setTitle("选座");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.blue);
		setFont(new Font("TimesRoman", Font.BOLD, 10));
		JPanel ma = new JPanel(new GridLayout(3, 1, 3, 3));
		JPanel ma1 = new JPanel(new GridLayout(2, 4, 6, 8));
		JPanel ma2 = new JPanel(new GridLayout(10, 9));

		lmoviename = new Label("今日电影：");
		lmovienames = new Label(moviename);
		lmovietime = new Label("时间：");
		lmovietimes = new Label(movietime);
		lremain = new Label("本场剩余票数：");
		tremain = new TextField(Integer.toString(remain) + "张", 10);
		tremain.setEditable(false);
		lprice = new Label("总价：");
		tprices = new TextField(Integer.toString(totalprice) + "元", 10);
		tprices.setEditable(false);
		ma1.add(lmoviename);
		ma1.add(lmovienames);
		ma1.add(lmovietime);
		ma1.add(lmovietimes);
		ma1.add(lremain);
		ma1.add(tremain);
		ma1.add(lprice);
		ma1.add(tprices);

		for (int i = 1; i <= 4; i++) {
			Label kong = new Label();
			ma2.add(kong);
		}
		screen = new JButton("屏幕");
		screen.disable();
		ma2.add(screen);
		for (int i = 1; i <= 4; i++) {
			Label kong = new Label();
			ma2.add(kong);
		}

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 9; j++) {
				seat = new JButton(Integer.toString(i) + "排" + Integer.toString(j) + "号");
				ma2.add(seat);
				seat.addActionListener(this);
			}
		}
		for (int i = 1; i <= 3; i++) {
			Label kong = new Label();
			ma2.add(kong);
		}
		pay = new JButton("确认支付");
		exti = new JButton("取消");
		ma2.add(pay);
		pay.addActionListener(this);
		Label akong = new Label();
		ma2.add(akong);
		ma2.add(exti);
		exti.addActionListener(this);
		for (int i = 1; i <= 3; i++) {
			Label kong = new Label();
			ma2.add(kong);
		}

		ma.add(ma1);
		ma.add(ma2);

		add(ma);
		setBounds(200, 200, 900, 900);
		setVisible(true);

	}

	@SuppressWarnings("deprecation")

	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) (e.getSource());
		if (btn.getLabel() == "确认支付") {
			setVisible(false);
			Login login = new Login(moviename,daytime,movietime,totalprice,seatnum,num);
			dispose();
		} else if (btn.getLabel() == "取消") {
			setVisible(false);
			dispose();
		} else {
			if (btn.getLabel() != "已售出") {
				seatnum = e.getActionCommand();
				remain--;
				num++;
				totalprice += price;
				tremain.setText(Integer.toString(remain) + "张");
				tprices.setText(Integer.toString(totalprice) + "元");
			}
			btn.setLabel("已售出");
			btn.disable();
			btn.setForeground(Color.RED);
		}
	}

}