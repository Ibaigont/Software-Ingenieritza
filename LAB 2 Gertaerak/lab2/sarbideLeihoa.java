package lab2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class sarbideLeihoa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton NireBotoi;
	private JRadioButton Botoi5;
	private JRadioButton Botoi10;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sarbideLeihoa frame = new sarbideLeihoa();
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
	public sarbideLeihoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("TAMAINA");
		setLocationRelativeTo(null);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		contentPane.add(getLblNewLabel());
		contentPane.add(getBotoi5());
		contentPane.add(getBotoi10());
		contentPane.add(getNireBotoi());

	}

	private JButton getNireBotoi() {
		if (NireBotoi == null) {
			NireBotoi = new JButton("OK");
			NireBotoi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (Botoi5.isSelected()) {
						//matrizeakSortu5x5();
						gelaxkenLehioa gelaxkaLehioa = new gelaxkenLehioa(5,5);
						setVisible(false);
					} else if (Botoi10.isSelected()) {
						//matrizeakSortu10x10();
						gelaxkenLehioa gelaxkaLehioa = new gelaxkenLehioa(10,10);
						setVisible(false);
					}
					
				}
			});
		}
		return NireBotoi;
	}
	/*private void matrizeakSortu5x5() {
		J panel = new JPanel();
		int i,j;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				panel.add(get);
			}
		}
	}
	private void matrizeakSortu10x10() {
		JPanel panel = new JPanel();
		int i,j;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				panel.add(getBntnNewButton(i,j));
			}
		}
	}*/
	
	private JRadioButton getBotoi5() {
		if (Botoi5 == null) {
			Botoi5 = new JRadioButton("5x5");
			Botoi5.setHorizontalAlignment(SwingConstants.CENTER);
			buttonGroup.add(Botoi5);
		}
		return Botoi5;
	}
	private JRadioButton getBotoi10() {
		if (Botoi10 == null) {
			Botoi10 = new JRadioButton("10x10");
			Botoi10.setHorizontalAlignment(SwingConstants.CENTER);
			buttonGroup.add(Botoi10);
		}
		return Botoi10;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Aukera ezazu tamaina:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel;
	}
}
