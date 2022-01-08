package paquete.main.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import paquete.main.dao.FacturaDao;
import paquete.main.model.Factura;


/**
 * la Class FacturaService.
 */
@RestController
@RequestMapping("/factura")

public class FacturaService {


	@Autowired 
	private FacturaDao facturaDao;
	
	
	
	
	/**
	 * Guardar.
	 *
	 * @param Factura the factura
	 */
	@PostMapping("/guardar")
	public void guardar(@RequestBody Factura factura) {
		facturaDao.save(factura);
	}
	
	/**
	 * Listar.
	 *
	 * @return  list
	 */
	@GetMapping("/listar")
	public List <Factura> listar(){
		return facturaDao.findAll();
	}

	/**
	 * Actualizar.
	 *
	 * @param Factura de factura
	 * aqui se podra actualizar conociendo el codigo
	 */
	@PutMapping("/actualizar")
	public void actualizar (@RequestBody Factura factura) {
		
		facturaDao.save(factura);
	}
	
	

	
}
