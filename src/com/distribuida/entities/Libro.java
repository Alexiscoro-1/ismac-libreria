package com.distribuida.entities;

import java.util.Date;

public class Libro {

	// Atributos
		
		private String	titutlo;
		private String editorial;
		private int num_paginas;
		private String edicion;
		private String idioma;
		private Date fecha_publicacion;
		private String descripcion;
		private String tipo_pasta;
		private String ISBN;
		private int num_ejemplares;
		private String portada;
		private String presentacion;
		private double precio;
		
		private categoria categoria;
		private Autor autor;
		
	// Constructor 

		public Libro() {}

		public Libro(String titutlo, String editorial, int num_paginas, String edicion, String idioma,
				Date fecha_publicacion, String descripcion, String tipo_pasta, String iSBN, int num_ejemplares,
				String portada, String presentacion, double precio) {
			super();
			this.titutlo = titutlo;
			this.editorial = editorial;
			this.num_paginas = num_paginas;
			this.edicion = edicion;
			this.idioma = idioma;
			this.fecha_publicacion = fecha_publicacion;
			this.descripcion = descripcion;
			this.tipo_pasta = tipo_pasta;
			ISBN = iSBN;
			this.num_ejemplares = num_ejemplares;
			this.portada = portada;
			this.presentacion = presentacion;
			this.precio = precio;
		}

		public String getTitutlo() {
			return titutlo;
		}

		public void setTitutlo(String titutlo) {
			this.titutlo = titutlo;
		}

		public String getEditorial() {
			return editorial;
		}

		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}

		public int getNum_paginas() {
			return num_paginas;
		}

		public void setNum_paginas(int num_paginas) {
			this.num_paginas = num_paginas;
		}

		public String getEdicion() {
			return edicion;
		}

		public void setEdicion(String edicion) {
			this.edicion = edicion;
		}

		public String getIdioma() {
			return idioma;
		}

		public void setIdioma(String idioma) {
			this.idioma = idioma;
		}

		public Date getFecha_publicacion() {
			return fecha_publicacion;
		}

		public void setFecha_publicacion(Date fecha_publicacion) {
			this.fecha_publicacion = fecha_publicacion;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getTipo_pasta() {
			return tipo_pasta;
		}

		public void setTipo_pasta(String tipo_pasta) {
			this.tipo_pasta = tipo_pasta;
		}

		public String getISBN() {
			return ISBN;
		}

		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}

		public int getNum_ejemplares() {
			return num_ejemplares;
		}

		public void setNum_ejemplares(int num_ejemplares) {
			this.num_ejemplares = num_ejemplares;
		}

		public String getPortada() {
			return portada;
		}

		public void setPortada(String portada) {
			this.portada = portada;
		}

		public String getPresentacion() {
			return presentacion;
		}

		public void setPresentacion(String presentacion) {
			this.presentacion = presentacion;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(categoria categoria) {
			this.categoria = categoria;
		}

		public Autor getAutor() {
			return autor;
		}

		public void setAutor(Autor autor) {
			this.autor = autor;
		}

		@Override
		public String toString() {
			return "Libro [titutlo=" + titutlo + ", editorial=" + editorial + ", num_paginas=" + num_paginas
					+ ", edicion=" + edicion + ", idioma=" + idioma + ", fecha_publicacion=" + fecha_publicacion
					+ ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_pasta + ", ISBN=" + ISBN
					+ ", num_ejemplares=" + num_ejemplares + ", portada=" + portada + ", presentacion=" + presentacion
					+ ", precio=" + precio + ", categoria=" + categoria + ", autor=" + autor + "]";
		}
		
}
