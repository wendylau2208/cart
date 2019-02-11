/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cart;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author wendy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FivaService service = new FivaServiceImpl();
        Scanner scanner = new Scanner(System.in);
        List<String> outputString = new ArrayList<>();
        try {
            while (true) {
                outputString.clear();
                String line = scanner.nextLine();
                if(line.equals("exit")){
                    break;
                }
                /*
                for(String message : service.process(Integer.parseInt(line))){
                    System.out.println(message);
                }
                */
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            // System.in has been closed
            System.out.println("System.in was closed; exiting");
        }
    }
    
}
