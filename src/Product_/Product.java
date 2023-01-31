package Product_;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Product extends JPanel {
//	private JTextField pd_Name, register_Name, register_Local, kategorie, start_Day, end_Day, txtPoint;
	
	CardLayout card;
	JPanel pg;
	ImageIcon product = new ImageIcon("src/Images_pr/11.png");
//	ImageIcon product = new ImageIcon("src/Images_pr/11.png");
//	ImageIcon product = new ImageIcon("src/Images_pr/11.png");
	
	
	private JLabel start_Day1, start_Day2, start_Day3, end_Day1, end_Day2, end_Day3;
	private JLabel to;

	public Product(JPanel pg, CardLayout card) {
		this.pg = pg;
		this.card = card;
		
		setLayout(null);
		
		JLabel img_lb = new JLabel(product);
		img_lb.setHorizontalAlignment(SwingConstants.CENTER);
		img_lb.setEnabled(true);
		img_lb.setBounds(61, 130, 350, 369);
		add(img_lb);
		
		JButton pre_Bt = new JButton("< 이전 페이지");
		pre_Bt.setHorizontalAlignment(SwingConstants.LEFT);
		pre_Bt.setBounds(25, 25, 199, 50);
		pre_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 31));
		pre_Bt.setForeground(new Color(153,204,255));
		pre_Bt.setBorderPainted(false);
		pre_Bt.setFocusPainted(false);
		pre_Bt.setContentAreaFilled(false);
		add(pre_Bt);
		
		JButton purchase_Bt = new JButton("구매하기");
		purchase_Bt.setBounds(594, 562, 140, 46);
		purchase_Bt.setBorderPainted(false);
		purchase_Bt.setFocusPainted(false);
		purchase_Bt.setContentAreaFilled(false);
		purchase_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		purchase_Bt.setForeground(new Color(153,204,255));
		add(purchase_Bt);
		
		JButton lend_Bt = new JButton("대여하기");
		lend_Bt.setBounds(736, 562, 140, 46);
		lend_Bt.setBorderPainted(false);
		lend_Bt.setFocusPainted(false);
		lend_Bt.setContentAreaFilled(false);
		lend_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		lend_Bt.setForeground(new Color(153,204,255));
		add(lend_Bt);
		
		JButton chat_Bt = new JButton("채팅하기");
		chat_Bt.setBounds(878, 562, 140, 46);
		chat_Bt.setBorderPainted(false);
		chat_Bt.setFocusPainted(false);
		chat_Bt.setContentAreaFilled(false);
		chat_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		chat_Bt.setForeground(new Color(153,204,255));
		add(chat_Bt);
		
		JButton like_Bt = new JButton("♡");
		like_Bt.setBounds(1019, 562, 45, 46);
		like_Bt.setBorderPainted(false);
		like_Bt.setFocusPainted(false);
		like_Bt.setContentAreaFilled(false);
		like_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		like_Bt.setForeground(new Color(153,204,255));
		add(like_Bt);
		
		JTextArea pd_Explain_Ta = new JTextArea();
		pd_Explain_Ta.setLineWrap(true);
		pd_Explain_Ta.setEditable(false);
		pd_Explain_Ta.setEnabled(false);
		pd_Explain_Ta.setBounds(462, 212, 350, 287);
		add(pd_Explain_Ta);
		
		String pdName = null;
		pdName = "상품명";
		JLabel pd_Name = new JLabel(pdName);
		pd_Name.setBounds(462, 130, 140, 39);
		pd_Name.setFont(new Font("HSSaemaul", Font.BOLD, 30));
		pd_Name.setForeground(Color.PINK);
		add(pd_Name);
		
		String registerName = null;
		registerName = "게시자";
		JLabel register_Name = new JLabel(registerName);
		register_Name.setBounds(462, 179, 103, 21);
		register_Name.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		register_Name.setForeground(Color.PINK);
		add(register_Name);
		
		String registerLocal = null;
		registerLocal = "지역";
		JLabel register_Local = new JLabel(registerLocal);
		register_Local.setBounds(576, 179, 80, 21);
		register_Local.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		register_Local.setForeground(Color.PINK);
		add(register_Local);
		
		String kategorie1 = null;
		kategorie1 = "카테고리";
		JLabel kategorie = new JLabel(kategorie1);
		kategorie.setBounds(665, 179, 80, 21);
		kategorie.setFont(new Font("HSSaemaul", Font.BOLD, 20));
		kategorie.setForeground(Color.PINK);
		add(kategorie);
		
		JLabel start_Day = new JLabel();
		start_Day.setText("시작 날짜");
		start_Day.setBounds(860, 140, 62, 30);
		start_Day.setFont(new Font("HSSaemaul", Font.BOLD, 16));
		start_Day.setForeground(Color.PINK);
		add(start_Day);
		
		JLabel end_Day = new JLabel();
		end_Day.setText("끝 날짜");
		end_Day.setBounds(860, 180, 62, 30);
		end_Day.setFont(new Font("HSSaemaul", Font.BOLD, 16));
		end_Day.setForeground(Color.PINK);
		add(end_Day);
		
		JButton start_Bt = new JButton("S");
		start_Bt.setBounds(955, 140, 63, 31);
		start_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 30));
		start_Bt.setForeground(new Color(153,204,255));
		start_Bt.setBorderPainted(false);
		start_Bt.setFocusPainted(false);
		start_Bt.setContentAreaFilled(false);
		add(start_Bt);
		
		JButton end_Bt = new JButton("E");
		end_Bt.setBounds(955, 180, 63, 31);
		end_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 30));
		end_Bt.setForeground(new Color(153,204,255));
		end_Bt.setBorderPainted(false);
		end_Bt.setFocusPainted(false);
		end_Bt.setContentAreaFilled(false);
		add(end_Bt);
		
		JLabel total_Cost = new JLabel("총 결제금액");
		total_Cost.setFont(new Font("HSSaemaul", Font.BOLD, 25));
		total_Cost.setForeground(Color.PINK);
		total_Cost.setBounds(858, 444, 120, 30);
		add(total_Cost);
		
		String total = null;
		total = "0";
		JLabel total_lb = new JLabel(total);
		total_lb.setFont(new Font("굴림", Font.BOLD, 19));
		total_lb.setForeground(Color.PINK);
		total_lb.setBounds(858, 474, 127, 46);
		total_lb.setHorizontalAlignment(SwingConstants.RIGHT);
		add(total_lb);
		
		JLabel point_lb = new JLabel("Point");
		point_lb.setFont(new Font("굴림", Font.BOLD, 19));
		point_lb.setForeground(Color.PINK);
		point_lb.setBounds(989, 483, 62, 30);
		add(point_lb);
		
		setBackground(Color.DARK_GRAY);
		
		JSeparator sep_bt1 = new JSeparator();
		sep_bt1.setBackground(Color.DARK_GRAY);
		sep_bt1.setForeground(Color.PINK);
		sep_bt1.setBounds(547, 544, 501, 14);
		add(sep_bt1);
		
		JSeparator sep_bt2 = new JSeparator();
		sep_bt2.setBackground(Color.DARK_GRAY);
		sep_bt2.setForeground(Color.PINK);
		sep_bt2.setBounds(547, 546, 501, 14);
		add(sep_bt2);
		
		JSeparator sep_Name1 = new JSeparator();
		sep_Name1.setForeground(Color.PINK);
		sep_Name1.setBackground(Color.DARK_GRAY);
		sep_Name1.setBounds(462, 161, 261, 14);
		add(sep_Name1);
		
		JSeparator sep_Name2 = new JSeparator();
		sep_Name2.setForeground(Color.PINK);
		sep_Name2.setBackground(Color.DARK_GRAY);
		sep_Name2.setBounds(462, 163, 261, 14);
		add(sep_Name2);

		JSeparator sep_total1 = new JSeparator();
		sep_total1.setForeground(Color.PINK);
		sep_total1.setBackground(Color.DARK_GRAY);
		sep_total1.setBounds(857, 474, 194, 14);
		add(sep_total1);
	
		JSeparator sep_total2 = new JSeparator();
		sep_total2.setForeground(Color.PINK);
		sep_total2.setBackground(Color.DARK_GRAY);
		sep_total2.setBounds(857, 476, 194, 14);
		add(sep_total2);
		
		String startDay1 = null;
		startDay1 = "YYYY";
		start_Day1 = new JLabel(startDay1);
		start_Day1.setBounds(865, 268, 45, 30);
		start_Day1.setFont(new Font("HSSaemaul", Font.BOLD, 23));
		start_Day1.setForeground(Color.PINK);
		add(start_Day1);

		String startDay2 = null;
		startDay2 = "MM";
		start_Day2 = new JLabel(startDay2);
		start_Day2.setBounds(915, 268, 35, 30);
		start_Day2.setFont(new Font("HSSaemaul", Font.BOLD, 23));
		start_Day2.setForeground(Color.PINK);
		add(start_Day2);
		
		String startDay3 = null;
		startDay3 = "DD";
		start_Day3 = new JLabel(startDay3);
		start_Day3.setBounds(950, 268, 27, 30);
		start_Day3.setFont(new Font("HSSaemaul", Font.BOLD, 23));
		start_Day3.setForeground(Color.PINK);
		add(start_Day3);
		
		String endDay1 = null;
		endDay1 = "YYYY";
		end_Day1 = new JLabel(endDay1);
		end_Day1.setBounds(865, 342, 45, 30);
		end_Day1.setFont(new Font("HSSaemaul", Font.BOLD, 23));
		end_Day1.setForeground(Color.PINK);
		add(end_Day1);
		
		String endDay2 = null;
		endDay2 = "MM";
		end_Day2 = new JLabel(endDay2);
		end_Day2.setBounds(915, 342, 35, 30);
		end_Day2.setFont(new Font("HSSaemaul", Font.BOLD, 23));
		end_Day2.setForeground(Color.PINK);
		add(end_Day2);
		
		String endDay3 = null;
		endDay3 = "DD";
		end_Day3 = new JLabel(endDay3);
		end_Day3.setBounds(950, 342, 27, 30);
		end_Day3.setFont(new Font("HSSaemaul", Font.BOLD, 23));
		end_Day3.setForeground(Color.PINK);
		add(end_Day3);
		
		to = new JLabel("to");
		to.setHorizontalAlignment(SwingConstants.CENTER);
		to.setFont(new Font("HSSaemaul", Font.BOLD, 31));
		to.setForeground(Color.PINK);
		to.setBounds(955, 308, 45, 21);
		add(to);
		
		pre_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "list");
			}
		});
		
		purchase_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "request");
			}
		});
		
		lend_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "request");
			}
		});
		
		chat_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "chat");
			}
		});
		
		like_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		start_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		end_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
	}
}
