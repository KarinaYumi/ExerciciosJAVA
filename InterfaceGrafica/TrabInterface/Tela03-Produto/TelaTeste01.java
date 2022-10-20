package Tela03;
	import java.awt.Color;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

			public class TelaTeste01{

				public static void main(String[] args) {
					
		Color cor = new Color(220,220,220);
		Color corFundo = new Color(176,196,222);
		Color corBtnSalvar = new Color(70,130,180);
					    
		JFrame painel = new JFrame();
		painel.setSize(500,160);
		painel.setTitle("Cadastro Produto");
				
		JPanel painel1 = new JPanel();
		painel1.setSize(300, 400);
		painel1.setBackground(corFundo);
			    
			    
		JLabel lblCod = new JLabel("Codigo do Produto:");
		JTextField txtCod = new JTextField(4);

				
		JLabel lblDescricao = new JLabel("Descrição:");
		JTextField txtDescricao = new JTextField(20);
				
		JLabel lblCategoria = new JLabel("Categoria:");
		String [] categorias = {"Laticínios","HortiFruti", "Alimentos", "Limpeza","Bebidas"};
		JComboBox cboCategoria = new JComboBox(categorias);

				
		JLabel lblFabricante = new JLabel("Fabricante:");
		JTextField txtFabricante = new JTextField(21);

				
		JLabel lblQnt = new JLabel("Quantidade:");
		JTextField txtQnt = new JTextField(10);
				
		JLabel lblValor = new JLabel("Valor:");
		JTextField txtValor = new JTextField(15);
				
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(corBtnSalvar);
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(Color.red);
				
				
			painel1.add(lblCod);
			painel1.add(txtCod);
				
			painel1.add(lblDescricao);
			painel1.add(txtDescricao);
				
			painel1.add(lblCategoria);
			painel1.add(cboCategoria);
				
			painel1.add(lblFabricante);
			painel1.add(txtFabricante);
				
			painel1.add(lblQnt);
			painel1.add(txtQnt);
			
			painel1.add(lblValor);
			painel1.add(txtValor);
			
				
			painel1.add(btnCadastrar);
			painel1.add(btnExcluir);
			    
			  painel.add(painel1);
			  painel.setVisible(true);
		

		}
}