package com.distribuida.dao;

import java.util.List;
import com.distribuida.entities.Libro;
public interface LibroDAO {

	public List<Libro> findALL();
	
	public Libro findOne(int id);
	
	public void add(Libro libro);
	
	public void up(Libro librp);
	
	public void del(int id);
	
}