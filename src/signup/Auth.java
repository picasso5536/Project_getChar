package signup;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;

public class Auth extends JPanel {

	CardLayout card;
	JPanel pg;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public Auth(JPanel pg, CardLayout card) {

		this.pg = pg;
		this.card = card;
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 550, ds.height / 2 - 350, 1100, 700);
		setVisible(true);
		setLayout(null);

		Button button = new Button("< Back");
		button.setFont(new Font("함초롬돋움", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "signup");
			}
		});
		
		
		
		button.setBounds(27, 22, 57, 23);
		add(button);
		
		

		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setFont(new Font("HS새마을체", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(165, 158, 31, 26);
		add(lblNewLabel_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(226, 159, 207, 26);
		add(textField);

		JLabel lblNewLabel_1_1 = new JLabel("주민번호");
		lblNewLabel_1_1.setFont(new Font("HS새마을체", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(143, 205, 57, 26);
		add(lblNewLabel_1_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(226, 206, 85, 26);
		add(textField_1);

		JLabel lblNewLabel_1_2 = new JLabel("핸드폰번호");
		lblNewLabel_1_2.setFont(new Font("HS새마을체", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(128, 257, 72, 26);
		add(lblNewLabel_1_2);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(226, 258, 207, 26);
		add(textField_2);

		JSpinner spinner = new JSpinner();
		spinner.setForeground(Color.BLACK);
		spinner.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		spinner.setModel(new SpinnerListModel(new String[] { "\uC54C\uB730\uD3F0 \uC120\uD0DD", "KT \uC54C\uB730\uD3F0",
				"SKT \uC54C\uB730\uD3F0", "LGU+ \uC54C\uB730\uD3F0" }));
		spinner.setBounds(360, 415, 80, 26);
		add(spinner);

		JList list = new JList();
		list.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "통신사선택", "-------------", "KT", "SKT", "LGU+", "알뜰폰" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(226, 311, 122, 130);
		add(list);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(346, 206, 87, 26);
		add(textField_3);

		JLabel lblNewLabel = new JLabel("본인인증");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("HS새마을체", Font.BOLD, 70));
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setBounds(205, 34, 207, 91);
		add(lblNewLabel);

		textField_4 = new JTextField();
		textField_4.setForeground(Color.GRAY);
		textField_4.setFont(new Font("HS새마을체", Font.PLAIN, 15));
		textField_4.setText("인증번호를 입력하세요");
		textField_4.setColumns(10);
		textField_4.setBounds(131, 527, 207, 37);
		add(textField_4);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// DB 에서 데이터를 받아오는 로직 추가
				
				boolean exist = false;
				
				
				if (exist) {

					String[] buttons = {"아이디찾기", "비밀번호찾기", "로그인하러가기"};
					JOptionPane.showOptionDialog(null, "이미 가입된 회원입니다.",
						    "Choose a colour", JOptionPane.DEFAULT_OPTION,
						    JOptionPane.WARNING_MESSAGE,
						    null,buttons,buttons[0]);

				} else {
					JOptionPane.showMessageDialog(null, "인증번호가 발송되었습니다. \n메세지를 확인해주세요");
				}
				
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ict01-09\\Desktop\\images\\ddd.png"));
		btnNewButton.setBounds(250, 451, 122, 34);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "인증되었습니다.");
				card.show(pg, "signup");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ict01-09\\Desktop\\images\\z.png"));
		btnNewButton_1.setBounds(375, 527, 97, 34);
		add(btnNewButton_1);
	}
	

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {

		}

	}
}
