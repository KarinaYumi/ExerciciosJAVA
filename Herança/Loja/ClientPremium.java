public class ClientPremium extends Client {

	@Override
	public double calculaDesconto() {
		return (getValor_Pedido() - (getValor_Pedido() * 0.15));
	}
}