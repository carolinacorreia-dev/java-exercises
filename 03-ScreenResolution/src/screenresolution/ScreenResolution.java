package screenresolution;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenResolution {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public ScreenResolution() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 366, 179);
		getFrame().setLocationRelativeTo(null);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		Image computer = new ImageIcon(this.getClass().getResource("/computer.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(computer));
		
		JLabel lblNewLabel_1 = new JLabel("Resolução da Tela:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblScreen = new JLabel("Clique no botão");
		lblScreen.setForeground(new Color(128, 128, 128));
		lblScreen.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnScreen = new JButton("Mostrar Resolução");
		btnScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
				int width = (int) screen.getWidth();
				int height = (int) screen.getHeight();
				lblScreen.setText(width + " x " + height);
			}
		});
		btnScreen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout groupLayout = new GroupLayout(getFrame().getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblScreen)
						.addComponent(btnScreen))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(lblScreen)
					.addGap(18)
					.addComponent(btnScreen))
		);
		getFrame().getContentPane().setLayout(groupLayout);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
