package com.distribuida.entities;

public class categoria {

	// Atributos
	
		private String idcategoria;
		private String categoria;
		
	// Constructor 
		public categoria() {}
		
		public categoria(String idcategoria, String categoria) {
			super();
			this.idcategoria = idcategoria;
			this.categoria = categoria;
		}
		public String getIdcategoria() {
			return idcategoria;
		}
		public void setIdcategoria(String idcategoria) {
			this.idcategoria = idcategoria;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		@Override
		public String toString() {
			return "categoria [idcategoria=" + idcategoria + ", categoria=" + categoria + "]";
		}
}
