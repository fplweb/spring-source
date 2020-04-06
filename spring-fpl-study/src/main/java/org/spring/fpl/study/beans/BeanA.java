package org.spring.fpl.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

	@Autowired
	private BeanB beanb;

	public BeanA(){
		System.out.println("beanA init....");
	}
}
