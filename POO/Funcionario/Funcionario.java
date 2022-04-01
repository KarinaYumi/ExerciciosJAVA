package ex02;

public class Funcionario {
    String Nome;
    double SalarioBruto, SalarioComissao, SalarioLiquido;

    public Funcionario(double SalarioBruto, String Nome){
        this.SalarioBruto = SalarioBruto;
        this.Nome = Nome;
    }
    public void SalarioComissao(){
        SalarioComissao = (SalarioBruto * 0.12);
            System.out.println(Nome+" O valor da sua comissão é de
            R$"+SalarioComissao);
    }
    public void SalarioLiquido(){
        SalarioLiquido = (SalarioBruto + SalarioComissao);
            System.out.println(Nome+" seu salário líquido é de
            R$"+SalarioLiquido);
        }
    }
