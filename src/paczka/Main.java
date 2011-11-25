package paczka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		int[] warunki = new int[3];
		BufferedReader klawa = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Podaj wysokość macierzy:");
		warunki[0] = Integer.parseInt((klawa.readLine()));
		System.out.println("Podaj szerokoś macierzy: ");
		warunki[1] = Integer.parseInt((klawa.readLine()));
		System.out
				.println("Wybierz sposób wypełniania macierzy:\n 1 - losowo \n 2 - ręcznie");
		warunki[2] = Integer.parseInt((klawa.readLine()));
		// System.out.println(warunki[0] + " " + warunki[1] + " " + warunki[2]);
		Macierz macierz = new Macierz(warunki[0], warunki[1]);
		if(warunki[2]== 1){
			macierz.wypelnij();
		}else{
			macierz.wypelnijRecznie();
		}
		macierz.drukuj();

	}

}
