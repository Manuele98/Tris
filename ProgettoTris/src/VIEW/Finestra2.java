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
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Finestra2 extends JFrame {

	private JPanel contentPane;
	private JPanel panel_Nero_1_vert;
	private JPanel panel_Nero_2_vert;
	private JPanel panel_Nero_1_orz;
	private JPanel panel_Nero_2_orz;
	private JLabel lbl_Simbolo_Gioco;
	private JLabel lbl_Avversario;
	private JButton btn_Invia;
	private JLabel lbl_Titolo;
	private JButton btnEsci;
	private JLabel lblLabelNomeAvversario;
	private ImageIcon icon,icon2;
	private JLabel lbl_1;
	private JLabel lbl_2;
	private JLabel lbl_3;
	private JLabel lbl_4;
	private JLabel lbl_5;
	private JLabel lbl_6;
	private JLabel lbl_7;
	private JLabel lbl_8;
	private JLabel lbl_9;
	private JLabel label_Simbolo_Giocatore;
	private JLabel label_Simbolo_Avversario;

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
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_Nero_1_vert = new JPanel();
		panel_Nero_1_vert.setBackground(Color.BLACK);
		panel_Nero_1_vert.setBounds(192, 159, 10, 433);
		contentPane.add(panel_Nero_1_vert);
				
		panel_Nero_2_vert = new JPanel();
		panel_Nero_2_vert.setBackground(Color.BLACK);
		panel_Nero_2_vert.setBounds(364, 159, 10, 433);
		contentPane.add(panel_Nero_2_vert);
		
		panel_Nero_1_orz = new JPanel();
		panel_Nero_1_orz.setBackground(Color.BLACK);
		panel_Nero_1_orz.setBounds(41, 293, 487, 10);
		contentPane.add(panel_Nero_1_orz);
		
		panel_Nero_2_orz = new JPanel();
		panel_Nero_2_orz.setBackground(Color.BLACK);
		panel_Nero_2_orz.setBounds(41, 448, 487, 10);
		contentPane.add(panel_Nero_2_orz);
		
		lbl_Simbolo_Gioco = new JLabel("Tu giochi con -->");
		lbl_Simbolo_Gioco.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Simbolo_Gioco.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl_Simbolo_Gioco.setBounds(595, 178, 181, 35);
		contentPane.add(lbl_Simbolo_Gioco);
		
		lbl_Avversario = new JLabel("Avversario -->");
		lbl_Avversario.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		lbl_Avversario.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Avversario.setBounds(595, 314, 181, 35);
		contentPane.add(lbl_Avversario);
		
		btn_Invia = new JButton("Invia");
		btn_Invia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_Invia.setBounds(709, 448, 110, 35);
		contentPane.add(btn_Invia);
		
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
		
		lbl_1 = new JLabel("");
		lbl_1.setBounds(40, 159, 142, 123);
		icon = new ImageIcon("Cerchio.png");     // istruzioni necessarie per far comparire l'immagine sul tris
		lbl_1.setIcon(icon);                     // istruzioni necessarie per far comparire l'immagine sul tris
		contentPane.add(lbl_1);
		
		lbl_2 = new JLabel("");
		lbl_2.setBounds(212, 159, 142, 123);
		icon = new ImageIcon("X.jpg");           // istruzioni necessarie per far comparire l'immagine sul tris
		lbl_2.setIcon(icon);                     // istruzioni necessarie per far comparire l'immagine sul tris
		contentPane.add(lbl_2);  
		
		lbl_3 = new JLabel("");
		lbl_3.setBounds(384, 159, 142, 123);
		contentPane.add(lbl_3);
		
		lbl_4 = new JLabel("");
		lbl_4.setBounds(41, 314, 142, 123);
		contentPane.add(lbl_4);
		
		lbl_5 = new JLabel("");
		lbl_5.setBounds(212, 314, 142, 123);
		contentPane.add(lbl_5);
		
		lbl_6 = new JLabel("");
		lbl_6.setBounds(386, 314, 142, 123);
		contentPane.add(lbl_6);
		
		lbl_7 = new JLabel("");
		lbl_7.setBounds(40, 469, 142, 123);
		contentPane.add(lbl_7);
		
		lbl_8 = new JLabel("");
		lbl_8.setBounds(212, 469, 142, 123);
		contentPane.add(lbl_8);
		
		lbl_9 = new JLabel("");
		lbl_9.setBounds(386, 469, 142, 123);
		contentPane.add(lbl_9);
		
		label_Simbolo_Giocatore = new JLabel("");
		label_Simbolo_Giocatore.setBounds(786, 164, 65, 65);
		icon2 = new ImageIcon("Cerchio_piccolo.png");     //istruzioni necessarie per far comparire l'immagine piccola
		label_Simbolo_Giocatore.setIcon(icon2);           //istruzioni necessarie per far comparire l'immagine piccola
		contentPane.add(label_Simbolo_Giocatore);
		
		label_Simbolo_Avversario = new JLabel("");
		label_Simbolo_Avversario.setBounds(786, 302, 65, 65);
		icon2 = new ImageIcon("X_piccolo.jpg");        //istruzioni necessarie per far comparire l'immagine piccola
		label_Simbolo_Avversario.setIcon(icon2);       //istruzioni necessarie per far comparire l'immagine piccola
		contentPane.add(label_Simbolo_Avversario);
		
	}

	public JLabel getLabel_Simbolo_Giocatore() {
		return label_Simbolo_Giocatore;
	}

	public void setLabel_Simbolo_Giocatore(JLabel label_Simbolo_Giocatore) {
		this.label_Simbolo_Giocatore = label_Simbolo_Giocatore;
	}

	public JLabel getLabel_Simbolo_Avversario() {
		return label_Simbolo_Avversario;
	}

	public void setLabel_Simbolo_Avversario(JLabel label_Simbolo_Avversario) {
		this.label_Simbolo_Avversario = label_Simbolo_Avversario;
	}

	public JButton getBtn_Invia() {
		return btn_Invia;
	}

	public void setBtn_Invia(JButton btn_Invia) {
		this.btn_Invia = btn_Invia;
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
