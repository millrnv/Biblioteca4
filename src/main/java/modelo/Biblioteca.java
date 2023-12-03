package modelo;


import modelo.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
	private String nombreBiblioteca;
	private String direccion;
	private ArrayList<Libro> libros;

	private List<Prestamo> prestamos;
	private List<Usuario> usuarios;
	private List<Bibliotecario> bibliotecarios;



	public Biblioteca(String nombreBiblioteca, String direccion) {
		this.nombreBiblioteca = nombreBiblioteca;
		this.direccion = direccion;
		libros = new ArrayList<>();
		this.prestamos = new ArrayList<>();
		this.usuarios = new ArrayList<>();
		this.bibliotecarios = new ArrayList<>();

	}

	public String getNombreBiblioteca() {
		return this.nombreBiblioteca;
	}

	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Libro> getLibros() {
		throw new UnsupportedOperationException();
	}

	public void setLibros(List<Libro> libros) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarLibro(Libro libro) {
		if (!libroExiste(libro)) {
			this.libros.add(libro);
			return true;
		} else {
			return false;
		}
	}

	public Libro buscarLibro(String nombre) {
		for (Libro libro : this.libros) {
			if (libro.getNombre().equals(nombre)) {
				return libro;
			}
		}
		return null;
	}

	public List<Libro> buscarLibroPorAutor(String autor) {
		List<Libro> librosAutor = new ArrayList<Libro>();
		for (Libro libro : this.libros) {
			if (libro.getAutor().equals(autor))
				librosAutor.add(libro);
		}
		return librosAutor;

	}

	public boolean libroExiste(Libro libro) {
		for (Libro l : this.libros) {
			if (libro.getISBN().equals(l.getISBN())) {
				return true;
			}
		}

		return false;
	}

	public void generarPrestamo(Bibliotecario bibliotecario, Usuario usuario, Libro libro, Date fechaInicio, Date fechaTermino) {
		if (!libroExiste(libro)) {
			System.out.println("El libro no existe en la biblioteca.");
			return;
		}
		for (Prestamo prestamo : prestamos) {
			if (prestamo.getLibro().equals(libro)) {
				System.out.println("El libro ya está prestado.");
				return;
			}
		}
		Prestamo nuevoPrestamo = new Prestamo(bibliotecario, usuario, libro, fechaInicio, fechaTermino);
		prestamos.add(nuevoPrestamo);
	}


}