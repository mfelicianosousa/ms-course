/*
 *  Registrar o serviçe como um component do spring @Component
 *  mas o @Service é mais especifico
 * 
 * */
package br.net.mfs.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.net.mfs.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days ){
		return new Payment("Bob", 200.0 , days) ;
		
	}
}
