package chat_;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Chat extends JPanel {
//	private JTextField pd_Name, register_Name, register_Local, msg_tf, kategorie;
//	private JTextArea textArea, chat_Log;
//	private JButton send_Bt;
	JPanel pg;
	CardLayout card;
	ImageIcon product = new ImageIcon("src/Images_pr/11.png");

	public Chat(JPanel pg, CardLayout card) {
		this.pg = pg;
		this.card = card;
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		JButton pre_Bt = new JButton("< 이전 페이지");
		pre_Bt.setHorizontalAlignment(SwingConstants.LEFT);
		pre_Bt.setBounds(25, 25, 207, 50);
		pre_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 31));
		pre_Bt.setForeground(new Color(153,204,255));
		pre_Bt.setBorderPainted(false);
		pre_Bt.setFocusPainted(false);
		pre_Bt.setContentAreaFilled(false);
		add(pre_Bt);
		
		JLabel lblNewLabel = new JLabel(product);
		lblNewLabel.setBounds(84, 98, 273, 223);
		add(lblNewLabel);
		
		String pdName = null;
		pdName = "상품명";
		JLabel pd_Name = new JLabel(pdName);
		pd_Name.setBounds(369, 98, 116, 33);
		pd_Name.setFont(new Font("HSSaemaul", Font.BOLD, 33));
		pd_Name.setForeground(Color.PINK);
		add(pd_Name);
		
		String registerName = null;
		registerName = "게시자";
		JLabel register_Name = new JLabel(registerName);
		register_Name.setBounds(369, 136, 116, 21);
		register_Name.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		register_Name.setForeground(Color.PINK);
		add(register_Name);
		
		String registerLocal = null;
		registerLocal = "지역";
		JLabel register_Local = new JLabel(registerLocal);
		register_Local.setBounds(369, 161, 116, 21);
		register_Local.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		register_Local.setForeground(Color.PINK);
		add(register_Local);
		
		String kategorie1 = null;
		kategorie1 = "카테고리";
		JLabel kategorie = new JLabel(kategorie1);
		kategorie.setBounds(369, 187, 116, 21);
		kategorie.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		kategorie.setForeground(Color.PINK);
		add(kategorie);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setLineWrap(true);
		textArea.setToolTipText("상품 상세정보");
		textArea.setEditable(false);
		textArea.setText("상품 설명");
		textArea.setBounds(84, 344, 401, 278);
		add(textArea);
		
		JTextArea chat_Log = new JTextArea();
		chat_Log.setToolTipText("채팅창");
		chat_Log.setLineWrap(true);
		chat_Log.setEnabled(false);
		chat_Log.setEditable(false);
		chat_Log.setBounds(562, 105, 449, 479);
		add(chat_Log);
		
		JTextField msg_tf = new JTextField();
		msg_tf.setToolTipText("채팅 입력창");
		msg_tf.setBounds(562, 594, 380, 28);
		add(msg_tf);
		msg_tf.setColumns(10);
		
		JButton send_Bt = new JButton("전송");
		send_Bt.setToolTipText("메시지 전송");
		send_Bt.setBounds(946, 594, 65, 28);
		send_Bt.setBorderPainted(false);
		send_Bt.setFocusPainted(false);
		send_Bt.setContentAreaFilled(false);
		send_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 23));
		send_Bt.setForeground(new Color(153,204,255));
		
		add(send_Bt);

		pre_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});
	}

}
