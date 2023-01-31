package request_;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Request extends JPanel {
//	private JTextField pd_Name, register_Name, register_Local, kategorie;
//	private JTextArea request_ta;
//	private JButton reject_Bt, agree_Bt;
//	private JLabel request_la;
	
	JPanel pg;
	CardLayout card;
	ImageIcon product = new ImageIcon("src/Images_pr/11.png");

	public Request(JPanel pg, CardLayout card) {
		this.pg = pg;
		this.card = card;
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		JLabel img_la = new JLabel(product);
		img_la.setBounds(85, 98, 273, 223);
		add(img_la);
		
		String pdName = null;
		pdName = "상품명";
		JLabel pd_Name = new JLabel(pdName);
		pd_Name.setBounds(370, 98, 116, 33);
		pd_Name.setFont(new Font("HSSaemaul", Font.BOLD, 33));
		pd_Name.setForeground(Color.PINK);
		add(pd_Name);
		
		String registerName = null;
		registerName = "게시자";
		JLabel register_Name = new JLabel(registerName);
		register_Name.setBounds(370, 136, 116, 21);
		register_Name.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		register_Name.setForeground(Color.PINK);
		add(register_Name);
		
		String registerLocal = null;
		registerLocal = "지역";
		JLabel register_Local = new JLabel(registerLocal);
		register_Local.setBounds(370, 161, 116, 21);
		register_Local.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		register_Local.setForeground(Color.PINK);
		add(register_Local);
		
		String kategorie1 = null;
		kategorie1 = "카테고리";
		JLabel kategorie = new JLabel(kategorie1);
		kategorie.setBounds(370, 187, 116, 21);
		kategorie.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		kategorie.setForeground(Color.PINK);
		add(kategorie);
		
		JButton pre_Bt = new JButton("< 이전 페이지");
		pre_Bt.setHorizontalAlignment(SwingConstants.LEFT);
		pre_Bt.setBounds(25, 25, 192, 50);
		pre_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 31));
		pre_Bt.setForeground(new Color(153,204,255));
		pre_Bt.setBorderPainted(false);
		pre_Bt.setFocusPainted(false);
		pre_Bt.setContentAreaFilled(false);
		add(pre_Bt);
		
		JTextArea pd_Explain = new JTextArea();
		pd_Explain.setToolTipText("상품 상세정보");
		pd_Explain.setText("상품 설명");
		pd_Explain.setLineWrap(true);
		pd_Explain.setEnabled(false);
		pd_Explain.setEditable(false);
		pd_Explain.setBounds(85, 344, 401, 278);
		add(pd_Explain);
		
		JTextArea request_ta = new JTextArea();
		request_ta.setFont(new Font("Monospaced", Font.BOLD, 25));
		request_ta.setText("\r\n\r\n    YYYY.MM.DD ~ YY.MM.DD \r\n  X point (보증금 x point포함)\r\n\t      or\r\n\t     구매\r\n\t   X point");
		request_ta.setToolTipText("대여기간 및 총액");
		request_ta.setEditable(false);
		request_ta.setEnabled(false);
		request_ta.setBounds(567, 146, 442, 363);
		add(request_ta);
		
		JButton reject_Bt = new JButton("거절");
		reject_Bt.setBounds(680, 530, 97, 33);
		reject_Bt.setBorderPainted(false);
		reject_Bt.setFocusPainted(false);
		reject_Bt.setContentAreaFilled(false);
		reject_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 35));
		reject_Bt.setForeground(new Color(153,204,255));
		add(reject_Bt);
		
		JButton agree_Bt = new JButton("동의");
		agree_Bt.setBounds(800, 530, 97, 33);
		agree_Bt.setBorderPainted(false);
		agree_Bt.setFocusPainted(false);
		agree_Bt.setContentAreaFilled(false);
		agree_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 35));
		agree_Bt.setForeground(new Color(153,204,255));
		add(agree_Bt);
		
		JLabel request_la = new JLabel("거래 요청");
		request_la.setHorizontalAlignment(SwingConstants.CENTER);
		request_la.setBounds(567, 98, 442, 38);
		request_la.setFont(new Font("HSSaemaul", Font.BOLD, 35));
		request_la.setForeground(Color.PINK);
		add(request_la);
		
		pre_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});
		
		agree_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		reject_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});

	}

}
