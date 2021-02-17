package es.codigoswift.videosguitarra.repositorio;

import es.codigoswift.videosguitarra.modelo.VideosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideosRepositorio extends JpaRepository<VideosEntity, Long> {

}
