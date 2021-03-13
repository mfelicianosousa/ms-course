package br.net.mfs.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.mfs.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository< Worker, Long >{

}
