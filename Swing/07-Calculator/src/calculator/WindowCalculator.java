package calculator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowCalculator {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public WindowCalculator() {
		initialize();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setResizable(false);
		getFrame().setBounds(100, 100, 609, 411);
		getFrame().setLocationRelativeTo(null);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel1 = new JLabel("Informe um valor:");
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JSpinner txtNum = new JSpinner();
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panelCalc = new JPanel();
		panelCalc.setVisible(false);
		
		JLabel lblNewLabel7 = new JLabel("");
		Image calculator = new ImageIcon(this.getClass().getResource("/calculator.png")).getImage();
		lblNewLabel7.setIcon(new ImageIcon(calculator));
		
		JLabel lblNewLabel2 = new JLabel("Resto da Divisão por 2");
		lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblRem = new JLabel("0");
		lblRem.setHorizontalAlignment(SwingConstants.CENTER);
		lblRem.setForeground(new Color(0, 0, 128));
		lblRem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel6 = new JLabel("Raiz Cúbica");
		lblNewLabel6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblCbrt = new JLabel("0");
		lblCbrt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCbrt.setForeground(new Color(0, 0, 128));
		lblCbrt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel3 = new JLabel("Elevado ao Cubo");
		lblNewLabel3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblCub = new JLabel("0");
		lblCub.setHorizontalAlignment(SwingConstants.CENTER);
		lblCub.setForeground(new Color(0, 0, 128));
		lblCub.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel5 = new JLabel("Valor Absoluto");
		lblNewLabel5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblAbs = new JLabel("0");
		lblAbs.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbs.setForeground(new Color(0, 0, 128));
		lblAbs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel4 = new JLabel("Raiz Quadrada");
		lblNewLabel4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblSqrt = new JLabel("0");
		lblSqrt.setHorizontalAlignment(SwingConstants.CENTER);
		lblSqrt.setForeground(new Color(0, 0, 128));
		lblSqrt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = Integer.parseInt(txtNum.getValue().toString());
				
				int rem = num % 2;
				lblRem.setText(Integer.toString(rem));
				
				double cub = Math.pow(num, 3);
				lblCub.setText(Double.toString(cub));
				
				double sqrt = Math.sqrt(num);
				lblSqrt.setText(String.format("%.2f", sqrt));
				
				double cbrt = Math.cbrt(num);
				lblCbrt.setText(String.format("%.2f", cbrt));
				
				int abs = Math.abs(num);
				lblAbs.setText(Integer.toString(abs));
				
				panelCalc.setVisible(true);
			}
		});
		
		Image keys = new ImageIcon(this.getClass().getResource("/keys.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(keys));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GroupLayout gl_panelCalc = new GroupLayout(panelCalc);
		gl_panelCalc.setHorizontalGroup(
			gl_panelCalc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCalc.createSequentialGroup()
					.addGroup(gl_panelCalc.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCalc.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel2)
							.addGap(18)
							.addComponent(lblRem, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCalc.createSequentialGroup()
							.addGap(12)
							.addComponent(lblNewLabel3, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblCub, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCalc.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel4, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(lblSqrt, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCalc.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, gl_panelCalc.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblNewLabel5, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblAbs, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
							.addGroup(Alignment.LEADING, gl_panelCalc.createSequentialGroup()
								.addGap(10)
								.addComponent(lblNewLabel6)
								.addGap(94)
								.addComponent(lblCbrt, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_panelCalc.setVerticalGroup(
			gl_panelCalc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCalc.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panelCalc.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel2)
						.addComponent(lblRem))
					.addGap(18)
					.addGroup(gl_panelCalc.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel3)
						.addComponent(lblCub))
					.addGap(18)
					.addGroup(gl_panelCalc.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel4)
						.addComponent(lblSqrt))
					.addGap(18)
					.addGroup(gl_panelCalc.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel6)
						.addComponent(lblCbrt))
					.addGap(18)
					.addGroup(gl_panelCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel5)
						.addComponent(lblAbs))
					.addGap(24))
		);
		panelCalc.setLayout(gl_panelCalc);
		GroupLayout groupLayout = new GroupLayout(getFrame().getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(196)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(83)
									.addComponent(lblNewLabel1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(35)
									.addComponent(panelCalc, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(29)
									.addComponent(lblNewLabel7, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(65)
									.addComponent(btnNewButton)))))
					.addGap(153))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(lblNewLabel)
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel1)
						.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel7, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelCalc, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)))
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
