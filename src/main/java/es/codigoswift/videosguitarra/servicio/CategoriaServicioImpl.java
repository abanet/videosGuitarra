package es.codigoswift.videosguitarra.servicio;

import es.codigoswift.videosguitarra.beans.Categoria;
import es.codigoswift.videosguitarra.mappers.CategoriaMapper;
import es.codigoswift.videosguitarra.modelo.CategoriaEntity;
import es.codigoswift.videosguitarra.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicioImpl implements CategoriaServicio {

    @Autowired
    CategoriaRepositorio categoriaRepositorio;

    @Override
    public List<Categoria> categoriasOrdenAscendente() {
        List<CategoriaEntity> categoriaEntityList = categoriaRepositorio.findAllByOrderByNombreAsc();
        List<Categoria> categoriaList = CategoriaMapper.INSTANCE.toListCategoria(categoriaEntityList);
        return categoriaList;
    }
}
