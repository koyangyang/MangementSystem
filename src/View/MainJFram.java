package View;

import javax.swing.*;
import java.awt.*;

public class MainJFram {
	private static JTextField name1;
	private static JTextField pwd1;
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("购物管理系统");
        frame.setSize(500 , 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel jPanel1=new JPanel();
        frame.getContentPane().add(jPanel1,BorderLayout.CENTER);
        jPanel1.setLayout(null);
        
        JLabel Label1 = new JLabel("用户名：");
        Label1.setFont(new Font("����", Font.PLAIN, 20));
        Label1.setBounds(68, 107, 103, 50);
        jPanel1.add(Label1);
        
        JLabel Label2 = new JLabel("密码：");
        Label2.setFont(new Font("����", Font.PLAIN, 20));
        Label2.setBounds(68, 167, 103, 50);
        jPanel1.add(Label2);
        
        name1 = new JTextField();
        name1.setBounds(181, 107, 210, 50);
        jPanel1.add(name1);
        name1.setColumns(10);
        
        pwd1 = new JTextField();
        pwd1.setColumns(10);
        pwd1.setBounds(181, 162, 210, 50);
        jPanel1.add(pwd1);
        
        JButton login = new JButton("登录");
        login.setBounds(68, 265, 124, 38);
        jPanel1.add(login);
        
        JButton zhece = new JButton("注册");
        zhece.setBounds(267, 265, 124, 38);
        jPanel1.add(zhece);
        
        JLabel tittle = new JLabel("购物管理系统");
        tittle.setForeground(Color.RED);
        tittle.setFont(new Font("����", Font.PLAIN, 40));
        tittle.setBounds(119, 10, 239, 72);
        jPanel1.add(tittle);
    }
}
