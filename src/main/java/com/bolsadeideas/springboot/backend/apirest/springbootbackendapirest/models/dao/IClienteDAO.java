package com.bolsadeideas.springboot.backend.apirest.springbootbackendapirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IClienteDAO extends JpaRepository<Cliente, Long> {

    //IDEM Repository

} 
