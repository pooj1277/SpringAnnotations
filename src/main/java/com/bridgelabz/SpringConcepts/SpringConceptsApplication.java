package com.bridgelabz.SpringConcepts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelabz.SpringConcepts.component.DemoBean;
import com.bridgelabz.SpringConcepts.component.EmployeeBean;

@SpringBootApplication
public class SpringConceptsApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context =  SpringApplication.run(SpringConceptsApplication.class, args);
		logger.debug("Checking context: {}", context.getBean(DemoBean.class));
		logger.debug("\n *** Example Using @Autowire annotation on property***");
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean);
		logger.debug("Demo Bean : "+context.getBean(DemoBean.class));
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		employee.setEid(104);
		employee.setEname("Pooja");
		//employee.setDeptBean("Computers");
		employee.showEmployeeDetails();
		
	}

}