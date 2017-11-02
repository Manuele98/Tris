package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Finestra2 extends JFrame {

	private JPanel contentPane;
	private JPanel panel_Nero_1_vert;
	private JPanel panel_1;
	private JPanel panel_Nero_2_vert;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_Nero_1_orz;
	private JPanel panel_4;
	private JPanel panel_Nero_2_orz;
	private JPanel panel_7;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_8;
	private JPanel panel_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra2 frame = new Finestra2();
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
	public Finestra2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_Nero_1_vert = new JPanel();
		panel_Nero_1_vert.setBackground(Color.BLACK);
		panel_Nero_1_vert.setBounds(161, 45, 10, 433);
		contentPane.add(panel_Nero_1_vert);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 45, 142, 123);
		contentPane.add(panel_1);
		
		panel_Nero_2_vert = new JPanel();
		panel_Nero_2_vert.setBackground(Color.BLACK);
		panel_Nero_2_vert.setBounds(333, 45, 10, 433);
		contentPane.add(panel_Nero_2_vert);
		
		panel_3 = new JPanel();
		panel_3.setBounds(353, 45, 142, 123);
		contentPane.add(panel_3);
		
		panel_2 = new JPanel();
		panel_2.setBounds(181, 45, 142, 123);
		contentPane.add(panel_2);
		
		panel_Nero_1_orz = new JPanel();
		panel_Nero_1_orz.setBackground(Color.BLACK);
		panel_Nero_1_orz.setBounds(10, 179, 487, 10);
		contentPane.add(panel_Nero_1_orz);
		
		panel_4 = new JPanel();
		panel_4.setBounds(10, 200, 142, 123);
		contentPane.add(panel_4);
		
		panel_Nero_2_orz = new JPanel();
		panel_Nero_2_orz.setBackground(Color.BLACK);
		panel_Nero_2_orz.setBounds(10, 334, 487, 10);
		contentPane.add(panel_Nero_2_orz);
		
		panel_7 = new JPanel();
		panel_7.setBounds(10, 355, 142, 123);
		contentPane.add(panel_7);
		
		panel_5 = new JPanel();
		panel_5.setBounds(181, 200, 142, 123);
		contentPane.add(panel_5);
		
		panel_6 = new JPanel();
		panel_6.setBounds(353, 200, 142, 123);
		contentPane.add(panel_6);
		
		panel_8 = new JPanel();
		panel_8.setBounds(181, 355, 142, 123);
		contentPane.add(panel_8);
		
		panel_9 = new JPanel();
		panel_9.setBounds(353, 355, 142, 123);
		contentPane.add(panel_9);
	}

}
