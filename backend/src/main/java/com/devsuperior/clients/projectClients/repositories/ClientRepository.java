package com.devsuperior.clients.projectClients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.clients.projectClients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
