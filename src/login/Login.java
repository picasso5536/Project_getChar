package login;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import List_.List;
import Product_.Product;
import Sell_.Sell;
import chat_.Chat;
import home_.Kategorie;
import request_.Request;
import signup.Auth;
import signup.Signup;
import signup.Signup_ok;

public class Login extends JFrame {
	
	JPanel contentPane, pg;
	CardLayout card;
	private JTextField id_tf, pw_tf;
	private JButton signUp_bt, login_bt, find_bt;
	private JLabel pw_lb, logo_lb, id_lb;
	
	public Login() {

		pg = new JPanel();
		pg.setLayout(card = new CardLayout());	
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1100, 700);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setLayout(null);

		id_tf = new JTextField();
		id_tf.setBounds(670, 282, 222, 28);
		contentPane.add(id_tf);
		id_tf.setColumns(10);

		pw_tf = new JTextField();
		pw_tf.setColumns(10);
		pw_tf.setBounds(670, 320, 222, 28);
		contentPane.add(pw_tf);

		signUp_bt = new JButton("회원가입");
		signUp_bt.setBounds(655, 448, 112, 37);
		signUp_bt.setBorderPainted(false);
		signUp_bt.setFocusPainted(false);
		signUp_bt.setContentAreaFilled(false);
		signUp_bt.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		signUp_bt.setForeground(Color.PINK);
		contentPane.add(signUp_bt);

		login_bt = new JButton("로그인");
		login_bt.setBounds(909, 287, 107, 49);
		login_bt.setBorderPainted(false);
		login_bt.setFocusPainted(false);
		login_bt.setContentAreaFilled(false);
		login_bt.setFont(new Font("HSSaemaul", Font.BOLD, 30));
		login_bt.setForeground(Color.ORANGE);
		contentPane.add(login_bt);

		id_lb = new JLabel("ID");
		id_lb.setForeground(Color.ORANGE);
		id_lb.setFont(new Font("HSSaemaul", Font.PLAIN, 30));
		id_lb.setBounds(637, 287, 107, 25);
		contentPane.add(id_lb);

		pw_lb = new JLabel("PASSWORD");
		pw_lb.setForeground(Color.ORANGE);
		pw_lb.setFont(new Font("HSSaemaul", Font.PLAIN, 30));
		pw_lb.setBounds(551, 326, 107, 25);
		contentPane.add(pw_lb);

		find_bt = new JButton("아이디/비밀번호 찾기");
		find_bt.setBounds(806, 448, 184, 37);
		find_bt.setBorderPainted(false);
		find_bt.setFocusPainted(false);
		find_bt.setContentAreaFilled(false);
		find_bt.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		find_bt.setForeground(Color.PINK);
		contentPane.add(find_bt);

		logo_lb = new JLabel("GET CHAR");
		logo_lb.setFont(new Font("HSSaemaul", Font.BOLD, 130));
		logo_lb.setForeground(new Color(153, 204, 255));
		logo_lb.setBounds(82, 213, 444, 203);
		contentPane.add(logo_lb);

		Auth auth = new Auth(pg, card);
		Signup signup = new Signup(pg, card);
		Signup_ok signup_ok = new Signup_ok(pg, card);
		Find_ID find_id = new Find_ID(pg, card);
		Find_PW find_pw = new Find_PW(pg, card);
		Kategorie kate = new Kategorie(pg, card);
		Sell sell = new Sell(pg, card);
		List list = new List(pg, card);
		Product product = new Product(pg, card);
		Chat chat = new Chat(pg, card);
		Request request = new Request(pg, card);
		
		pg.add(contentPane, "login");
		pg.add(auth, "auth");
		pg.add(signup, "signup");
		pg.add(signup_ok, "signup_ok");
		pg.add(find_id, "find_id");
		pg.add(find_pw, "find_pw");
		pg.add(kate, "kate");
		pg.add(sell, "sell");
		pg.add(list, "list");
		pg.add(product, "product");
		pg.add(chat, "chat");
		pg.add(request, "request");

		
		setContentPane(pg);
		card.show(pg, "login");
		
		login_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "kate");
			}
		});
		
		signUp_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "signup");
			}
		});
		
		find_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "find_id");
			}
		});

	}

	public static void main(String[] args) {
		new Login();
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}