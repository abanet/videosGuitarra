package es.codigoswift.videosguitarra.controladores;

import es.codigoswift.videosguitarra.annotations.Link;
import es.codigoswift.videosguitarra.beans.Video;
import es.codigoswift.videosguitarra.servicio.VideosServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/videos")
public class VideosControlador {

    @Autowired
    VideosServicio videosServicio;



    @Link(label="listado", family="Videos", parent = "inicio" )
    @GetMapping("/listado")
    public ModelAndView listadoVideos() {
       ModelAndView modelAndView = new ModelAndView("listado-videos");

        // Añadimos los videos a mostrar
        List<Video> videos = videosServicio.buscarTodosLosVideos();

        modelAndView.addObject("videos", videos);

        return modelAndView;
    }

    @Link(label="alta", family="Videos", parent = "inicio" )
    @GetMapping("/formulario")
    public ModelAndView formVideo() {
        ModelAndView modelAndView = new ModelAndView("formulario-video");
        return modelAndView;
    }
}
