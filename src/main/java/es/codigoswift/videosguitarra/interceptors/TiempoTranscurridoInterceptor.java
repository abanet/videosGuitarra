package es.codigoswift.videosguitarra.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("tiempoTranscurridoInterceptor")
public class TiempoTranscurridoInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(TiempoTranscurridoInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("TiempoTranscurridoInterceptor: preHandle() entrando...");
        long tiempoInicio = System.currentTimeMillis();
        request.setAttribute("tiempoInicio", tiempoInicio);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        long tiempoFinal = System.currentTimeMillis();
        long tiempoInicio = (Long) request.getAttribute("tiempoInicio");
        long tiempoTranscurrido = tiempoFinal - tiempoInicio;
        if (modelAndView != null) {
            modelAndView.addObject("tiempoTranscurrido", tiempoTranscurrido);
        }
        logger.info("TiempoTranscurridoInterceptor: postHandle() saliendo...");
        logger.info("TiempoTranscurrido: " + tiempoTranscurrido + " milisegundos");
    }
}
