package com.distribuida.dao;

	import java.util.List;
	import com.distribuida.entities.categoria;
	public interface categoriaDAO {

		
		public List<categoria> findALL();
		
		public categoria findOne(int id);
		
		public void add (categoria Categoria);
		
		public void up (categoria Categoria);

		public void del (int id);
	}