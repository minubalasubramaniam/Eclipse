package com.firstspring;  

public class Book {  

    private int id;  

    private String bookName;  

    public Book() 
    {
    	System.out.println("Java");
    }  

    public Book(int id) 
    {
    	this.id = id;
    }  

    public Book(String bookName) 
    {  
    	this.bookName = bookName;
    }  

    public Book(int id, String bookName) {  

        this.id = id;  

        this.bookName = bookName;  
        
        System.out.println(bookName+id);

    }  

    void display(){  

        System.out.println(id+" "+bookName);  

    }  

}