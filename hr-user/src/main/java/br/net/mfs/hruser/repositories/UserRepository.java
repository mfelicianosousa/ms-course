package br.net.mfs.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.mfs.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail( String email );

}
