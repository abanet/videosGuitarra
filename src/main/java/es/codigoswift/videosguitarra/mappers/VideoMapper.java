package es.codigoswift.videosguitarra.mappers;

import es.codigoswift.videosguitarra.beans.Video;
import es.codigoswift.videosguitarra.modelo.VideosEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VideoMapper {
    VideoMapper INSTANCE = Mappers.getMapper(VideoMapper.class);


    Video toVideo(VideosEntity video);
    List<Video> toListVideo(List<VideosEntity> entities);
}
