package com.company;

public class JavaBook {

    public static void main(String[] args) {
	// write your code here
        Book book=new Book();
        Book book1=new Book();
        Book book2 = new Book();

        book.setName("Black Widows");
        book.setGenre("Fiction");
        book.setPrice(2.5);
        book1.setName("Oliver Twist");
        book1.setGenre("Fiction");
        book1.setPrice(5.5);
        book2.setName("Science Magazine");
        book2.setGenre("Science");
        book2.setPrice(1.5);

        Book book3=new Book("Russian Dictionary","Linguistics", 10);
        System.out.println("We have "+book.getName() +", it's " +book.getGenre()+
                " and priced at "+ book.getPrice());
        System.out.println("We have "+book1.getName() +", it's " +book1.getGenre()+
                " and priced at "+ book1.getPrice());
        System.out.println("We have "+book2.getName() +", it's " +book2.getGenre()+
                " and priced at "+ book2.getPrice());
        System.out.println("We have "+book3.getName() +", it's " +book3.getGenre()+
                " and priced at "+ book3.getPrice());
    }
}
