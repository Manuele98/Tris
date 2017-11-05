package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;

public class Finestra3 extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JList list;
	private DefaultListModel mod;
	private JButton btnSpegniServer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra3 frame = new Finestra3();
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
	public Finestra3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 560, 291);
		contentPane.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(mod);
		
		btnSpegniServer = new JButton("Spegni server");
		btnSpegniServer.setBounds(220, 310, 128, 34);
		contentPane.add(btnSpegniServer);
		mod=new DefaultListModel();
	}

	public DefaultListModel getMod() {
		return mod;
	}

	public void setMod(String s) {
		mod.addElement(s);
	}

	public JButton getBtnSpegniServer() {
		return btnSpegniServer;
	}
	

}
