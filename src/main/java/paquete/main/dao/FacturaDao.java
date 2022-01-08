package paquete.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import paquete.main.model.Factura;

/**
 * la Interface FacturaDao.
 */
public interface FacturaDao extends JpaRepository<Factura, Integer> {

}


