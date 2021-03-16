package br.net.mfs.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.mfs.hroauth.entities.User;
import br.net.mfs.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {
	
	private static Logger logger = LoggerFactory.getLogger( UserService.class ) ;
	
	@Autowired
	private UserFeignClient userFeignClient ;
	
	public User FindByEmail(String email) {
		
		User user = userFeignClient.findByEmail(email).getBody();
		
		if (user == null) {
			
			logger.error("email not found : "+email );
			throw new IllegalArgumentException("Email not found") ;
			
		}
		logger.info("email found : "+email );
		return user ;
	}

}
