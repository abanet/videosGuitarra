package es.codigoswift.videosguitarra.servicio;

import es.codigoswift.videosguitarra.beans.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriaServicio {
    public List<Categoria> categoriasOrdenAscendente();
    
}
