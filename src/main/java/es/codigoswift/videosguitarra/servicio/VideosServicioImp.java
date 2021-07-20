package es.codigoswift.videosguitarra.servicio;

import es.codigoswift.videosguitarra.beans.Video;
import es.codigoswift.videosguitarra.mappers.VideoMapper;
import es.codigoswift.videosguitarra.modelo.VideosEntity;
import es.codigoswift.videosguitarra.repositorio.VideosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideosServicioImp implements  VideosServicio {

    @Autowired
    VideosRepositorio videosRepositorio;

    @Override
    public List<Video> buscarTodosLosVideos() {
        List<VideosEntity> videosEntities = videosRepositorio.findAll();
        List<Video> videos = VideoMapper.INSTANCE.toListVideo(videosEntities);
        return videos;
    }
}
