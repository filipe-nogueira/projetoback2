package br.com.stefanini.projetofinal.ws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.projetofinal.ws.model.Caderno;


@Repository
public interface CadernoRepository extends CrudRepository<Caderno, Integer> {

}
