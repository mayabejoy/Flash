package com.capgemini.in.SpringInjectionUsingCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("applicationcontext.xml");
    	Person em = context.getBean("pr", Person.class);
    	em.showCharacterstics();
}
}
