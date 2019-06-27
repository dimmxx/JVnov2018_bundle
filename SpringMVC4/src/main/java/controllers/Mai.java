package controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mai {

    public static void main(String[] args) {


         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcfg-servlet.xml");
        DbWorker dbWorker = (DbWorker) context.getBean("dbWorker");


        System.out.println(dbWorker);



    }


}
