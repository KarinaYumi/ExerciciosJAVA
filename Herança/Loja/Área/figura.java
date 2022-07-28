
public class figura {
	
	private int area;
	private int altura;
	private int largura;
	
//GETTERS E SETTERS
	
	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getArea() {
		return area;
	}

	public int setArea(int area) {
		this.area = area;
		return area;
	}
	
//MÉTODOS
	
		public int calcularArea() {
			return setArea((this.altura*this.largura));
		}
		
		public void exibirArea() {
			System.out.println("A área da figura é: "+area+"\n----------------------------");
		}	
	}

