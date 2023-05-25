package org.curso.automacao.modulos.erp.productservice.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Component
public class ProductQueryBuilder {

	@PersistenceContext
	private EntityManager em;
	
	public Product findProductBy(String name) {
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);
		
		QProduct product = QProduct.product;	
		Product c = queryFactory.selectFrom(product)
					.where(product.name.eq(name))								
					.fetchFirst();
		
		return c;
	}
}
