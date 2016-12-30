import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Movie implements ActionListener{

	public String moviename;
    int price;
	public int movietime;
	JButton btn1,btn2,btn3,btn4,btn5,btn6;

	public Movie() {
		JFrame frm = new JFrame();
		frm.setTitle("电影信息");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(400, 200, 450, 320);
		frm.setVisible(true);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frm.getContentPane().add(panel);
		JLabel label_1 = new JLabel("热门影片");
		label_1.setBounds(640, 20, 160, 80);
		label_1.setFont(new Font("", Font.BOLD, 40));
		label_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label_1);
		JLabel label_2 = new JLabel("电影名称");
		label_2.setBounds(40, 100, 160, 80);
		label_2.setFont(new Font("", Font.BOLD, 16));
		label_2.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_2);
		JLabel label_3 = new JLabel("电影类型");
		label_3.setBounds(40, 200, 160, 80);
		label_3.setFont(new Font("", Font.BOLD, 16));
		label_3.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_3);
		JLabel label_4 = new JLabel("导演");
		label_4.setBounds(40, 300, 160, 80);
		label_4.setFont(new Font("", Font.BOLD, 16));
		label_4.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_4);
		JLabel label_5 = new JLabel("主演");
		label_5.setBounds(40, 430, 160, 80);
		label_5.setFont(new Font("", Font.BOLD, 16));
		label_5.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_5);
		JLabel label_6 = new JLabel("单价");
		label_6.setBounds(40, 530, 160, 80);
		label_6.setFont(new Font("", Font.BOLD, 16));
		label_6.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_6);
		JLabel label_7 = new JLabel("你的名字");
		label_7.setBounds(240,100, 160, 80);
		label_7.setFont(new Font("", Font.BOLD, 20));
		label_7.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_7);
		JLabel label_66 = new JLabel("爱情／动画");
		label_66.setBounds(240, 200, 160, 80);
		label_66.setFont(new Font("", Font.BOLD, 18));
		label_66.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_66);
		JLabel label_67 = new JLabel("神木隆之介／上白石萌音");
		label_67.setBounds(240, 430, 160, 80);
		label_67.setFont(new Font("", Font.BOLD, 14));
		label_67.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_67);
		JLabel label_68 = new JLabel("新海诚");
		label_68.setBounds(240, 300, 160, 80);
		label_68.setFont(new Font("", Font.BOLD, 18));
		label_68.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_68);
		JLabel label_69 = new JLabel("37元");
		label_69.setBounds(240, 530, 160, 80);
		label_69.setFont(new Font("", Font.BOLD, 16));
		label_69.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_69);
	
		JLabel label_8 = new JLabel("血站钢锯岭");
		label_8.setBounds(440, 100, 160, 80);
		label_8.setFont(new Font("", Font.BOLD, 20));
		label_8.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_8);
		JLabel label_88 = new JLabel("历史／战争");
		label_88.setBounds(440, 200, 160, 80);
		label_88.setFont(new Font("", Font.BOLD, 18));
		label_88.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_88);
		JLabel label_89 = new JLabel("安德鲁加菲尔德");
		label_89.setBounds(440, 430, 160, 80);
		label_89.setFont(new Font("", Font.BOLD, 16));
		label_89.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_89);
		JLabel label_90 = new JLabel("梅尔吉布森");
		label_90.setBounds(440, 300, 160, 80);
		label_90.setFont(new Font("", Font.BOLD, 18));
		label_90.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_90);
		JLabel label_91 = new JLabel("41元");
		label_91.setBounds(440, 530, 160, 80);
		label_91.setFont(new Font("", Font.BOLD, 16));
		label_91.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_91);
		
		JLabel label_9 = new JLabel("罗曼蒂克消亡史");
		label_9.setBounds(640, 100, 160, 80);
		label_9.setFont(new Font("", Font.BOLD, 20));
		label_9.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_9);
		JLabel label_99 = new JLabel("剧情／动作");
		label_99.setBounds(640, 200, 160, 80);
		label_99.setFont(new Font("", Font.BOLD, 18));
		label_99.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_99);
		JLabel label_100 = new JLabel("葛优／章子怡");
		label_100.setBounds(640, 430, 160, 80);
		label_100.setFont(new Font("", Font.BOLD, 16));
		label_100.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_100);
		JLabel label_1000 = new JLabel("程耳");
		label_1000.setBounds(640, 300, 160, 80);
		label_1000.setFont(new Font("", Font.BOLD, 18));
		label_1000.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_1000);
		JLabel label_990 = new JLabel("35元");
		label_990.setBounds(640, 530, 160, 80);
		label_990.setFont(new Font("", Font.BOLD, 16));
		label_990.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_990);
		
		
		JLabel label_10 = new JLabel("长城");
		label_10.setBounds(880, 100, 160, 80);
		label_10.setFont(new Font("", Font.BOLD, 20));
		label_10.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_10);
		JLabel label_1001 = new JLabel("剧情／动作");
		label_1001.setBounds(880, 200, 160, 80);
		label_1001.setFont(new Font("", Font.BOLD, 18));
		label_1001.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_1001);
		JLabel label_101 = new JLabel("马特达蒙／景甜");
		label_101.setBounds(880, 430, 160, 80);
		label_101.setFont(new Font("", Font.BOLD, (int) 16.5));
		label_101.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_101);
		JLabel label_102 = new JLabel("张艺谋");
		label_102.setBounds(880, 300, 160, 80);
		label_102.setFont(new Font("", Font.BOLD, 18));
		label_102.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_102);
		JLabel label_103= new JLabel("40元");
		label_103.setBounds(880, 530, 160, 80);
		label_103.setFont(new Font("", Font.BOLD, 16));
		label_103.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_103);
		
		
		
		JLabel label_11 = new JLabel("铁道飞虎");
		label_11.setBounds(1080, 100, 160, 80);
		label_11.setFont(new Font("", Font.BOLD, 20));
		label_11.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_11);
		JLabel label_111 = new JLabel("喜剧／动作");
		label_111.setBounds(1080, 200, 160, 80);
		label_111.setFont(new Font("", Font.BOLD, 18));
		label_111.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_111);
		JLabel label_112 = new JLabel("成龙/黄子韬");
		label_112.setBounds(1080, 430, 160, 80);
		label_112.setFont(new Font("", Font.BOLD, 16));
		label_112.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_112);
		JLabel label_113 = new JLabel("丁晟");
		label_113.setBounds(1080, 300, 160, 80);
		label_113.setFont(new Font("", Font.BOLD, 18));
		label_113.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_113);
		JLabel label_114= new JLabel("42元");
		label_114.setBounds(1080, 530, 160, 80);
		label_114.setFont(new Font("", Font.BOLD, 16));
		label_114.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_114);
		
		
		JLabel label_12 = new JLabel("摆渡人");
		label_12.setBounds(1280, 100, 160, 80);
		label_12.setFont(new Font("", Font.BOLD, 20));
		label_12.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_12);
		JLabel label_122 = new JLabel("喜剧／爱情");
		label_122.setBounds(1280, 200, 160, 80);
		label_122.setFont(new Font("", Font.BOLD, 18));
		label_122.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_122);
		JLabel label_123 = new JLabel("梁朝伟／金城武");
		label_123.setBounds(1280, 430, 160, 80);
		label_123.setFont(new Font("", Font.BOLD, 16));
		label_123.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_123);
		JLabel label_124 = new JLabel("张嘉佳");
		label_124.setBounds(1280, 300, 160, 80);
		label_124.setFont(new Font("", Font.BOLD, 18));
		label_124.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_124);
		JLabel label_125= new JLabel("38元");
		label_125.setBounds(1280, 530, 160, 80);
		label_125.setFont(new Font("", Font.BOLD, 16));
		label_125.setHorizontalAlignment(JLabel.LEFT);
		panel.add(label_125);
		
		
		btn1 = new JButton();
		btn1.setText("购买");
		btn1.setBounds(240, 640, 120, 30);
		panel.add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton();
		btn2.setText("购买");
		btn2.setBounds(440, 640, 120, 30);
		panel.add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton();
		btn3.setText("购买");
		btn3.setBounds(640, 640, 120, 30);
		panel.add(btn3);
		btn3.addActionListener(this);
		
		btn4 = new JButton();
		btn4.setText("购买");
		btn4.setBounds(880, 640, 120, 30);
		panel.add(btn4);
		btn4.addActionListener(this);
		
		btn5 = new JButton();
		btn5.setText("购买");
		btn5.setBounds(1080, 640, 120, 30);
		panel.add(btn5);
		btn5.addActionListener(this);
		
		btn6 = new JButton();
		btn6.setText("购买");
		btn6.setBounds(1280, 640, 120, 30);
		panel.add(btn6);
		btn6.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {
		if(btn1.equals(e.getSource()) ){
			moviename="你的名字";
			price=37;
		}
		else if(btn2.equals(e.getSource())){
			moviename="血战钢锯岭";
			price=41;
		}
		else if(btn3.equals(e.getSource())){
			moviename="罗曼蒂克消亡史";
			price=35;
		}
		else if(btn4.equals(e.getSource())){
			moviename="长城";
			price=40;
		}
		else if(btn5.equals(e.getSource())){
			moviename="铁道飞虎";
			price=42;
		}
		else if(btn6.equals(e.getSource())){
			moviename="摆渡人";
			price=38;
		}
		else{
			moviename="无";
		}
		
		Time time=new Time(moviename,price);
	}
}
