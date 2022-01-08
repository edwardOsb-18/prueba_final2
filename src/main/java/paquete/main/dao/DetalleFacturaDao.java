package paquete.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import paquete.main.model.DetalleFactura;

/**
 * la Interface DetalleFacturaDao.
 */
public interface DetalleFacturaDao extends JpaRepository<DetalleFactura,Integer> {

}
