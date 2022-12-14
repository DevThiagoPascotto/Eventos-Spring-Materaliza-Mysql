package io.github.curso.eventoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import io.github.curso.eventoapp.model.Evento;
import io.github.curso.eventoapp.repository.EventoRepository;





@Controller
public class EventoController {

	@Autowired
	private EventoRepository er;
	
		@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String form() {
		return "evento/formevento";
		}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String formEvento(Evento evento) {
		er.save(evento);
		return "redirect:/cadastrarEvento";
		}
	
	@RequestMapping(value="/eventos")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Evento> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		return mv;
	}
	

}
