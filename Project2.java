/*
 * Project 2: Calculates the average of heights of 25 binary trees
 *            and prints out the data of ratio of average height to log2n
 *            The numbers are added by Math.random() class
 */
package project2;
import java.util.*;

/**
 *
 * @author Rico H Adrian
 * Wednesday, 25 January 2017
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //run the project
        new Project2().run();// TODO code application logic here
    }

    public static void run() {
        System.out.println(
                "Average the heights of 20 random trees");
        //loop statement that prints out the data 5 times
        for (int h = 0; h < 5; h++) {
            //initialize variable n, the total of records added
            int n = 1000;
            //just a print statements that tells about the details
            System.out.println();
            System.out.println("  n   |    ratio of average height to log2n");
            //loop statement that calculate the ratio 5 times with different 
            //number of n(1000,2000,4000, and so on)
            for (int k = 0; k < 5; k++) {
                //initialize variable sum and numOfTrials 
                double sum = 0.0;
                int numOfTrials = 20;
                //a loop statement that create 20 random trees
                for (int i = 0; i < 20; i++) {
                    BinarySearchTree myTree = new BinarySearchTree();
                    //a loop statement that add random numbers to the tree
                    //the total of random numbers depends on what n is
                    for (int j = 0; j < n; j++) {
                        myTree.add(Math.random());
                    }
                    //add the height of the tree to the sum n times
                    sum = sum + myTree.height();
                }
                //calculation of average of the height of the tree
                double average = sum / 20;
                double log = Math.log(n) / Math.log(2);
                //calculate the ratio by dividing average by log2n
                double ratio = average / log;
                //printing out the ratio of each average height 5 times
                System.out.println(n + " | " + ratio);
                //multiplying n by 2 5 times until it reaches 16000
                n = n * 2;
            }
        }
        //System.out.println (HEIGHT_MESSAGE + myTree.height()); 
    }

}
