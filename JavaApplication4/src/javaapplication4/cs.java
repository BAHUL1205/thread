package javaapplication4;

import java.util.LinkedList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bahul
 */
import java.util.*;
public class cs {
    int p =0;
    int c=-1;

public synchronized void produce()
{
    try{
        if(p==c){
    System.out.println("produce" + p);
        c++;
        
        notify();
       
        }
        else{
           wait();
           }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
   
}

public synchronized void consume()
{
    try 
    {
       
        if(c==p){
    System.out.println("consume" + c);
     p++;
        notify();
        }
        else{
            c++;
       notify();  
        }   
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
   
}

}
