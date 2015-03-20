public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private int KmRodado;
	private int KmInicial;
	private int KmFinal;
	private double Valor;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getKmRodado() {
		return KmRodado;
	}

	public void setKmRodado(int kmRodado) {
		this.KmRodado = kmRodado;
	}

	public int getKmInicial() {
		return KmInicial;
	}

	public void setKmInicial(int kmInicial) {
		this.KmInicial = kmInicial;
	}

	public int getKmFinal() {
		return KmFinal;
	}

	public void setKmFinal(int kmFinal) {
		this.KmFinal = kmFinal;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		this.Valor = (this.KmInicial-this.KmFinal)* this.KmRodado;
	}

}
