import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sign extends JFrame implements ActionListener {
	String username="";
	String password="";
	String moviename, movietime,daytime,seatnum;
	int totalprice,num;
	
	JButton btnlogin, btnsign;
	JTextField tusername;
	JPasswordField tpassword;

	public Sign(String moviename,String daytime,String movietime,int totalprice,String seatnum,int num) {

		this.moviename = moviename;
		this.daytime=daytime;
		this.movietime = movietime;
		this.totalprice = totalprice;
		this.seatnum = seatnum;
		this.num=num;
		
		setTitle("注册");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JPanel jp = new JPanel(new GridLayout(4, 1));

		JPanel h1 = new JPanel();
		JLabel l1 = new JLabel("账号");
		tusername = new JTextField(12);
		h1.add(l1);
		h1.add(tusername);
		jp.add(h1);

		JPanel h2 = new JPanel();
		JLabel l2 = new JLabel("密码");
		tpassword = new JPasswordField(12);
		h2.add(l2);
		h2.add(tpassword);
		jp.add(h2);

		JPanel h3 = new JPanel();
		btnlogin = new JButton("注册");
		btnlogin.addActionListener(this);
		btnsign = new JButton("重置");
		btnsign.addActionListener(this);
		h3.add(btnlogin);
		h3.add(btnsign);
		jp.add(h3);

		add(jp);

		setBounds(200, 200, 500, 500);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String choose = e.getActionCommand();
		if (choose == "注册") {
			username = tusername.getText();
			password = new String(tpassword.getPassword());
			if ((username.equals(""))&&(password.equals(""))) {
				JOptionPane.showMessageDialog(this, "请输入用户名和密码", "通知", JOptionPane.ERROR_MESSAGE);
			} else {
				setVisible(false);
				Check check = new Check(username, password,moviename,daytime,movietime,totalprice,seatnum,num);
				dispose();

			}

		} else if (choose == "重置") {
			tpassword.setText("");
			tusername.setText("");
		}
	}
}