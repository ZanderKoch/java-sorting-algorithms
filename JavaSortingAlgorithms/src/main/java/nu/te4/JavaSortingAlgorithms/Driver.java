/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.JavaSortingAlgorithms;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * This class calls upon the list generator and runs the diffrent sorting
 * classes on copies of these generated lists
 * @author Zander Koch
 */
public class Driver {
    public static void main(){
        System.out.println("sorting randomized lists of lengths:\n\r");
        
        System.out.println("generating 10 long array of random ints");
        ArrayList<Integer> randomizedlist10 = generateRandomList(10);
        Bubble.sort(randomizedlist10);
        Insertion.sort(randomizedlist10);
        Shell.sort(randomizedlist10);
        Merge.sort(randomizedlist10);
        Quick.sort(randomizedlist10);
        
        System.out.println("generating 100 long array of random ints");
        ArrayList<Integer> randomizedlist100 = generateRandomList(100);
        Bubble.sort(randomizedlist100);
        Insertion.sort(randomizedlist100);
        Shell.sort(randomizedlist100);
        Merge.sort(randomizedlist100);
        Quick.sort(randomizedlist100);
        
        System.out.println("generating 1.000 long array of random ints");
        ArrayList<Integer> randomizedlist1000 = generateRandomList(1000);
        Bubble.sort(randomizedlist1000);
        Insertion.sort(randomizedlist1000);
        Shell.sort(randomizedlist1000);
        Merge.sort(randomizedlist1000);
        Quick.sort(randomizedlist1000);
        
        System.out.println("generating 10.000 long array of random ints");
        ArrayList<Integer> randomizedlist10000 = generateRandomList(10000);
        Bubble.sort(randomizedlist10000);
        Insertion.sort(randomizedlist10000);
        Shell.sort(randomizedlist10000);
        Merge.sort(randomizedlist10000);
        Quick.sort(randomizedlist10000);
        
        System.out.println("generating 100.000 long array of random ints");
        ArrayList<Integer> randomizedlist100000 = generateRandomList(100000);
        Bubble.sort(randomizedlist100000);
        Insertion.sort(randomizedlist100000);
        Shell.sort(randomizedlist100000);
        Merge.sort(randomizedlist100000);
        Quick.sort(randomizedlist100000);
        
        System.out.println("generating 1.000.000 long array of random ints");
        ArrayList<Integer> randomizedlist1000000 = generateRandomList(1000000);
        Bubble.sort(randomizedlist1000000);
        Insertion.sort(randomizedlist1000000);
        Shell.sort(randomizedlist1000000);
        Merge.sort(randomizedlist1000000);
        Quick.sort(randomizedlist1000000);
        
        System.out.println("generating 10.000.000 long array of random ints");
        ArrayList<Integer> randomizedlist10000000 = generateRandomList(10000000);
        Bubble.sort(randomizedlist10000000);
        Insertion.sort(randomizedlist10000000);
        Shell.sort(randomizedlist10000000);
        Merge.sort(randomizedlist10000000);
        Quick.sort(randomizedlist10000000);
    }
    
    public static ArrayList<Integer> generateRandomList(int length){
        Random random = new Random();
        ArrayList<Integer> result = new ArrayList<>(length);
        
        for(int element : result){
            element = random.nextInt(9999999);
        }
        
        return result;
    }
    
    public static class Bubble{
        public static void sort(ArrayList<Integer> list){
            System.out.println("bubblesorting " 
                    + Integer.toString(list.size())
                    + " items");
            ArrayList<Integer> sortingList = (ArrayList<Integer>)list.clone();
            
            long startTime = System.currentTimeMillis();
            //each time outer loop finishes the largest number will have been
            //mooved to array's size - i:th position by the inner loop
            for(int i = 0; i < sortingList.size()-1; i++ ){
                //loops through 
                for(int j; j < sortingList.size() - i - 1; j++){
                    if(sortingList.get(j) > sortingList.get(j+1)){
                        int temp = sortingList.get(j);
                        sortingList.set(j, sortingList.get(j+1));
                        sortingList.set(j+1, temp);
                    }
                }
            }
             
            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println("milliseconds elapsed:"
                    + String.valueOf(elapsedTime));
        }
    }
}
