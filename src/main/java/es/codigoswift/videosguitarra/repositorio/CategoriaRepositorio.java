package es.codigoswift.videosguitarra.repositorio;

import es.codigoswift.videosguitarra.modelo.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepositorio extends JpaRepository<CategoriaEntity, Integer> {

    List<CategoriaEntity> findAllByOrderByNombreAsc();

}