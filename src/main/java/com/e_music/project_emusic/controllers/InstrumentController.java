package com.e_music.project_emusic.controllers;

import com.e_music.project_emusic.entities.Instrument;
import com.e_music.project_emusic.services.ServiceInstrument;
import com.e_music.project_emusic.services.ServiceInstrumentImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/instruments")
public class InstrumentController extends BaseControllerImpl< Instrument, ServiceInstrumentImpl >{

    @GetMapping(value = "/start")
    public ModelAndView start( Model model) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            modelAndView.setViewName("views/start.html");
        } catch (Exception e) {
            log.info(e.getMessage(),e) ;
            modelAndView.setViewName("error.html");
        }
        return modelAndView;
    }

    @GetMapping (value = "/details")
    public ModelAndView details( Model model) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            modelAndView.setViewName("views/details.html");
        } catch (Exception e) {
            log.info(e.getMessage(),e) ;
            modelAndView.setViewName("error.html");
        }
        return modelAndView;
    }

    @GetMapping (value = "/add_instrument")
    public ModelAndView add_instrument( Model model) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            modelAndView.setViewName("views/add_instrument.html");
        } catch (Exception e) {
            log.info(e.getMessage(),e) ;
            modelAndView.setViewName("error.html");
        }
        return modelAndView;
    }

    @GetMapping (value = "/crud")
    public ModelAndView crud( Model model) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            modelAndView.setViewName("views/crud.html");
        } catch (Exception e) {
            log.info(e.getMessage(),e) ;
            modelAndView.setViewName("error.html");
        }
        return modelAndView;
    }

}
