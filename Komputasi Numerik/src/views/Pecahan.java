package views;

import java.util.Scanner;

import controller.Controller;
import util.Utilities;

public class Pecahan
{
	public void penjumlahanPecahan()
	{
		help.getClearConsole();
		System.out.println("===================================================");
        System.out.println("=                   Project UAS                   =");
        System.out.println("=            Aplikasi Komputasi Numerik           =");
        System.out.println("=               STMIK Banisaleh 2018              =");
        System.out.println("===================================================");
        System.out.println("=           Penjumlahan Bilangan Pecahan          =");
        System.out.println("===================================================");
        
        while (true) {
            try {
                System.out.print("= Masukkan Sebuah Bilangan Pecahan : ");
                double value = input.nextDouble();
                System.out.print("= Masukkan Jumlah Penjumlahan      : ");
                int looping = input.nextInt();
                
                System.out.println("===================================================");
                System.out.println("=                      HASIL                      =");
                System.out.println("===================================================");
                proses.fraction.penjumlahanPecahan(value, looping);
                help.getHoldConsole();
                tampilan.menu.utama();
            } catch (java.util.InputMismatchException ex) {
                System.out.println("\nMaaf input anda salah, mohon masukkan ulang!!!");
                input.nextLine();
            }
        }
	}
	
	public Utilities help = new Utilities();
	public Scanner input = new Scanner(System.in);
	public static Views tampilan = new Views();
	public static Controller proses = new Controller();
}
