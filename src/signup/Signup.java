package signup;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Signup extends JPanel {

	CardLayout card;
	JPanel pg;
	private JTextField phone_tf;
	private JTextField address_tf;
	private JTextField email_tf;
	private JTextField id_tf;
	private JTextField nickname_tf;
	private JTextField name_tf;
	private JTextField pw_tf;
	private JTextField pwRe_tf;
	private JTextField path4_tf;
	
	

	public Signup(JPanel pg, CardLayout card) {
		this.pg = pg;
		this.card = card;
		setBackground(Color.DARK_GRAY);
		setLayout(null);

		JLabel title = new JLabel("SIGN UP");
		title.setBounds(420, 10, 291, 111);
		title.setForeground(new Color(153,204,255));
		title.setFont(new Font("HS새마을체", Font.BOLD, 100));
		add(title);

		JLabel name_lb = new JLabel("이름");
		name_lb.setBounds(237, 131, 52, 26);
		name_lb.setForeground(Color.ORANGE);
		name_lb.setFont(new Font("HS새마을체", Font.BOLD, 22));
		add(name_lb);
		
		name_tf = new JTextField();
		name_tf.setBounds(387, 131, 179, 25);
		name_tf.setColumns(10);
		add(name_tf);
		
		JLabel phone_lb = new JLabel("핸드폰 번호");
		phone_lb.setBounds(237, 172, 83, 26);
		phone_lb.setForeground(Color.ORANGE);
		phone_lb.setFont(new Font("HS새마을체", Font.BOLD, 22));
		add(phone_lb);

		phone_tf = new JTextField();
		phone_tf.setBounds(387, 172, 360, 25);
		phone_tf.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		phone_tf.setForeground(Color.LIGHT_GRAY);
		phone_tf.setText("  '-'를 제외하고 입력하세요");
		phone_tf.setColumns(10);
		add(phone_tf);

		JButton auth_bt = new JButton("핸드폰 인증");
		auth_bt.setBounds(760, 165, 120, 40);
		auth_bt.setForeground(new Color(217, 171, 246));
		auth_bt.setFont(new Font("HS새마을체", Font.BOLD, 20));
		auth_bt.setBorderPainted(false);
		auth_bt.setFocusPainted(false);
		auth_bt.setContentAreaFilled(false);
		add(auth_bt);
		
		JLabel id_lb = new JLabel("아이디");
		id_lb.setBounds(237, 210, 52, 26);
		id_lb.setForeground(Color.ORANGE);
		id_lb.setFont(new Font("HS새마을체", Font.BOLD, 22));
		add(id_lb);
		
		id_tf = new JTextField();
		id_tf.setBounds(387, 215, 360, 25);
		id_tf.setColumns(10);
		add(id_tf);

		JButton idDup_bt = new JButton("중복 확인");
		idDup_bt.setBounds(770, 214, 95, 29);
		idDup_bt.setForeground(new Color(217, 171, 246));
		idDup_bt.setFont(new Font("HS새마을체", Font.BOLD, 20));
		idDup_bt.setBorderPainted(false);
		idDup_bt.setFocusPainted(false);
		idDup_bt.setContentAreaFilled(false);
		add(idDup_bt);

		JLabel pw_lb = new JLabel("비밀번호");
		pw_lb.setBounds(237, 255, 75, 26);
		pw_lb.setForeground(Color.ORANGE);
		pw_lb.setFont(new Font("HS새마을체", Font.BOLD, 22));
		add(pw_lb);
		
		pw_tf = new JTextField();
		pw_tf.setBounds(387, 255, 360, 25);
		pw_tf.setToolTipText("대/소문자, 숫자, 특수문자(!,*,-,_,@) 모두 사용하여 설정하세요");
		pw_tf.setForeground(Color.LIGHT_GRAY);
		pw_tf.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		pw_tf.setColumns(10);
		add(pw_tf);

		JLabel pwRe_lb = new JLabel("비밀번호 확인");
		pwRe_lb.setBounds(237, 300, 106, 26);
		pwRe_lb.setForeground(Color.ORANGE);
		pwRe_lb.setFont(new Font("HS새마을체", Font.BOLD, 22));
		add(pwRe_lb);
		
		pwRe_tf = new JTextField();
		pwRe_tf.setBounds(387, 301, 360, 25);
		pwRe_tf.setText(" 비밀번호 재입력");
		pwRe_tf.setForeground(Color.LIGHT_GRAY);
		pwRe_tf.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		pwRe_tf.setColumns(10);
		add(pwRe_tf);

		JLabel nickName_lb = new JLabel("닉네임");
		nickName_lb.setBounds(237, 340, 52, 26);
		nickName_lb.setForeground(Color.ORANGE);
		nickName_lb.setFont(new Font("HS새마을체", Font.BOLD, 22));
		add(nickName_lb);
		
		nickname_tf = new JTextField();
		nickname_tf.setBounds(387, 344, 179, 25);
		nickname_tf.setColumns(10);
		add(nickname_tf);
		
		JButton nickNameDup_bt = new JButton("중복 확인");
		nickNameDup_bt.setBounds(770, 342, 95, 29);
		nickNameDup_bt.setForeground(new Color(217, 171, 246));
		nickNameDup_bt.setFont(new Font("HS새마을체", Font.BOLD, 20));
		nickNameDup_bt.setBorderPainted(false);
		nickNameDup_bt.setFocusPainted(false);
		nickNameDup_bt.setContentAreaFilled(false);
		add(nickNameDup_bt);

		JLabel address_lb = new JLabel("주소");
		address_lb.setBounds(237, 384, 91, 26);
		address_lb.setForeground(Color.ORANGE);
		address_lb.setFont(new Font("HS새마을체", Font.BOLD, 22));
		add(address_lb);

		address_tf = new JTextField();
		address_tf.setBounds(387, 388, 360, 25);
		address_tf.setColumns(10);
		add(address_tf);
		
		JButton address_bt = new JButton("주소검색");
		address_bt.setBounds(770, 384, 97, 32);
		address_bt.setForeground(new Color(217, 171, 246));
		address_bt.setFont(new Font("HS새마을체", Font.BOLD, 20));
		address_bt.setBorderPainted(false);
		address_bt.setFocusPainted(false);
		address_bt.setContentAreaFilled(false);
		add(address_bt);

		JLabel email_lb = new JLabel("이메일");
		email_lb.setBounds(237, 429, 91, 26);
		email_lb.setForeground(Color.ORANGE);
		email_lb.setFont(new Font("HS새마을체", Font.BOLD, 22));
		add(email_lb);

		email_tf = new JTextField();
		email_tf.setBounds(387, 433, 170, 25);
		email_tf.setColumns(10);
		add(email_tf);

		JComboBox email_cb = new JComboBox();
		email_cb.setBounds(577, 433, 170, 24);
		email_cb.setForeground(Color.GRAY);
		email_cb.setModel(new DefaultComboBoxModel(new String[] {"@ 이메일 선택", "@naver.com", "@daum.net", "@google.com", "직접입력"}));
		email_cb.setToolTipText("이메일");
		email_cb.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		add(email_cb);
		
		JLabel attention_lb = new JLabel("관심분야");
		attention_lb.setBounds(237, 472, 91, 26);
		attention_lb.setForeground(Color.ORANGE);
		attention_lb.setFont(new Font("HS새마을체", Font.BOLD, 22));
		add(attention_lb);

		JComboBox attention_cb = new JComboBox();
		attention_cb.setBounds(387, 476, 225, 23);
		attention_cb.setForeground(Color.GRAY);
		attention_cb.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		attention_cb.setModel(new DefaultComboBoxModel(new String[] { "카테고리를 선택하세요", "의류", "전자제품", "가전가구", "유아의류", "도서" }));
		attention_cb.setToolTipText("관심분야를 선택하세요");
		add(attention_cb);

		JLabel path_lb = new JLabel("getchar 를 어떻게 알게 되셨나요?");
		path_lb.setBounds(233, 526, 266, 23);
		path_lb.setForeground(Color.PINK);
		path_lb.setFont(new Font("HS새마을체", Font.BOLD, 20));
		add(path_lb);

		JCheckBox path1_cb = new JCheckBox("SNS (블로그, 인스타그램 등)");
		path1_cb.setBounds(233, 558, 186, 23);
		path1_cb.setForeground(Color.WHITE);
		path1_cb.setBackground(Color.DARK_GRAY);
		path1_cb.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		add(path1_cb);

		JCheckBox path2_cb = new JCheckBox("지인소개");
		path2_cb.setBounds(446, 558, 83, 23);
		path2_cb.setForeground(Color.WHITE);
		path2_cb.setBackground(Color.DARK_GRAY);
		path2_cb.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		add(path2_cb);

		JCheckBox path3_cb = new JCheckBox("커뮤니티");
		path3_cb.setBounds(577, 558, 83, 23);
		path3_cb.setForeground(Color.WHITE);
		path3_cb.setBackground(Color.DARK_GRAY);
		path3_cb.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		add(path3_cb);
		
		JCheckBox etc_cb = new JCheckBox("기타");
		etc_cb.setBounds(700, 558, 52, 23);
		etc_cb.setForeground(Color.WHITE);
		etc_cb.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		etc_cb.setBackground(Color.DARK_GRAY);
		add(etc_cb);
		
		path4_tf = new JTextField();
		path4_tf.setBounds(759, 558, 108, 21);
		path4_tf.setColumns(10);
		add(path4_tf);

		JButton cancel_bt = new JButton("가입취소");
		cancel_bt.setBounds(397, 600, 115, 40);
		cancel_bt.setForeground(new Color(153,204,255));
		cancel_bt.setFont(new Font("HS새마을체", Font.BOLD, 25));
		cancel_bt.setBorderPainted(false);
		cancel_bt.setFocusPainted(false);
		cancel_bt.setContentAreaFilled(false);
		add(cancel_bt);

		JButton complete_bt = new JButton("가입완료");
		complete_bt.setBounds(567, 600, 115, 40);
		complete_bt.setForeground(new Color(153,204,255));
		complete_bt.setFont(new Font("HS새마을체", Font.BOLD, 25));
		complete_bt.setBorderPainted(false);
		complete_bt.setFocusPainted(false);
		complete_bt.setContentAreaFilled(false);
		add(complete_bt);
		
		phone_tf.addFocusListener(new FocusListener() {
			String txt = "'-'를 제외하고 입력하세요";
			@Override
			public void focusLost(FocusEvent e) {
				if(!phone_tf.getText().trim().equalsIgnoreCase(txt)&&phone_tf.getText().trim().length()==0) phone_tf.setText(txt);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(phone_tf.getText().trim().equalsIgnoreCase(txt)) phone_tf.setText("");
			}
		});
		
		pwRe_tf.addFocusListener(new FocusListener() {
			String txt = " 비밀번호 재입력";
			
			@Override
			public void focusLost(FocusEvent e) {
				if(!pwRe_tf.getText().equalsIgnoreCase(txt)&&pwRe_tf.getText().length()==0) pwRe_tf.setText(txt);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(pwRe_tf.getText().equalsIgnoreCase(txt)) pwRe_tf.setText("");
			}
		});
		
		cancel_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(getParent(), "가입을 취소하시겠습니까?", "가입 취소", JOptionPane.YES_NO_OPTION);
				if(res==0) {
					card.show(pg, "login");
				}
			}
		});
		
		complete_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(getParent(), "가입 하시겠습니까?", "가입", JOptionPane.YES_NO_OPTION);
				if(res == 0) {
					// DB MEMBERS 테이블에 데이터 삽입
					// 삽입 코드
					if(name_tf.getText().trim().length()>0 ) {
						card.show(pg, "login");
					}
				}
			}
		});
		
		auth_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "auth");
			}
		});
		
	}
}
