/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asd;

/**
 *
 * @author ricohelvidadrian
 */
public class Hash14E1Contains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Hash14E1Contains().run(); //run the method run()
    }

    public void run() {
        HashLib hashLib = new HashLib(); //create an object HashLib
        hashLib.add("CS302"); //adding element using add() method
        hashLib.add("asd");   //adding another element using add() method
        hashLib.add(1234);    //adding third element using add() method
        //prints the return for contains for elements.
        //some elements are not in hashLib and some are
        System.out.println(hashLib.contains("CS302"));
        System.out.println(hashLib.contains("cs302"));
        System.out.println(hashLib.contains("asd"));
        System.out.println(hashLib.contains(1234));
        System.out.println(hashLib.contains(1200));
    }

}
