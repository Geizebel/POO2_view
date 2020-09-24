package br.com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.controller.UserLoger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSenha;
	private JTextField textFieldUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setTitle("Janela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBackground(new Color(153, 153, 255));
		lblNewLabel.setBounds(30, 96, 79, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(30, 157, 85, 25);
		contentPane.add(lblNewLabel_1);
		
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(104, 108, 273, 31);
		contentPane.add(textFieldUsuario);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(104, 152, 273, 31);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		
		JButton btnButtonLogar = new JButton("Logar");
		btnButtonLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserLoger us = new  UserLoger();
			if	(us.validacaoLogin(textFieldUsuario.getText(), textFieldSenha.getText()) ) {
				JOptionPane.showMessageDialog(contentPane, "Ok, "+textFieldUsuario.getText()+ " login realizado!");
			}
			else {
				JOptionPane.showMessageDialog(contentPane, "Falha ao logar!","Falha", JOptionPane.ERROR_MESSAGE);
			}
			
				
				textFieldUsuario.setText("");
				textFieldSenha.setText("");
				
				
				
			}
		});
		btnButtonLogar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnButtonLogar.setBounds(324, 228, 85, 25);
		contentPane.add(btnButtonLogar);
	}
}
