/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class TP1 {

    public static void main(String[] args) {
        System.out.println("Bonjour , mon premier tp en POO");
        System.out.println("quelle est votre nom?");
        Scanner read=new Scanner(System.in);
        String name=read.next();
        System.out.println();
        System.out.println("Bonjour "+name);
        System.out.println("quel est votre age " +name +"?");
        read=new Scanner(System.in);
        int a=read.nextInt();
        System.out.println(name+" votre age est "+a);
    }
    public static double[] calculateProbability(int [][]image){
        int l=image[0].length;//donner le nombre de lignes dans la matrice image;
        int c=image.length;// donner le nombre de colonnes dans la matrice image;
        int s=0;
        double [] p=new double[255];
        for(int k=0;k<=255;k++){
            for(int i=0;i<l;i++){
               for(int j=0;j<c;j++){
                   if(k==image[i][j]){
                   s+=1;
                   }
            
        }
        }
           p[k]=s/(l*c);}
        return p;
        }
    public static double caculateEntropy(int [][] image){
       int h=0;
       double [] p=calculateProbability(image);
       for(int i=0;i<=255;i++){
           h+=p[i]*Math.log(p[i]);
       }
       return (-h);
    
    }



}
