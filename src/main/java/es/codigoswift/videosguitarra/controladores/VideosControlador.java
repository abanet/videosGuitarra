package es.codigoswift.videosguitarra.controladores;

import es.codigoswift.videosguitarra.beans.Video;
import es.codigoswift.videosguitarra.servicio.VideosServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class VideosControlador {

    @Autowired
    VideosServicio videosServicio;

    @GetMapping({"/", ""})
    public ModelAndView listadoVideos() {
       ModelAndView modelAndView = new ModelAndView("listadoVideos");

        // Añadimos los videos a mostrar
        List<Video> videos = videosServicio.buscarTodosLosVideos();

        modelAndView.addObject("videos", videos);

        return modelAndView;
    }
}
