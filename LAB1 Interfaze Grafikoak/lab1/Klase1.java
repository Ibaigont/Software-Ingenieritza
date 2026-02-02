package lab1;

import java.awt.EventQueue;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class Klase1 extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JLabel lblNewLabel_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Klase1 frame = new Klase1();
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
	public Klase1() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(Klase1.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getRdbtnNewRadioButton());
		getContentPane().add(getRdbtnNewRadioButton_1());
		getContentPane().add(getRdbtnNewRadioButton_2());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getBtnNewButton_3());
		getContentPane().add(getBtnNewButton_4());
		getContentPane().add(getBtnNewButton_5());
		getContentPane().add(getChckbxNewCheckBox());
		getContentPane().add(getChckbxNewCheckBox_1());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getChckbxNewCheckBox_2());
		getContentPane().add(getChckbxNewCheckBox_3());

	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("A");
			buttonGroup_1.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(6, 58, 103, 21);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("B");
			buttonGroup_1.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBounds(6, 81, 103, 21);
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("C");
			buttonGroup_1.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setBounds(6, 104, 103, 21);
		}
		return rdbtnNewRadioButton_2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Botoi bat sakatu");
			lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
			lblNewLabel.setBounds(189, 24, 161, 47);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("A1");
			btnNewButton.setBounds(189, 81, 85, 21);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("A2");
			btnNewButton_1.setBounds(276, 81, 85, 21);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("B1");
			btnNewButton_2.setBounds(189, 114, 85, 21);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("C1");
			btnNewButton_3.setBounds(189, 145, 85, 21);
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("B2");
			btnNewButton_4.setBounds(276, 114, 85, 21);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("C2");
			btnNewButton_5.setBounds(276, 145, 85, 21);
		}
		return btnNewButton_5;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("1. aukera");
			chckbxNewCheckBox.setBounds(189, 172, 93, 21);
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("2. aukera");
			chckbxNewCheckBox_1.setBounds(286, 172, 93, 21);
		}
		return chckbxNewCheckBox_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Gustoko duzu?");
			lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
			lblNewLabel_1.setBounds(102, 240, 107, 13);
		}
		return lblNewLabel_1;
	}
	private JCheckBox getChckbxNewCheckBox_2() {
		if (chckbxNewCheckBox_2 == null) {
			chckbxNewCheckBox_2 = new JCheckBox("Bai");
			buttonGroup.add(chckbxNewCheckBox_2);
			chckbxNewCheckBox_2.setBounds(192, 237, 92, 20);
		}
		return chckbxNewCheckBox_2;
	}
	private JCheckBox getChckbxNewCheckBox_3() {
		if (chckbxNewCheckBox_3 == null) {
			chckbxNewCheckBox_3 = new JCheckBox("Ez");
			buttonGroup.add(chckbxNewCheckBox_3);
			chckbxNewCheckBox_3.setBounds(286, 237, 92, 20);
		}
		return chckbxNewCheckBox_3;
	}
}
