package Tela02;
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
	painel.setSize(720,290);
	painel.setTitle("Cadastro Fornecedor");
	
	JPanel painel1 = new JPanel();
    painel1.setSize(300, 400);
    painel1.setBackground(corFundo);
    
    
    JLabel lblCod = new JLabel("C�digo: ");
	JTextField txtCod= new JTextField(4);

	
	JLabel lblTipoPessoa = new JLabel("Tipo Pessoa");
	String [] tipoPessoa = {"Pessoa Jur�dica","Pessoa F�sica" };
	JComboBox cboPessoa = new JComboBox(tipoPessoa);
	
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField(30);

	
	JLabel lblDoc = new JLabel("CNPJ/CPF");
	JTextField txtDoc = new JTextField(25);

	
	JLabel lblRG = new JLabel("RG:");
	JTextField txtRG = new JTextField(25);

	
	JLabel lblTel = new JLabel("Telefone:");
	JTextField txtTel = new JTextField(25);

	
	JLabel lblCel = new JLabel("Celular:");
	JTextField txtCel = new JTextField(25);

	
	JLabel lblEmail = new JLabel("Email:");
	JTextField txtEmail = new JTextField(50);

	
	JLabel lblCategoria = new JLabel("Categoria-Fornecimento:");
	JTextField txtCategoria = new JTextField(20);

	
	JLabel lblCEP = new JLabel("CEP:");
	JTextField txtCEP = new JTextField(25);
	
	JLabel lblEstado = new JLabel("Estado:");
	String [] estado = {"AC","AL","AP","AM","BA","CE","DF","ES"
			,"GO","MA","MT","MS"
			,"MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO"
			,"RR","SC","SP","SE","TO"};
	JComboBox cboEstado = new JComboBox(estado);
	
	JLabel lblEndereco = new JLabel("Endere�o:");
	JTextField txtEndereco = new JTextField(45);

	
	JLabel lblBairro = new JLabel("Bairro:");
	JTextField txtBairro = new JTextField(25);

	JLabel lblCidade = new JLabel("Cidade:");
	JTextField txtCidade = new JTextField(28);

	
	JLabel lblComplemento = new JLabel("Complemento");
	JTextField txtComplemento = new JTextField(20);

	
	JLabel lblSite = new JLabel ("Site:");
	JTextField txtSite = new JTextField(30);

	
	JButton btnSalvar = new JButton("Salvar");
	btnSalvar.setBackground(corBtnSalvar);
	JButton btnExcluir = new JButton("Excluir");
	btnExcluir.setBackground(Color.red);
	
	
		painel1.add(lblCod);
		painel1.add(txtCod);
	
		painel1.add(lblNome);
		painel1.add(txtNome);
		
		painel1.add(lblTipoPessoa);
		painel1.add(cboPessoa);
	
		painel1.add(lblDoc);
		painel1.add(txtDoc);
	
		painel1.add(lblRG);
		painel1.add(txtRG);
	
		painel1.add(lblTel);
		painel1.add(txtTel);
	
			painel1.add(lblCel);
			painel1.add(txtCel);
	
			painel1.add(lblEmail);
			painel1.add(txtEmail);
	
			painel1.add(lblCategoria);
		painel1.add(txtCategoria);
	
		painel1.add(lblCEP);
		painel1.add(txtCEP);
		
		painel1.add(lblEstado);
		painel1.add(cboEstado);
	
		painel1.add(lblEndereco);
		painel1.add(txtEndereco);
	
		painel1.add(lblBairro);
		painel1.add(txtBairro);
	
		painel1.add(lblCidade);
		painel1.add(txtCidade);
	
		painel1.add(lblComplemento);
		painel1.add(txtComplemento);
	
		painel1.add(lblSite);
		painel1.add(txtSite);
	
	
		painel1.add(btnSalvar);
		painel1.add(btnExcluir);
    
		painel.add(painel1);
		painel.setVisible(true);
	}
}