package es.codigoswift.videosguitarra.repositorio;

import es.codigoswift.videosguitarra.modelo.ModoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModoRepositorio extends JpaRepository<ModoEntity, Integer> {

    List<ModoEntity> findAllByOrderByNombreAsc();

}
