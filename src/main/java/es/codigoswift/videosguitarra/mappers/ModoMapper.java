package es.codigoswift.videosguitarra.mappers;

import es.codigoswift.videosguitarra.beans.Modo;
import es.codigoswift.videosguitarra.modelo.ModoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ModoMapper {
    ModoMapper INSTANCE = Mappers.getMapper(ModoMapper.class);

    @Mapping(target = "videos", ignore = true)
    Modo toModo(ModoEntity modoEntity);

    List<Modo> toListModo(List<ModoEntity> modoEntityList);
}
