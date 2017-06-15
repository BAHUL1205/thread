/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
/**
 *
 * @author bahul
 */
public class producerconsumer implements Runnable{
cs c1;
    public producerconsumer(cs c1) {
        this.c1=c1;
    }
    @Override
    public void run() {
     if(Thread.currentThread().getName().equals("produce"))
     {
     c1.produce();
     c1.produce();
     }
     else if(Thread.currentThread().getName().equals("consume"))
     {
         
         c1.consume();
         c1.consume();
     }
    }
    public static void main(String args[]){
        cs c1 = new cs();
        producerconsumer p1 = new producerconsumer(c1);
        Thread t1 = new Thread(p1,"produce");
        Thread t2 = new Thread(p1,"consume");
         t1.start();
         t2.start();
        }
    }
