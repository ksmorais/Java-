package aula02;

public class Veiculo {
	// Atributos
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private double preco;
	private boolean ligado;
	
	// Construtor
	
public Veiculo(String marca, String modelo, String cor, int ano, double preco) {
	this.marca = marca;
	this.modelo = modelo;
	this.ano = ano;
	this.cor = cor;
	this.preco = preco;
}

	// metodos para exibir informações de Veiculo

	public void exibirInformacoes () {
		System.out.println("\n--------------");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Ligado: " + ligado);
		System.out.println("\n--------------");
		
}
	//Metodo para ligar Veiculo
	
	public void ligar() {
		this.ligado = true;
		System.out.println("O veiculo está ligado.");
	}
	
	public void desligar() {
		this.ligado = false;
		System.out.println("O veiculos está desligado");
	}
	
	public static void main(String[] args) {
		//exemplo
		
		Veiculo meuCarro = new Veiculo("Toyota", "Corolla", "Prata", 2022, 75000.0);
		meuCarro.exibirInformacoes();
		meuCarro.ligar();
		meuCarro.exibirInformacoes();
		meuCarro.desligar();
		meuCarro.exibirInformacoes();
		
	}
	
}
