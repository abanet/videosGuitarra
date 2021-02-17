package es.codigoswift.videosguitarra.servicio;

import es.codigoswift.videosguitarra.beans.Video;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VideosServicio {

    public List<Video> buscarTodosLosVideos();

}
