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
	JButton BlueButton = new JButton("BLUE");
	JButton YellowButton = new JButton("Yellow");
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
		YellowButton.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 30));
		RedButton.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 30));
		BlueButton.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 30));

		
		//Button Green
		GreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GreenButton.setBackground(Color.green);
				RedButton.setBackground(Color.green);
				YellowButton.setBackground(Color.green);
				BlueButton.setBackground(Color.green);
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
				YellowButton.setBackground(Color.red);
				BlueButton.setBackground(Color.red);
			}
		});
		RedButton.setBounds(108, 0, 112, 261);
		RedButton.setBackground(Color.red);
		RedButton.setOpaque(true);
		contentPane.add(RedButton);
		
		//Button Yellow
		YellowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GreenButton.setBackground(Color.yellow);
				RedButton.setBackground(Color.yellow);
				YellowButton.setBackground(Color.yellow);
				BlueButton.setBackground(Color.yellow);
			}
		});
		YellowButton.setBounds(336, 0, 112, 261);
		YellowButton.setBackground(Color.yellow);
		YellowButton.setOpaque(true);
		contentPane.add(YellowButton);
		
		//Button Blue
		BlueButton.setLocation(218, 0);
		BlueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GreenButton.setBackground(Color.blue);
				RedButton.setBackground(Color.blue);
				YellowButton.setBackground(Color.blue);
				BlueButton.setBackground(Color.blue);
			}
		});
		BlueButton.setBackground(Color.blue);
		BlueButton.setOpaque(true);
		BlueButton.setSize(new Dimension(120, 261));
		contentPane.add(BlueButton);
		
		
	}

}
