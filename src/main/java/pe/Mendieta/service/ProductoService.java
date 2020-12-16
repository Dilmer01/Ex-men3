package pe.Mendieta.service;

import java.util.List;
import java.util.Map;

import pe.Mendieta.entity.Producto;

public interface ProductoService {
	List<Map<String,Object>>readAll();
	int create(Producto p);
	
	
}
