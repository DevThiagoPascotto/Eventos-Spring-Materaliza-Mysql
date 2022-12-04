package io.github.curso.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import io.github.curso.eventoapp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	
	

}
