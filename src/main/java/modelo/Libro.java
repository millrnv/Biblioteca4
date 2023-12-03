package modelo;

public class Libro {
	private String nombre;
	private String autor;
	private String editorial;
	private String ISBN;


	public Libro(String nombre, String autor, String editorial, String ISBN) {
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.ISBN = ISBN;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getISBN() {
		return this.ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	@Override
	public String toString() {
		return "Libro{" +
				"nombre='" + nombre + '\'' +
				", autor='" + autor + '\'' +
				", editorial='" + editorial + '\'' +
				", ISBN='" + ISBN + '\'' +
				'}';
	}
}