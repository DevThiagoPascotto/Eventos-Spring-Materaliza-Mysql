package io.github.curso.eventoapp.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity  
@Getter
@Setter
public class Evento {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String local;
	
	@Column
	@JsonFormat(pattern = "dd/mm/yyyy HH:mm")
	private String data;
	
	@Column
	private String horario;
	
	
	

}
