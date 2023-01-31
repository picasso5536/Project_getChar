package home_;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Kategorie extends JPanel {

	JPanel pg;
	CardLayout card;

	public Kategorie(JPanel pg, CardLayout card) {
		this.pg = pg;
		this.card = card;
		
		setVisible(true);
		setBounds(100, 100, 1100, 700);
		
		setBackground(Color.DARK_GRAY);
		
		JButton pre_Bt = new JButton("< 이전 페이지");
		pre_Bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "Login");
			}
		});
		pre_Bt.setBorderPainted(false);
		pre_Bt.setFocusPainted(false);
		pre_Bt.setContentAreaFilled(false);
		pre_Bt.setHorizontalAlignment(SwingConstants.LEFT);
		pre_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 31));
		pre_Bt.setForeground(new Color(153,204,255));
		pre_Bt.setBounds(25, 25, 213, 50);
		add(pre_Bt);
		
		JButton lend_pur_Bt = new JButton("대여 ? 구매 ?");
		lend_pur_Bt.setBorderPainted(false);
		lend_pur_Bt.setFocusPainted(false);
		lend_pur_Bt.setContentAreaFilled(false);
		lend_pur_Bt.setBounds(91, 182, 531, 240);
		lend_pur_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 70));
		lend_pur_Bt.setForeground(new Color(153,204,255));
		add(lend_pur_Bt);
		
		JButton sell_Bt = new JButton("팔래?");
//		sell_Bt.setRolloverIcon(img_sell);
		sell_Bt.setBounds(636, 183, 289, 240);
		sell_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 70));
//		sell_Bt.setForeground(Color.);
		sell_Bt.setBorderPainted(false);
		sell_Bt.setFocusPainted(false);
		sell_Bt.setContentAreaFilled(false);
		
		add(sell_Bt);
		
		JButton adv_Bt = new JButton("광고");
		adv_Bt.setBounds(91, 527, 895, 97);
		adv_Bt.setForeground(Color.CYAN);
		adv_Bt.setBorderPainted(false);
		adv_Bt.setFocusPainted(false);
		adv_Bt.setContentAreaFilled(false);
		add(adv_Bt);
		
		sell_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "sell");
				
			}
		});
		
		lend_pur_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(pg, "list");
			}
		});
		
	}
	

}
