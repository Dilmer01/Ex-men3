package pe.Mendieta.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.Mendieta.dao.ProductoDao;
import pe.Mendieta.entity.Producto;
import pe.Mendieta.service.ProductoService;



@Service

public class ProductoServiceImpl implements  ProductoService{
	@Autowired
	private ProductoDao pr;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pr.readAll();
	} 

	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return pr.create(p);
	}
	

}
