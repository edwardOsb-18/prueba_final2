package paquete.main.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import paquete.main.dao.DetalleFacturaDao;
import paquete.main.model.DetalleFactura;

//
/**
 * The Class DetalleFacturaService.
 */
@RestController
@RequestMapping("/detalleFactura")
public class DetalleFacturaService {

/** The detalle factura dao. */
@Autowired
private DetalleFacturaDao detalleFacturaDao;

/**
 * Guardar.
 *
 * @param detalleFactura the detalle factura
 */
@PostMapping("/guardar")
public void guardar(@RequestBody DetalleFactura detalleFactura) {
	detalleFacturaDao.save(detalleFactura);
	
}
	
/**
 * Listar.
 *
 * @return the list
 */
@GetMapping("/listar")
public List<DetalleFactura> listar(){
	return detalleFacturaDao.findAll();
}

/**
 * Eliminar.
 *
 * @param codigo the codigo
 */
@DeleteMapping("eliminar/{codigo}")
public void eliminar(@PathVariable("codigo") Integer codigo) {
	detalleFacturaDao.deleteById(codigo);

	
}

}
