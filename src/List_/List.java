package List_;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class List extends JPanel {
	JPanel pg;
	CardLayout card;
	ImageIcon product = new ImageIcon("src/Images_pr/11.png");

	public List(JPanel pg, CardLayout card) {
		this.pg = pg;
		this.card = card;
		
		setLayout(null);
		
		JButton pre_Bt = new JButton("< 이전 페이지");
		pre_Bt.setHorizontalAlignment(SwingConstants.LEFT);
		pre_Bt.setBounds(25, 25, 193, 50);
		pre_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 31));
		pre_Bt.setForeground(new Color(153,204,255));
		pre_Bt.setBorderPainted(false);
		pre_Bt.setFocusPainted(false);
		pre_Bt.setContentAreaFilled(false);
		add(pre_Bt);
		
		JButton bt1 = new JButton(product);
		bt1.setBounds(126, 120, 139, 169);
		bt1.setBorderPainted(false);
		bt1.setFocusPainted(false);
		bt1.setContentAreaFilled(false);
		add(bt1);
		
		JButton bt5 = new JButton("New button");
		bt5.setBounds(126, 333, 139, 169);
		bt5.setBorderPainted(false);
		bt5.setFocusPainted(false);
		bt5.setContentAreaFilled(false);
		add(bt5);
		
		JButton bt2 = new JButton("New button");
		bt2.setBounds(360, 120, 139, 169);
		bt2.setBorderPainted(false);
		bt2.setFocusPainted(false);
		bt2.setContentAreaFilled(false);
		add(bt2);
		
		JButton bt6 = new JButton("New button");
		bt6.setBounds(360, 333, 139, 169);
		bt6.setBorderPainted(false);
		bt6.setFocusPainted(false);
		bt6.setContentAreaFilled(false);
		add(bt6);
		
		JButton bt3 = new JButton("New button");
		bt3.setBounds(594, 120, 139, 169);
		bt3.setBorderPainted(false);
		bt3.setFocusPainted(false);
		bt3.setContentAreaFilled(false);
		add(bt3);
		
		JButton bt7 = new JButton("New button");
		bt7.setBounds(594, 333, 139, 169);
		bt7.setBorderPainted(false);
		bt7.setFocusPainted(false);
		bt7.setContentAreaFilled(false);
		add(bt7);
		
		JButton bt4 = new JButton("New button");
		bt4.setBounds(833, 120, 139, 169);
		bt4.setBorderPainted(false);
		bt4.setFocusPainted(false);
		bt4.setContentAreaFilled(false);
		add(bt4);
		
		JButton bt8 = new JButton("New button");
		bt8.setBounds(833, 333, 139, 169);
		bt8.setBorderPainted(false);
		bt8.setFocusPainted(false);
		bt8.setContentAreaFilled(false);
		add(bt8);
		
		JTextField search_Ta = new JTextField();
		search_Ta.setText("   검색");
		search_Ta.setBounds(199, 55, 698, 30);
		add(search_Ta);
		search_Ta.setColumns(10);
		
		JButton adv_Bt = new JButton("광고");
		adv_Bt.setBounds(126, 540, 846, 97);
		adv_Bt.setForeground(Color.CYAN);
		adv_Bt.setBorderPainted(false);
		adv_Bt.setFocusPainted(false);
		adv_Bt.setContentAreaFilled(false);
		add(adv_Bt);
		
		setBackground(Color.DARK_GRAY);
		
		pre_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "kate");
			}
		});
		
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
				
			}
		});
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});
		bt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});
		bt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});
		bt6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});
		bt7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});
		bt8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "product");
			}
		});
		
		search_Ta.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				search_Ta.setText("검색");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				search_Ta.setText("");
			}
		});
	}
	

}
