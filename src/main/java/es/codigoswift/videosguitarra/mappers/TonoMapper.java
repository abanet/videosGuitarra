package es.codigoswift.videosguitarra.mappers;

import es.codigoswift.videosguitarra.beans.Tono;
import es.codigoswift.videosguitarra.modelo.TonoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TonoMapper {
    TonoMapper INSTANCE = Mappers.getMapper(TonoMapper.class);

    @Mapping(target = "videos", ignore = true)
    Tono toTono(TonoEntity tonoEntity);

    List<Tono> toListTono(List<TonoEntity> tonoEntityList);
}
