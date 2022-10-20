package Tela04;
	import java.awt.Color;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

		public class TelaSwing{
		public static void main(String[] args) {
				
	Color cor = new Color(220,220,220);
	Color corFundo = new Color(176,196,222);
	Color corBtnSalvar = new Color(70,130,180);
				    
	JFrame painel = new JFrame();
	painel.setSize(550,215);
	painel.setTitle("Cadastro Cliente");
			
	JPanel painel1 = new JPanel();
	painel1.setSize(300, 400);
	painel1.setBackground(corFundo);
	
		JLabel lblCod = new JLabel("Código");
		JTextField txtCod = new JTextField(10);
	
		JLabel lblNome = new JLabel("Nome:");
		JTextField txtNome = new JTextField(28);
		
		JLabel lblRG = new JLabel("RG:");
		JTextField txtRG = new JTextField(20);
		
		JLabel lblCPF = new JLabel("CPF:");
		JTextField txtCPF = new JTextField(20);
		
		JLabel lblEnd = new JLabel("Endereço");
		JTextField txtEnd = new JTextField(40);
		
		JLabel lblBairro = new JLabel("Bairro:");
		JTextField txtBairro = new JTextField(15);
		
		JLabel lblCidade = new JLabel("Cidade");
		JTextField txtCidade = new JTextField(12);
		
		JLabel lblCEP = new JLabel("CEP:");
		JTextField txtCEP = new JTextField(11);
		
		JLabel lblEstado = new JLabel("Estado:");
		String [] estado = {"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB"
		,"PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
		JComboBox cboEstado = new JComboBox(estado);

		JLabel lblEmail = new JLabel("Email:");
		JTextField txtEmail = new JTextField(21);
		
		JLabel lblTel = new JLabel("Telefone:");
		JTextField txtTel = new JTextField(15);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(corBtnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(Color.red);
		
		painel1.add(lblCod);
		painel1.add(txtCod);
			
		painel1.add(lblNome);
		painel1.add(txtNome);
		
		painel1.add(lblRG);
		painel1.add(txtRG);
		
		painel1.add(lblCPF);
		painel1.add(txtCPF);
			
		painel1.add(lblEnd);
		painel1.add(txtEnd);
			
		painel1.add(lblBairro);
		painel1.add(txtBairro);
		
		painel1.add(lblCidade);
		painel1.add(txtCidade);
			
		painel1.add(lblEstado);
		painel1.add(cboEstado);
		
		painel1.add(lblEmail);
		painel1.add(txtEmail);
		
		painel1.add(lblTel);
		painel1.add(txtTel);
		
		painel1.add(btnCadastrar);
		painel1.add(btnExcluir);
		
			painel.add(painel1);
			painel.setVisible(true);
		
		}
	}