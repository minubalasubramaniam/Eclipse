package com.firstspring;  

import org.springframework.beans.factory.BeanFactory;  

import org.springframework.beans.factory.xml.XmlBeanFactory;  

import org.springframework.core.io.*;  

public class Main {  

    public static void main(String[] args) {  

        Resource r=new ClassPathResource("bean.xml");  

        BeanFactory factory=new XmlBeanFactory(r);  

        Book b=(Book)factory.getBean("book");  

        b.display();  

    }  

}