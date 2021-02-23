package es.codigoswift.videosguitarra.controladores;

import es.codigoswift.videosguitarra.annotations.Link;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Link(label="inicio", family="Videos", parent = "" )
    @GetMapping({ "/", "", "inicio", "index"})
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView("inicio");
        return modelAndView;
    }

}
