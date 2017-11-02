package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Finestra1 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel label;
	private JLabel lbl_NickName;
	private JTextField textField_NickName;
	private JButton btn_Accedi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra1 frame = new Finestra1();
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
	public Finestra1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 434, 262);
		contentPane.add(panel);
		
		label = new JLabel("Accesso");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(108, 26, 216, 31);
		panel.add(label);
		
		lbl_NickName = new JLabel("Nick Name");
		lbl_NickName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_NickName.setBounds(31, 112, 107, 31);
		panel.add(lbl_NickName);
		
		textField_NickName = new JTextField();
		textField_NickName.setColumns(10);
		textField_NickName.setBounds(160, 112, 164, 27);
		panel.add(textField_NickName);
		
		btn_Accedi = new JButton("Accedi");
		btn_Accedi.setBounds(160, 187, 107, 31);
		panel.add(btn_Accedi);
		
	}

	public JTextField getTextField_NickName() {
		return textField_NickName;
	}

	public void setTextField_NickName(JTextField textField_NickName) {
		this.textField_NickName = textField_NickName;
	}

	public JButton getBtn_Accedi() {
		return btn_Accedi;
	}

	public void setBtn_Accedi(JButton btn_Accedi) {
		this.btn_Accedi = btn_Accedi;
	}
}
