package org.curso.automacao.modulos.erp.customerservice.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Component
public class CustomerQueryBuilder {

	@PersistenceContext
	private EntityManager em;
	
	public Customer findUserBy(String name) {
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);
		
		QCustomer customer = QCustomer.customer;	
		Customer c = queryFactory.selectFrom(customer)
					.where(customer.name.eq(name))								
					.fetchFirst();
		
		return c;
	}
}
