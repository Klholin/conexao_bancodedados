

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testeview {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testeview window = new testeview();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}});
	}

	/**
	 * Create the application.
	 */
	public testeview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Codigo");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(55, 51, 90, 28);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(155, 55, 96, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Nome:" + txtNome.getText());
			}
		});
		btnNewButton.setBounds(271, 54, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRealizarConsulta = new JButton("Consultar");
		btnRealizarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRealizarConsulta.setBounds(120, 367, 117, 23);
		frame.getContentPane().add(btnRealizarConsulta);
		
		JButton btnRealizarInsero = new JButton("Inserção");
		btnRealizarInsero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRealizarInsero.setBounds(274, 367, 117, 23);
		frame.getContentPane().add(btnRealizarInsero);
		
		JButton btnRealizarAlterao = new JButton("Alterar");
		btnRealizarAlterao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRealizarAlterao.setBounds(419, 367, 117, 23);
		frame.getContentPane().add(btnRealizarAlterao);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(578, 367, 117, 23);
		frame.getContentPane().add(btnExcluir);
		
		JLabel lblDescricao = new JLabel("Descricao");
		lblDescricao.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescricao.setBounds(55, 107, 90, 28);
		frame.getContentPane().add(lblDescricao);
		
		JLabel lblNome_1_1 = new JLabel("Valor Unitario");
		lblNome_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_1_1.setBounds(55, 159, 90, 28);
		frame.getContentPane().add(lblNome_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(155, 111, 96, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 163, 96, 20);
		frame.getContentPane().add(textField_1);
	}
}
