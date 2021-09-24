package com.epsilon.Ecommerece;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.epsilon.Ecommerce.;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/Ecommerece/config.xml");
    	
    	OrderItems ord = (OrderItems) ctx.getBean("order-items1");
        System.out.println(ord);
        
//        Book bk = (Book) ctx.getBean("book1");
//        System.out.println(bk);
//        
//        Book bk2 = (Book) ctx.getBean("book2");
//        System.out.println(bk2);
        
       
    }
}
