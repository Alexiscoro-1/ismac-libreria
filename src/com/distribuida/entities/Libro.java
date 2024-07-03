package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Component
@Entity
@Table(name = "libro")
public class Libro {

		// Atributos
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_libro")
		private int idLibro;
		@Column(name = "titulo")
		private String	titutlo;
		@Column(name = "editorial")
		private String editorial;
		@Column(name = "num_paginas")
		private int numPaginas;
		@Column(name = "edicion")
		private String edicion;
		@Column(name = "idioma")
		private String idioma;
		@Column(name = "fecha_publicacion")
		private Date fechaPublicacion;
		private String descripcion;
		@Column(name = "tipo_pasta")
		private String tipoPpasta;
		@Column(name = "ISBN")
		private String ISBN;
		@Column(name = "num_ejemplares")
		private int numEjemplares;
		@Column(name = "portada")
		private String portada;
		@Column(name = "presentacion")
		private String presentacion;
		@Column(name = "precio")
		private double precio;
		
		
		
		@JoinColumn(name ="id_categoria")
		@JoinColumn(name ="id_Autor")
		@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
		private Cliente categoria;
		private Cliente autor;

		
		
	// Constructor 

		
		public Libro() {}
			
			public Libro(int idLibro, String titutlo, String editorial, int numPaginas, String edicion, String idioma,
				Date fechaPublicacion, String descripcion, String tipoPpasta, String iSBN, int numEjemplares,
				String portada, String presentacion, double precio, Cliente categoria, Cliente autor) {
			
			
			this.idLibro = idLibro;
			this.titutlo = titutlo;
			this.editorial = editorial;
			this.numPaginas = numPaginas;
			this.edicion = edicion;
			this.idioma = idioma;
			this.fechaPublicacion = fechaPublicacion;
			this.descripcion = descripcion;
			this.tipoPpasta = tipoPpasta;
			ISBN = iSBN;
			this.numEjemplares = numEjemplares;
			this.portada = portada;
			this.presentacion = presentacion;
			this.precio = precio;
			this.categoria = categoria;
			this.autor = autor;
		}



		public int getIdLibro() {
			return idLibro;
		}



		public void setIdLibro(int idLibro) {
			this.idLibro = idLibro;
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



		public int getNumPaginas() {
			return numPaginas;
		}



		public void setNumPaginas(int numPaginas) {
			this.numPaginas = numPaginas;
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



		public Date getFechaPublicacion() {
			return fechaPublicacion;
		}



		public void setFechaPublicacion(Date fechaPublicacion) {
			this.fechaPublicacion = fechaPublicacion;
		}



		public String getDescripcion() {
			return descripcion;
		}



		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}



		public String getTipoPpasta() {
			return tipoPpasta;
		}



		public void setTipoPpasta(String tipoPpasta) {
			this.tipoPpasta = tipoPpasta;
		}



		public String getISBN() {
			return ISBN;
		}



		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}



		public int getNumEjemplares() {
			return numEjemplares;
		}



		public void setNumEjemplares(int numEjemplares) {
			this.numEjemplares = numEjemplares;
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



		public Cliente getCategoria() {
			return categoria;
		}



		public void setCategoria(Cliente categoria) {
			this.categoria = categoria;
		}



		public Cliente getAutor() {
			return autor;
		}



		public void setAutor(Cliente autor) {
			this.autor = autor;
		}
		
		@Override
		public String toString() {
		return "Libro [idLibro=" + idLibro + ", titutlo=" + titutlo + ", editorial=" + editorial + ", numPaginas="
		+ numPaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechaPublicacion="
		+ fechaPublicacion + ", descripcion=" + descripcion + ", tipoPpasta=" + tipoPpasta + ", ISBN="
		+ ISBN + ", numEjemplares=" + numEjemplares + ", portada=" + portada + ", presentacion="
		+ presentacion + ", precio=" + precio + ", categoria=" + categoria + ", autor=" + autor + "]";
		
		
		}
}
		
		
		
		