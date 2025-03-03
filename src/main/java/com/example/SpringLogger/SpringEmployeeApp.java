package com.example.SpringLogger;

import com.example.SpringLogger.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringEmployeeApp {
    private static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);

        EmployeeBean employee = context.getBean(EmployeeBean.class);
        logger.info("Employee Details: {}", employee);
    }
}
