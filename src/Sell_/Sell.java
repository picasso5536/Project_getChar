package Sell_;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Sell extends JPanel {
	JTextField price_tf, name_tf;
	JTextArea explain_tf;
	
	JPanel pg, contentPane;
	CardLayout card;
	ImageIcon product = new ImageIcon("src/Images_pr/11.png");

	public Sell(JPanel pg, CardLayout card) {
		this.pg = pg;
		this.card = card;
		
		setBounds(100, 100, 1100, 700);
		setLayout(null);
		
		JLabel img_lb = new JLabel(product);
		img_lb.setEnabled(true);
		img_lb.setBounds(113, 152, 369, 324);
        add(img_lb);
		
		JLabel pd_Name = new JLabel("상품명");
		pd_Name.setBounds(521, 134, 54, 29);
		pd_Name.setFont(new Font("HSSaemaul", Font.BOLD, 18));
		pd_Name.setForeground(Color.PINK);
		add(pd_Name);
		
		JLabel pd_Price = new JLabel("상품 가격");
		pd_Price.setBounds(521, 197, 54, 29);
		pd_Price.setFont(new Font("HSSaemaul", Font.BOLD, 16));
		pd_Price.setForeground(Color.PINK);
		add(pd_Price);
		
		JLabel pd_Explain = new JLabel("상품 정보");
		pd_Explain.setBounds(521, 300, 61, 29);
		pd_Explain.setFont(new Font("HSSaemaul", Font.BOLD, 18));
		pd_Explain.setForeground(Color.PINK);
		add(pd_Explain);
		
		name_tf = new JTextField();
		name_tf.setBounds(587, 137, 355, 21);
		name_tf.setColumns(10);
		add(name_tf);
		
		price_tf = new JTextField();
		price_tf.setColumns(10);
		price_tf.setBounds(587, 201, 355, 21);
		add(price_tf);
		
		explain_tf = new JTextArea();
		explain_tf.setLineWrap(true);
		explain_tf.setBounds(587, 302, 355, 227);
		add(explain_tf);
		
		JButton regist_Bt = new JButton("등록");
		regist_Bt.setBounds(394, 598, 97, 33);
		regist_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 31));
		regist_Bt.setForeground(new Color(153,204,255));
		regist_Bt.setBorderPainted(false);
		regist_Bt.setFocusPainted(false);
		regist_Bt.setContentAreaFilled(false);
		add(regist_Bt);
		
		JButton cancel_Bt = new JButton("취소");
		cancel_Bt.setBounds(544, 598, 97, 33);
		cancel_Bt.setFont(new Font("HSSaemaul", Font.BOLD, 30));
		cancel_Bt.setForeground(new Color(153,204,255));
		cancel_Bt.setBorderPainted(false);
		cancel_Bt.setFocusPainted(false);
		cancel_Bt.setContentAreaFilled(false);
		add(cancel_Bt);
		
		
		JCheckBox lend_cb = new JCheckBox("대여");
		lend_cb.setBounds(828, 246, 54, 29);
		lend_cb.setFont(new Font("HSSaemaul", Font.PLAIN, 17));
		lend_cb.setForeground(new Color(153,204,255));
		lend_cb.setBorderPainted(false);
		lend_cb.setFocusPainted(false);
		lend_cb.setContentAreaFilled(false);
		add(lend_cb);
		
		JCheckBox sell_cb = new JCheckBox("판매");
		sell_cb.setBounds(888, 246, 54, 29);
		sell_cb.setFont(new Font("HSSaemaul", Font.PLAIN, 17));
		sell_cb.setForeground(new Color(153,204,255));
		sell_cb.setBorderPainted(false);
		sell_cb.setFocusPainted(false);
		sell_cb.setContentAreaFilled(false);
		add(sell_cb);
		
		setBackground(Color.DARK_GRAY);
		
		regist_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = JOptionPane.showConfirmDialog(getParent(), "등록티비-?", "상품 등록", JOptionPane.OK_CANCEL_OPTION);
				if(r == 0) {
					JOptionPane.showMessageDialog(getParent(), "등록티비 !");
					card.show(pg, "list");
				}
				else JOptionPane.showMessageDialog(getParent(), "등록 취소티비");
				init();
			}
		});
		
		cancel_Bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				init();
				card.show(pg, "kate");
			}
		});
	}
	public void init() {
		price_tf.setText("");
		name_tf.setText("");
		explain_tf.setText("");
	}
}
