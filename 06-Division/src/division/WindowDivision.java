package division;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class WindowDivision {

	private JFrame frame;
	private JTextField txtNum;
	private JTextField txtDen;

	/**
	 * Create the application.
	 */
	public WindowDivision() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 249, 319);
		getFrame().setLocationRelativeTo(null);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Numerador");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel2 = new JLabel("Denominador");
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblDiv = new JLabel("0");
		lblDiv.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblRem = new JLabel("0");
		lblRem.setHorizontalAlignment(SwingConstants.CENTER);
		lblRem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnDiv = new JButton("Dividir");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtNum.getText());
				int n2 = Integer.parseInt(txtDen.getText());
				int div = n1 / n2;
				int rem = n1 % n2;
				lblDiv.setText(Integer.toString(div));
				lblRem.setText(Integer.toString(rem));
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel3 = new JLabel("Divisão");
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel4 = new JLabel("Resto");
		lblNewLabel4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtNum = new JTextField();
		txtNum.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNum.setColumns(10);
		
		txtDen = new JTextField();
		txtDen.setHorizontalAlignment(SwingConstants.CENTER);
		txtDen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDen.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getFrame().getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(48)
							.addComponent(lblNewLabel)
							.addGap(23)
							.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(78)
							.addComponent(btnDiv))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(48)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel4)
										.addComponent(lblNewLabel3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
									.addGap(30)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblDiv, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblRem, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel2)
									.addGap(10)
									.addComponent(txtDen, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel2))
						.addComponent(txtDen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(btnDiv)
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel3)
						.addComponent(lblDiv))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel4)
						.addComponent(lblRem)))
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
