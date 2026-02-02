package lab1;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

import java.awt.FlowLayout;

public class gridLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gridLayout frame = new gridLayout();
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
	public gridLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getLblNewLabel2(), BorderLayout.WEST);
		contentPane.add(getPanel(), BorderLayout.CENTER);
		contentPane.add(getLblNewLabel_1(), BorderLayout.NORTH);

	}
	private JLabel getLblNewLabel2() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("LERROAK");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new GridLayout(10, 10, 0, 0));
			matrizeakSortu();
		}
		return panel;
	}
	private void matrizeakSortu() {
		int i,j;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				panel.add(getBntnNewButton(i,j));
			}
		}
	}
		
	private JButton getBntnNewButton(int i, int j) {
		JButton btnNewButton = new JButton("l"+i+"z"+j);
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		return btnNewButton;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("ZUTABEAK");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_1;
	}
}
