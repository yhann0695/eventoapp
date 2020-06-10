package com.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eventoapp.models.Evento;

@Repository
@Transactional
public interface EventoRepository extends CrudRepository<Evento, String>{

	Evento findByCodigo(Long codigo);
}
