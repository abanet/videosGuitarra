package es.codigoswift.videosguitarra.repositorio;

import es.codigoswift.videosguitarra.modelo.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<CategoriaEntity, Integer> {

}