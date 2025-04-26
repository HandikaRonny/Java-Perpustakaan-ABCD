/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.abcd;

import java.util.Scanner;

public class Feedback implements Notifications{
    public String Feedback;

    public void setFeedback() {
        Scanner input = new Scanner(System.in);
        this.Feedback = input.nextLine();
    }

    public String getFeedback() {
        return this.Feedback;
    }

    public void display(){
        System.out.println(getFeedback());
    }

}