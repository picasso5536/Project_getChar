package login;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Find_ID extends JPanel {

	
	CardLayout card;
	JPanel pg;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public Find_ID(JPanel pg, CardLayout card) {


		this.pg = pg;
		this.card = card;
		
		setLayout(null);
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 550, ds.height / 2 - 350, 1100, 700);
		setVisible(true);

		JLabel lblNewLabel = new JLabel("Find your  ID");
		lblNewLabel.setBounds(304, 38, 491, 111);
		lblNewLabel.setForeground(new Color(153,204,255));
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.BOLD, 75));
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1.setBounds(285, 182, 52, 26);
		add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("닉네임");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(285, 291, 52, 26);
		add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("핸드폰 번호");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(285, 242, 83, 26);
		add(lblNewLabel_1_2);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ict01-09\\Desktop\\images\\ph.png"));
		btnNewButton_1.setBounds(698, 236, 97, 32);
		add(btnNewButton_1);

		JLabel lblNewLabel_1_2_1_2 = new JLabel("이메일");
		lblNewLabel_1_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_2.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_2_1_2.setBounds(285, 348, 91, 26);
		add(lblNewLabel_1_2_1_2);

		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.GRAY);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"@ 이메일 선택", "@naver.com", "@daum.net", "@google.com", "직접입력"}));
		comboBox_1.setToolTipText("이메일");
		comboBox_1.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		comboBox_1.setBounds(617, 348, 170, 24);
		add(comboBox_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(426, 182, 179, 25);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("  '-'를 제외하고 입력하세요");
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(426, 242, 254, 25);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(426, 292, 179, 25);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(426, 348, 179, 25);
		pg.add(textField_3);
		
		JButton btnNewButton_2 = new JButton("아이디 찾기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(new Color(153,204,255));
		btnNewButton_2.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		btnNewButton_2.setBounds(436, 452, 199, 32);
		
		JButton btnNewButton = new JButton("비밀번호 찾기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("HS새마을체", Font.BOLD, 20));
		btnNewButton.setBounds(365, 519, 135, 32);
		add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("로그인하러 가기");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("HS새마을체", Font.BOLD, 20));
		btnNewButton_3.setBounds(549, 519, 170, 32);
		add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("아이디 찾기");
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("HS새마을체", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(438, 455, 199, 32);
		add(btnNewButton_2_1);

		
		
	}

}
