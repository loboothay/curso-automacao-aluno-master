package org.curso.automacao.modulos.erp.userservice.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Component
public class UserQueryBuilder {

	@PersistenceContext
	private EntityManager em;
	
	public User findUserBy(String userName) {
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);
		
		QUser user = QUser.user;	
		User u = queryFactory.selectFrom(user)
					.where(user.username.eq(userName))								
					.fetchOne();
		
		return u;
	}
	
	public User findUserBy(String userName, String userPassword) {
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);
		
		QUser user = QUser.user;	
		User u = queryFactory.selectFrom(user)
					.where(user.username.eq(userName)
									.and(user.userpass.eq(userPassword)))
					.fetchOne();
		
		return u;
	}
}
