package ejercicioTablets;

public class Tablets {
	//Atributos
		protected String codigo, marca, modelo, color;
		protected double precio;
		//Contructores -> Es un metodo con lo mismo nombre de la clase, que me permiti criar el objeto y inicializar
				// ... su variaveis y atributos con un valor concreto.
				// para criar construtor automatico -> Source - Generate Constructor using fileds..
		
		 public Tablets(String codigo, String marca, String modelo) {
			this.codigo = codigo;
			this.marca = marca;
			this.modelo = modelo;
			//exemplo a parte de um construtor apenas com 3 informacoes
			
		}
		protected Tablets(String codigo, String marca, String modelo, String color, double precio) {
			this.codigo = codigo;
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.precio = precio;
			// Construtor com todas as informacoes
		}

		protected String getCodigo() {
			return codigo;
		}

		protected void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		protected String getMarca() {
			return marca;
		}

		protected void setMarca(String marca) {
			this.marca = marca;
		}

		protected String getModelo() {
			return modelo;
		}

		protected void setModelo(String modelo) {
			this.modelo = modelo;
		}

		protected String getColor() {
			return color;
		}

		protected void setColor(String color) {
			this.color = color;
		}

		protected double getPrecio() {
			return precio;
		}

		protected void setPrecio(double precio) {
			this.precio = precio;
		}	
}
