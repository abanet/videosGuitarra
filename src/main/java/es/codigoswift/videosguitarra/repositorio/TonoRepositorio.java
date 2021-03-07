package es.codigoswift.videosguitarra.repositorio;

import es.codigoswift.videosguitarra.modelo.TonoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TonoRepositorio extends JpaRepository<TonoEntity, Integer> {
    List<TonoEntity> findAllByOrderByNombreAsc();
}
