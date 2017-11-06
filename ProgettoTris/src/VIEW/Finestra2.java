package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

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
	private JLabel lbl_Simbolo_Gioco;
	private JPanel panel_Simbolo_Giocatore;
	private JLabel lbl_Avversario;
	private JButton btn_Invia;
	private JPanel panel_Simbolo_Avversario;
	private JLabel lbl_Titolo;
	private JButton btnEsci;
	private JLabel lblLabelNomeAvversario;
	private JLabel lbl_1;
	private JLabel lbl_2;
	private JLabel lbl_3;
	private JLabel lbl_4;
	private JLabel lbl_5;
	private JLabel lbl_6;
	private JLabel lbl_7;
	private JLabel lbl_8;
	private JLabel lbl_9;

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
		setBounds(100, 100, 950, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_Nero_1_vert = new JPanel();
		panel_Nero_1_vert.setBackground(Color.BLACK);
		panel_Nero_1_vert.setBounds(192, 159, 10, 433);
		contentPane.add(panel_Nero_1_vert);
		
		panel_1 = new JPanel();
		panel_1.setBounds(41, 159, 142, 123);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lbl_1 = new JLabel("");
		lbl_1.setBounds(0, 0, 142, 123);
		panel_1.add(lbl_1);
		
		panel_Nero_2_vert = new JPanel();
		panel_Nero_2_vert.setBackground(Color.BLACK);
		panel_Nero_2_vert.setBounds(364, 159, 10, 433);
		contentPane.add(panel_Nero_2_vert);
		
		panel_3 = new JPanel();
		panel_3.setBounds(384, 159, 142, 123);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lbl_3 = new JLabel("");
		lbl_3.setBounds(0, 0, 142, 123);
		panel_3.add(lbl_3);
		
		panel_2 = new JPanel();
		panel_2.setBounds(212, 159, 142, 123);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lbl_2 = new JLabel("");
		lbl_2.setBounds(0, 0, 142, 123);
		panel_2.add(lbl_2);
		
		panel_Nero_1_orz = new JPanel();
		panel_Nero_1_orz.setBackground(Color.BLACK);
		panel_Nero_1_orz.setBounds(41, 293, 487, 10);
		contentPane.add(panel_Nero_1_orz);
		
		panel_4 = new JPanel();
		panel_4.setBounds(41, 314, 142, 123);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		lbl_4 = new JLabel("");
		lbl_4.setBounds(0, 0, 142, 123);
		panel_4.add(lbl_4);
		
		panel_Nero_2_orz = new JPanel();
		panel_Nero_2_orz.setBackground(Color.BLACK);
		panel_Nero_2_orz.setBounds(41, 448, 487, 10);
		contentPane.add(panel_Nero_2_orz);
		
		panel_7 = new JPanel();
		panel_7.setBounds(41, 469, 142, 123);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		lbl_7 = new JLabel("");
		lbl_7.setBounds(0, 0, 142, 123);
		panel_7.add(lbl_7);
		
		panel_5 = new JPanel();
		panel_5.setBounds(212, 314, 142, 123);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		lbl_5 = new JLabel("");
		lbl_5.setBounds(0, 0, 142, 123);
		panel_5.add(lbl_5);
		
		panel_6 = new JPanel();
		panel_6.setBounds(384, 314, 142, 123);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		lbl_6 = new JLabel("");
		lbl_6.setBounds(0, 0, 142, 123);
		panel_6.add(lbl_6);
		
		panel_8 = new JPanel();
		panel_8.setBounds(212, 469, 142, 123);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		lbl_8 = new JLabel("");
		lbl_8.setBounds(0, 0, 142, 123);
		panel_8.add(lbl_8);
		
		panel_9 = new JPanel();
		panel_9.setBounds(384, 469, 142, 123);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		lbl_9 = new JLabel("");
		lbl_9.setBounds(0, 0, 142, 123);
		panel_9.add(lbl_9);
		
		lbl_Simbolo_Gioco = new JLabel("Tu giochi con -->");
		lbl_Simbolo_Gioco.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Simbolo_Gioco.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl_Simbolo_Gioco.setBounds(595, 178, 181, 35);
		contentPane.add(lbl_Simbolo_Gioco);
		
		panel_Simbolo_Giocatore = new JPanel();
		panel_Simbolo_Giocatore.setBounds(788, 159, 65, 65);
		contentPane.add(panel_Simbolo_Giocatore);
		
		lbl_Avversario = new JLabel("Avversario -->");
		lbl_Avversario.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl_Avversario.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Avversario.setBounds(595, 314, 181, 35);
		contentPane.add(lbl_Avversario);
		
		btn_Invia = new JButton("Invia");
		btn_Invia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_Invia.setBounds(709, 448, 110, 35);
		contentPane.add(btn_Invia);
		
		panel_Simbolo_Avversario = new JPanel();
		panel_Simbolo_Avversario.setBounds(788, 293, 65, 65);
		contentPane.add(panel_Simbolo_Avversario);
		
		lbl_Titolo = new JLabel("Tris & Vinci");
		lbl_Titolo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Titolo.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		lbl_Titolo.setBounds(278, 35, 401, 51);
		contentPane.add(lbl_Titolo);
		
		btnEsci = new JButton("Esci");
		btnEsci.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEsci.setBounds(709, 567, 110, 35);
		contentPane.add(btnEsci);
		
		lblLabelNomeAvversario = new JLabel("");
		lblLabelNomeAvversario.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabelNomeAvversario.setBounds(595, 362, 181, 35);
		contentPane.add(lblLabelNomeAvversario);
		
	}

	public JPanel getPanel_Simbolo_Giocatore() {
		return panel_Simbolo_Giocatore;
	}

	public void setPanel_Simbolo_Giocatore(JPanel panel_Simbolo_Giocatore) {
		this.panel_Simbolo_Giocatore = panel_Simbolo_Giocatore;
	}

	public JButton getBtn_Invia() {
		return btn_Invia;
	}

	public void setBtn_Invia(JButton btn_Invia) {
		this.btn_Invia = btn_Invia;
	}

	public JPanel getPanel_Simbolo_Avversario() {
		return panel_Simbolo_Avversario;
	}

	public void setPanel_Simbolo_Avversario(JPanel panel_Simbolo_Avversario) {
		this.panel_Simbolo_Avversario = panel_Simbolo_Avversario;
	}

	public JLabel getLbl_1() {
		return lbl_1;
	}

	public void setLbl_1(JLabel lbl_1) {
		this.lbl_1 = lbl_1;
	}

	public JLabel getLbl_2() {
		return lbl_2;
	}

	public void setLbl_2(JLabel lbl_2) {
		this.lbl_2 = lbl_2;
	}

	public JLabel getLbl_3() {
		return lbl_3;
	}

	public void setLbl_3(JLabel lbl_3) {
		this.lbl_3 = lbl_3;
	}

	public JLabel getLbl_4() {
		return lbl_4;
	}

	public void setLbl_4(JLabel lbl_4) {
		this.lbl_4 = lbl_4;
	}

	public JLabel getLbl_5() {
		return lbl_5;
	}

	public void setLbl_5(JLabel lbl_5) {
		this.lbl_5 = lbl_5;
	}

	public JLabel getLbl_6() {
		return lbl_6;
	}

	public void setLbl_6(JLabel lbl_6) {
		this.lbl_6 = lbl_6;
	}

	public JLabel getLbl_7() {
		return lbl_7;
	}

	public void setLbl_7(JLabel lbl_7) {
		this.lbl_7 = lbl_7;
	}

	public JLabel getLbl_8() {
		return lbl_8;
	}

	public void setLbl_8(JLabel lbl_8) {
		this.lbl_8 = lbl_8;
	}

	public JLabel getLbl_9() {
		return lbl_9;
	}

	public void setLbl_9(JLabel lbl_9) {
		this.lbl_9 = lbl_9;
	}
		
}
