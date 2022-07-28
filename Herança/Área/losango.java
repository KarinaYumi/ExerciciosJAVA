public class losango extends figura {

	private int diagonalMenor, diagonalMaior;
	
	//GET SET
	public int getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(int diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}
	
	public int getDiagonalMenor() {
		return diagonalMaior;
	}

	public void setDiagonalMenor(int diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	
// MÉTODOS
	@Override
	public int calcularArea() {
		return setArea((this.getDiagonalMaior()*this.getDiagonalMenor()/2));
	}
	
	
	public void exibirArea() {
		System.out.println("A área do losango é :"+getArea()+"\n----------------------------------");
	}
}
