package Fiado;

public class Consumidor {
	
	//Atributos
	//Package - Public - Protected - Private
	private String nome;
	private int[] fiados;
	private int posicao=0;
	private int number=0;
	
	// Construtor
	public Consumidor(String nome) {
		this.nome=nome;
		this.fiados=new int[10];
	}
	
	//Getter e Setter
	public String getNome( ) {
		return this.nome;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void registrarFiado(int valor) {
		this.fiados[posicao] =valor;
		posicao++;
	}
	
	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}

}
