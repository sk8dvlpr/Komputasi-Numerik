package util;

import java.io.IOException;

public class Utilities
{
	public void getClearConsole() 
	{
		try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
	}
	
	public void getHoldConsole() 
	{
		try	{
			System.out.println("\nTekan ENTER untuk melanjutkan...");
			System.in.read();
		} catch (IOException ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public void getErrorMessage()
    {
        this.getClearConsole();
        System.out.println("\nMaaf Input Yang Anda Masukkan Salah!!!");
        this.getHoldConsole();
    }
}
