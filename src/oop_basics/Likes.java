
package oop_basics;


public class Likes {
    String read;
    String sing;
    String sleep;
    
    Likes(String read, String sing, String sleep){
        this.read= read;
        this.sing= sing;
        this.sleep= sleep;
    }
    
    void showRead(){
        System.out.println("I like reading:" + read);
    }
    
    void showSing(){
        System.out.println("I like singing" + sing);
    }
    
    void showSleep(){
        System.out.println("I love to sleep" + sleep);
    }
    
}
