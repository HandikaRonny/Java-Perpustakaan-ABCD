/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.abcd;


import java.util.Scanner;

public class Pengumuman implements Notifications{
    public String Pengumuman;

    public void setPengumuman() {
        Scanner input = new Scanner(System.in);
        this.Pengumuman = input.nextLine();
    }

    public String getPengumuman() {
        return this.Pengumuman;
    }

    public void display(){
        System.out.println("======== PENGUMUMAN ========");
        System.out.println("\nFrom : Pengurus Perpustakaan");
        System.out.println("To : Member Perpustakaan\n");
        System.out.println(getPengumuman());
        System.out.println("\n===== Akhir PENGUMUMAN =====");
    }
}