package untilities;

import java.io.IOException;

/*
 * @author Muhammad Faturrahman
 * @version 1.0
 * @since 28 May 2018 
 */

public class Tools
{
	public void clear() 
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
	
	public void hold() 
	{
		try	{
			System.out.println("\nTekan ENTER untuk melanjutkan...");
			System.in.read();
		} catch (IOException ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public void errorMsg()
    {
        this.clear();
        System.out.println("Maaf Input Yang Anda Masukkan Salah!!!");
        this.hold();
    }
}
