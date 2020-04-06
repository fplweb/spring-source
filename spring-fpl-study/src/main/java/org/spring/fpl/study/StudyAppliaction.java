package org.spring.fpl.study;

import org.spring.fpl.study.beans.BeanA;
import org.spring.fpl.study.beans.BeanScanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 源码学习过程
 */
public class StudyAppliaction {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(BeanScanner.class);
		applicationContext.refresh();
		System.out.println(applicationContext.getBean(BeanA.class));
	}
}
