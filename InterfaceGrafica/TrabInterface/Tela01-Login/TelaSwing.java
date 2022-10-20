package Tela01;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaSwing{

	public static void main(String[] args) {
		
	Color cor = new Color(220,220,220);
	Color corFundo = new Color(176,196,222);
	Color corBtn = new Color(70,130,180);
		    
	JFrame painel = new JFrame();
	painel.setSize(350,135);
	painel.setTitle("Login");
	
	JPanel painel1 = new JPanel();
    painel1.setSize(350,135);
    painel1.setBackground(corFundo);
    
    
    JLabel lblLogin = new JLabel("Login:");
	JTextField txtLogin = new JTextField(25);
	
	JLabel lblSenha = new JLabel("Senha:");
	JTextField txtSenha = new JTextField(25);
	
	JButton btnRedSenha = new JButton("Redefinir Senha");
	btnRedSenha.setBackground(Color. red);
	
	JButton btnEntrar = new JButton("Entrar");
	btnEntrar.setBackground(corBtn);
	
		painel1.add(lblLogin);
		painel1.add(txtLogin);
	
		painel1.add(lblSenha);
		painel1.add(txtSenha);
	
		painel1.add(btnRedSenha);
		painel1.add(btnEntrar);
	
			painel.add(painel1);
			painel.setVisible(true);
	    
	}
}
