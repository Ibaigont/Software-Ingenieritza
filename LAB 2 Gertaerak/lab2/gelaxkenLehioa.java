package lab2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class gelaxkenLehioa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JButton Bertikalak;
	private JButton Horizontalak;
	private JButton Ingurukoak;
	private JPanel panel_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(Integer[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gelaxkenLehioa frame = new gelaxkenLehioa(args[0],args[1]);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gelaxkenLehioa(int x, int y) {
		setTitle("GELAXKEN LEHIOA");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getPanel_1(x,y), BorderLayout.CENTER);
		setLocationRelativeTo(null);

	}
	public void matrizeaSortu(int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				final int lerroa = i;
		        final int zutabea = j;
				JLabel gelaxka = new JLabel();
				gelaxka.setOpaque(true);
				gelaxka.setBackground(Color.blue);
				gelaxka.setBorder(BorderFactory.createLineBorder(Color.black));
				gelaxka.addMouseListener(new java.awt.event.MouseAdapter() {
					@Override
					public void mouseClicked(java.awt.event.MouseEvent e) {
						if (gelaxka.getBackground() == java.awt.Color.blue) {
							gelaxka.setBackground(java.awt.Color.red);
							getLblNewLabel().setText("X: " + lerroa + " Y: " + zutabea);
						} else {
							gelaxka.setBackground(java.awt.Color.blue);
						}
					}
				});
				panel_1.add(gelaxka);
			}
		}
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new GridLayout(0, 1, 0, 0));
			panel.add(getLblNewLabel());
			panel.add(getBertikalak());
			panel.add(getHorizontalak());
			panel.add(getIngurukoak());
		}
		return panel;
	}
	private JButton getBertikalak() {
		if (Bertikalak == null) {
			Bertikalak = new JButton("Bertikalak");
			Bertikalak.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					marraztuBertikalak();
				}
			});
		}
		return Bertikalak;
	}
	private void marraztuBertikalak() {
		int zutabea = -1;
		for (int i = 0; i < panel_1.getComponentCount(); i++) {
			if (panel_1.getComponent(i).getBackground() == Color.red) {
				zutabea = i % ((GridLayout) panel_1.getLayout()).getColumns();
			}
			if (zutabea != -1) {
				for (int j = zutabea; j < panel_1.getComponentCount(); j += ((GridLayout) panel_1.getLayout()).getColumns()) {
					if(panel_1.getComponent(j).getBackground() != Color.red) panel_1.getComponent(j).setBackground(Color.black);
				}
			}
			
		 
		
		}	
		
	}
	private JButton getHorizontalak() {
		if (Horizontalak == null) {
			Horizontalak = new JButton("Horizontalak");
			Horizontalak.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return Horizontalak;
	}
	private JButton getIngurukoak() {
		if (Ingurukoak == null) {
			Ingurukoak = new JButton("Ingurukoak");
			Ingurukoak.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return Ingurukoak;
	}
	private JPanel getPanel_1(int x, int y) {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new GridLayout(x, y, 0, 0));
			matrizeaSortu(x,y);
		}
		return panel_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("X: Y:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel;
	}
}
