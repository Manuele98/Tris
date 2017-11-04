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
		
		panel_Nero_2_vert = new JPanel();
		panel_Nero_2_vert.setBackground(Color.BLACK);
		panel_Nero_2_vert.setBounds(364, 159, 10, 433);
		contentPane.add(panel_Nero_2_vert);
		
		panel_3 = new JPanel();
		panel_3.setBounds(384, 159, 142, 123);
		contentPane.add(panel_3);
		
		panel_2 = new JPanel();
		panel_2.setBounds(212, 159, 142, 123);
		contentPane.add(panel_2);
		
		panel_Nero_1_orz = new JPanel();
		panel_Nero_1_orz.setBackground(Color.BLACK);
		panel_Nero_1_orz.setBounds(41, 293, 487, 10);
		contentPane.add(panel_Nero_1_orz);
		
		panel_4 = new JPanel();
		panel_4.setBounds(41, 314, 142, 123);
		contentPane.add(panel_4);
		
		panel_Nero_2_orz = new JPanel();
		panel_Nero_2_orz.setBackground(Color.BLACK);
		panel_Nero_2_orz.setBounds(41, 448, 487, 10);
		contentPane.add(panel_Nero_2_orz);
		
		panel_7 = new JPanel();
		panel_7.setBounds(41, 469, 142, 123);
		contentPane.add(panel_7);
		
		panel_5 = new JPanel();
		panel_5.setBounds(212, 314, 142, 123);
		contentPane.add(panel_5);
		
		panel_6 = new JPanel();
		panel_6.setBounds(384, 314, 142, 123);
		contentPane.add(panel_6);
		
		panel_8 = new JPanel();
		panel_8.setBounds(212, 469, 142, 123);
		contentPane.add(panel_8);
		
		panel_9 = new JPanel();
		panel_9.setBounds(384, 469, 142, 123);
		contentPane.add(panel_9);
		
		lbl_Simbolo_Gioco = new JLabel("Tu giochi con -->");
		lbl_Simbolo_Gioco.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Simbolo_Gioco.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl_Simbolo_Gioco.setBounds(595, 178, 181, 35);
		contentPane.add(lbl_Simbolo_Gioco);
		
		panel_Simbolo_Giocatore = new JPanel();
		panel_Simbolo_Giocatore.setBounds(786, 159, 65, 65);
		contentPane.add(panel_Simbolo_Giocatore);
		
		lbl_Avversario = new JLabel("Avversario -->");
		lbl_Avversario.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl_Avversario.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Avversario.setBounds(595, 314, 181, 35);
		contentPane.add(lbl_Avversario);
		
		btn_Invia = new JButton("Invia");
		btn_Invia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_Invia.setBounds(713, 448, 106, 23);
		contentPane.add(btn_Invia);
		
		panel_Simbolo_Avversario = new JPanel();
		panel_Simbolo_Avversario.setBounds(786, 293, 65, 65);
		contentPane.add(panel_Simbolo_Avversario);
		
		lbl_Titolo = new JLabel("Tris & Vinci");
		lbl_Titolo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Titolo.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		lbl_Titolo.setBounds(278, 35, 401, 51);
		contentPane.add(lbl_Titolo);
		
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	public JPanel getPanel_3() {
		return panel_3;
	}

	public void setPanel_3(JPanel panel_3) {
		this.panel_3 = panel_3;
	}

	public JPanel getPanel_2() {
		return panel_2;
	}

	public void setPanel_2(JPanel panel_2) {
		this.panel_2 = panel_2;
	}

	public JPanel getPanel_4() {
		return panel_4;
	}

	public void setPanel_4(JPanel panel_4) {
		this.panel_4 = panel_4;
	}

	public JPanel getPanel_7() {
		return panel_7;
	}

	public void setPanel_7(JPanel panel_7) {
		this.panel_7 = panel_7;
	}

	public JPanel getPanel_5() {
		return panel_5;
	}

	public void setPanel_5(JPanel panel_5) {
		this.panel_5 = panel_5;
	}

	public JPanel getPanel_6() {
		return panel_6;
	}

	public void setPanel_6(JPanel panel_6) {
		this.panel_6 = panel_6;
	}

	public JPanel getPanel_8() {
		return panel_8;
	}

	public void setPanel_8(JPanel panel_8) {
		this.panel_8 = panel_8;
	}

	public JPanel getPanel_9() {
		return panel_9;
	}

	public void setPanel_9(JPanel panel_9) {
		this.panel_9 = panel_9;
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
}
