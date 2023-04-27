/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfifthproject;
import java.util.Scanner;
public class CubeMethod {
    static int cubeOfNum(int num){
        return num * num *num;
    }
    public static void main(String[] args) {
        int cube;
        int a;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Number here: ");
        if(Input.hasNextInt()){
            a = Input.nextInt();
        }else{
            System.out.println("Invalid Number !!");
            return;
        }
        cube = cubeOfNum(a);
        System.out.println(a + " Cube value is: " + cube+ " .");
    }
}
