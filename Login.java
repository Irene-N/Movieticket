import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 
public class Login extends JFrame implements ActionListener {
 JButton btnlogin,btnsign;
 JTextField tusername;
 JPasswordField tpassword;
 String moviename, movietime,daytime,seatnum;
 int totalprice,num;
 
 public Login(String moviename,String daytime,String movietime,int totalprice,String seatnum,int num){
	this.moviename = moviename;
	this.daytime=daytime;
	this.movietime = movietime;
	this.totalprice = totalprice;
	this.seatnum = seatnum;
	this.num=num;
	 
  setTitle("登录");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLocationRelativeTo(null);
  setLayout(new FlowLayout());
        
        JPanel jp = new JPanel(new GridLayout(5, 1));
        JPanel weicome=new JPanel();
        JLabel wei=new JLabel("请登录");
        weicome.add(wei);
        jp.add(weicome);
        
        JPanel h1=new JPanel();
        JLabel l1=new JLabel("账号");
        tusername= new JTextField(12);
        h1.add(l1);
        h1.add(tusername);
        jp.add(h1);
        
        JPanel h2=new JPanel();
        JLabel l2=new JLabel("密码");
        tpassword= new JPasswordField(12);
        h2.add(l2);
        h2.add(tpassword);
        jp.add(h2);
        
        JPanel h3=new JPanel();
        btnlogin=new JButton("登陆");
        btnlogin.addActionListener(this);
        btnsign=new JButton("注册");
        btnsign.addActionListener(this);
        h3.add(btnlogin);
        h3.add(btnsign);
        jp.add(h3);
        
        add(jp);
        
        setBounds(200, 200, 500, 500);
        setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
  String choose=e.getActionCommand();
  if(choose=="登陆"){
   String username=tusername.getText();
   String password=new String(tpassword.getPassword());
   if((username.equals("admin"))&&(password.equals("123"))){
    setVisible(false);
    Check check=new Check(username,password,moviename,daytime,movietime,totalprice,seatnum,num);
    dispose();
    }
   else{
    JOptionPane.showMessageDialog(this, "用户名或者密码错误.", "通知", JOptionPane.ERROR_MESSAGE);   
    tpassword.setText("");
    }
   }
  else if(choose=="注册"){
   setVisible(false);
   Sign sign=new Sign(moviename,daytime,movietime,totalprice,seatnum,num);
   dispose();
  }
  }
}