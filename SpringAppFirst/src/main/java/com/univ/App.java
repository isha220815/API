package com.univ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.univ.bean.Employee;
import com.univ.bean.Student;
import com.univ.config.StudentConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext apx=new AnnotationConfigApplicationContext(StudentConfig.class);
    	Student s1=	(Student)apx.getBean("getData");
    	Employee e1=(Employee)apx.getBean("fetch");
    	System.out.println(s1);
    	System.out.println(e1);
    	
    	
    }
}
