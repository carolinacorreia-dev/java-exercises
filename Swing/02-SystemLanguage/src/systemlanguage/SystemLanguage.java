package systemlanguage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class SystemLanguage {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public SystemLanguage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 349, 177);
		getFrame().setLocationRelativeTo(null);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		Image globe = new ImageIcon(this.getClass().getResource("/globe.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(globe));
		
		JLabel lblNewLabel_1 = new JLabel("Idioma atual do sistema:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblLanguage = new JLabel("Clique no botão");
		lblLanguage.setForeground(new Color(128, 128, 128));
		lblLanguage.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnLanguage = new JButton("Mostrar Idioma");
		btnLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Locale language = Locale.getDefault();
				lblLanguage.setText(language.getDisplayLanguage().toUpperCase());
			}
		});
		btnLanguage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout groupLayout = new GroupLayout(getFrame().getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLanguage)
						.addComponent(btnLanguage))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblLanguage)
							.addGap(18)
							.addComponent(btnLanguage)))
					.addContainerGap(16, Short.MAX_VALUE))
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
