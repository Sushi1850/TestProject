package colors;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * 
 * @author Kevin
 *
 */
public class Colors extends JFrame {

	private JPanel contentPane;
	JButton PinkButton = new JButton("Pink");
	JButton MagentaButton = new JButton("Magenta");
	JButton RedButton = new JButton("RED");
	JButton GreenButton = new JButton("GREEN");

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colors frame = new Colors();
					frame.setTitle("Colors");
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
	public Colors() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		GreenButton.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 30));
		MagentaButton.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 30));
		RedButton.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 30));
		PinkButton.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 30));

		
		//Button Green
		GreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GreenButton.setBackground(Color.green);
				RedButton.setBackground(Color.green);
				MagentaButton.setBackground(Color.green);
				PinkButton.setBackground(Color.green);
			}
		});
		GreenButton.setBounds(0, 0, 112, 261);
		GreenButton.setBackground(Color.green);
		GreenButton.setOpaque(true);
		contentPane.add(GreenButton);
		
		//Button red
		RedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GreenButton.setBackground(Color.red);
				RedButton.setBackground(Color.red);
				MagentaButton.setBackground(Color.red);
				PinkButton.setBackground(Color.red);
			}
		});
		RedButton.setBounds(108, 0, 112, 261);
		RedButton.setBackground(Color.red);
		RedButton.setOpaque(true);
		contentPane.add(RedButton);
		
		//Button Yellow
		MagentaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GreenButton.setBackground(Color.MAGENTA);
				RedButton.setBackground(Color.MAGENTA);
				MagentaButton.setBackground(Color.MAGENTA);
				PinkButton.setBackground(Color.MAGENTA);
			}
		});
		MagentaButton.setBounds(336, 0, 112, 261);
		MagentaButton.setBackground(Color.yellow);
		MagentaButton.setOpaque(true);
		contentPane.add(MagentaButton);
		
		//Button Blue
		PinkButton.setLocation(218, 0);
		PinkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GreenButton.setBackground(Color.pink);
				RedButton.setBackground(Color.pink);
				MagentaButton.setBackground(Color.pink);
				PinkButton.setBackground(Color.pink);
			}
		});
		PinkButton.setBackground(Color.pink);
		PinkButton.setOpaque(true);
		PinkButton.setSize(new Dimension(120, 261));
		contentPane.add(PinkButton);
		
		
	}

}
