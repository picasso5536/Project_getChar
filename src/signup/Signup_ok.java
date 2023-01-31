package signup;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Signup_ok extends JPanel {

	CardLayout card;
	JPanel pg;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	public Signup_ok(JPanel pg, CardLayout card) {
		this.pg = pg;
		this.card = card;

		setLayout(null);

		JInternalFrame internalFrame = new JInternalFrame("회원가입 완료");
		internalFrame.setBounds(323, 166, 453, 336);
		add(internalFrame);

		JPanel panel = new JPanel();
		internalFrame.getContentPane().add(panel, BorderLayout.CENTER);
		setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("가입이 완료되었습니다!\\n\r\n로그인 페이지로 이동하시겠습니까?\r\r\n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("HS새마을체", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(40, 55, 350, 161);
		panel.add(lblNewLabel_2);

		JButton btnNewButton_2_1 = new JButton("로그인하러 가기");
		btnNewButton_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_2_1.setFont(new Font("HS새마을체", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(0, 273, 437, 33);
		panel.add(btnNewButton_2_1);

		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setBounds(403, 10, 291, 111);
		lblNewLabel.setForeground(new Color(153, 204, 255));
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Berlin Sans FB", Font.BOLD, 70));
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1.setBounds(285, 131, 52, 26);
		add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("닉네임");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(285, 340, 52, 26);
		add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("핸드폰 번호");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(285, 172, 83, 26);
		add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("주소");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(285, 384, 91, 26);
		add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("관심분야");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(285, 472, 91, 26);
		add(lblNewLabel_1_2_1_1);

		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("getchar 를 어떻게 알게 되셨나요?");
		lblNewLabel_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1_1.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_1.setBounds(281, 526, 266, 26);
		add(lblNewLabel_1_2_1_1_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("SNS (블로그, 인스타그램 등)");
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setBackground(Color.DARK_GRAY);
		chckbxNewCheckBox.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(281, 558, 186, 23);
		add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("지인소개");
		chckbxNewCheckBox_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1.setBackground(Color.DARK_GRAY);
		chckbxNewCheckBox_1.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		chckbxNewCheckBox_1.setBounds(494, 558, 83, 23);
		add(chckbxNewCheckBox_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setText("  '-'를 제외하고 입력하세요");
		textField_2.setColumns(10);
		textField_2.setBounds(435, 172, 360, 25);
		add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(435, 388, 360, 25);
		add(textField_3);

		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("커뮤니티");
		chckbxNewCheckBox_1_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1_1.setBackground(Color.DARK_GRAY);
		chckbxNewCheckBox_1_1.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1.setBounds(625, 558, 83, 23);
		add(chckbxNewCheckBox_1_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.GRAY);
		comboBox.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "카테고리를 선택하세요", "의류", "전자제품", "가전가구", "유아의류", "도서" }));
		comboBox.setToolTipText("관심분야를 선택하세요");
		comboBox.setBounds(435, 476, 225, 23);
		add(comboBox);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ict01-09\\Desktop\\images\\add.png"));
		btnNewButton.setBounds(818, 384, 97, 32);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ict01-09\\Desktop\\images\\ph.png"));
		btnNewButton_1.setBounds(818, 172, 97, 32);
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ict01-09\\Desktop\\images\\cancle.png"));
		btnNewButton_2.setBounds(445, 600, 105, 40);
		add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ict01-09\\Desktop\\images\\ww.png"));
		btnNewButton_3.setBounds(615, 600, 105, 40);
		add(btnNewButton_3);

		JLabel lblNewLabel_1_3 = new JLabel("아이디");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(285, 210, 52, 26);
		add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("비밀번호");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(285, 255, 75, 26);
		add(lblNewLabel_1_4);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(435, 433, 170, 25);
		add(textField);

		JLabel lblNewLabel_1_2_1_2 = new JLabel("이메일");
		lblNewLabel_1_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_2.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_2_1_2.setBounds(285, 429, 91, 26);
		add(lblNewLabel_1_2_1_2);

		JLabel lblNewLabel_1_4_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_4_1.setForeground(Color.WHITE);
		lblNewLabel_1_4_1.setFont(new Font("HS새마을체", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(285, 300, 106, 26);
		add(lblNewLabel_1_4_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(435, 215, 360, 25);
		add(textField_1);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(435, 344, 179, 25);
		add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(435, 131, 179, 25);
		add(textField_7);

		textField_4 = new JTextField();
		textField_4.setText(" 대/소문자, 숫자, 특수문자(!,*,-,_,@) 모두 사용하여 설정하세요");
		textField_4.setForeground(Color.LIGHT_GRAY);
		textField_4.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(435, 255, 360, 25);
		add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText(" 비밀번호 재입력");
		textField_5.setForeground(Color.LIGHT_GRAY);
		textField_5.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(435, 301, 360, 25);
		add(textField_5);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "@ 이메일 선택", "@naver.com", "@daum.net", "@google.com", "직접입력" }));
		comboBox_1.setToolTipText("이메일");
		comboBox_1.setFont(new Font("함초롬돋움", Font.PLAIN, 11));
		comboBox_1.setBounds(615, 600, 105, 40);
		add(comboBox_1);

		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("기타");
		chckbxNewCheckBox_1_1_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_1_1_1.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		chckbxNewCheckBox_1_1_1.setBackground(Color.DARK_GRAY);
		chckbxNewCheckBox_1_1_1.setBounds(748, 558, 52, 23);
		add(chckbxNewCheckBox_1_1_1);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(807, 558, 108, 21);
		add(textField_8);

		JButton btnNewButton_4_2 = new JButton("");
		btnNewButton_4_2.setIcon(new ImageIcon("C:\\Users\\ict01-09\\Desktop\\images\\중복.png"));
		btnNewButton_4_2.setFont(new Font("HS새마을체", Font.PLAIN, 12));
		btnNewButton_4_2.setBackground(Color.DARK_GRAY);
		btnNewButton_4_2.setBounds(818, 216, 95, 29);
		add(btnNewButton_4_2);

		JButton btnNewButton_4_3 = new JButton("");
		btnNewButton_4_3.setIcon(new ImageIcon("C:\\Users\\ict01-09\\Desktop\\images\\중복.png"));
		btnNewButton_4_3.setFont(new Font("HS새마을체", Font.PLAIN, 12));
		btnNewButton_4_3.setBackground(Color.DARK_GRAY);
		btnNewButton_4_3.setBounds(625, 342, 95, 29);
		add(btnNewButton_4_3);
	}
}