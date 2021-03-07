package es.codigoswift.videosguitarra.mappers;

import es.codigoswift.videosguitarra.beans.Categoria;
import es.codigoswift.videosguitarra.beans.Video;
import es.codigoswift.videosguitarra.modelo.CategoriaEntity;
import es.codigoswift.videosguitarra.modelo.VideosEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoriaMapper {
    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    @Mapping(target = "videos", ignore = true)
    Categoria toCategoria(CategoriaEntity categoriaEntity);

    List<Categoria> toListCategoria(List<CategoriaEntity> categoriaEntityList);

}
