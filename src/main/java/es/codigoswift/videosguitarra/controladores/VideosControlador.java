package es.codigoswift.videosguitarra.controladores;

import es.codigoswift.videosguitarra.annotations.Link;
import es.codigoswift.videosguitarra.beans.*;
import es.codigoswift.videosguitarra.modelo.CategoriaEntity;
import es.codigoswift.videosguitarra.repositorio.CategoriaRepositorio;
import es.codigoswift.videosguitarra.repositorio.ModoRepositorio;
import es.codigoswift.videosguitarra.repositorio.TonoRepositorio;
import es.codigoswift.videosguitarra.servicio.CategoriaServicio;
import es.codigoswift.videosguitarra.servicio.ModoServicio;
import es.codigoswift.videosguitarra.servicio.TonoServicio;
import es.codigoswift.videosguitarra.servicio.VideosServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/videos")
public class VideosControlador {

    @Autowired
    VideosServicio videosServicio;

    @Autowired
    CategoriaServicio categoriaServicio;
    @Autowired
    ModoServicio modoServicio;
    @Autowired
    TonoServicio tonoServicio;


    @Link(label = "listado", family = "Videos", parent = "inicio")
    @GetMapping("/listado")
    public ModelAndView listadoVideos() {
        ModelAndView modelAndView = new ModelAndView("listado-videos");
        // Añadimos los videos a mostrar
        List<Video> videos = videosServicio.buscarTodosLosVideos();
        modelAndView.addObject("videos", videos);
        return modelAndView;
    }

    @Link(label = "alta", family = "Videos", parent = "inicio")
    @GetMapping("/formulario")
    public ModelAndView formVideo() {
        ModelAndView modelAndView = new ModelAndView("formulario-video");
        Video video = new Video();
        List<Categoria> categoriaList = categoriaServicio.categoriasOrdenAscendente();
        List<Modo> modoList = modoServicio.modosOrdenAscendente();
        List<Tono> tonoList = tonoServicio.tonosOrdenAscendente();
        modelAndView.addObject("video", video);
        modelAndView.addObject("categorias", categoriaList);
        modelAndView.addObject("modos", modoList);
        modelAndView.addObject("tonos", tonoList);

        return modelAndView;
    }

    @PostMapping("/formulario")
    public ModelAndView procesarFormularioVideo(@Valid @ModelAttribute("video") Video video, BindingResult result, ModelAndView modelAndView) {
        if(result.hasErrors()) {
            return new ModelAndView("formulario-video", result.getModel());
        }
        modelAndView.addObject("video", video);
        modelAndView.setViewName("formulario-recibido");
        return modelAndView;
    }

    @GetMapping("/listado2")
    @ResponseBody
    public List<Video> apiListadoVideos() {
        return videosServicio.buscarTodosLosVideos();
    }

    @PostMapping(value="/nuevoVideo")
    @ResponseBody
    public RespuestaCreateVideo crearNuevoVideo(@RequestBody PeticionVideos datos) {
       RespuestaCreateVideo respuesta = new RespuestaCreateVideo();
       respuesta.setData("datos");
       //respuesta.setError("error");
      return respuesta;
    }
}