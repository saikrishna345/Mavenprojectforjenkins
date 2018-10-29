package com.biarca.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("cnfg/applicationContext.xml");
		Employee emp = ac.getBean(Employee.class);
		System.out.println(emp);

	}
}
