package paczka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Macierz {
	private int wys = 0;
	private int szer = 0;
	private int[][] macierz = null;

	/**
	 * @param wys
	 * @param szer
	 */
	public Macierz(int wys, int szer) {
		super();
		this.wys = wys;
		this.szer = szer;
		macierz = new int[wys][szer];
	}

	public void wypelnij() {
		Random r = new Random();
		for (int i = 0; i < wys; i++) {
			for (int j = 0; j < szer; j++) {
				macierz[i][j] = r.nextInt();
			}
		}
	}

	public void wypelnijRecznie() {
		BufferedReader klawa = new BufferedReader(new InputStreamReader(
				System.in));
		for (int i = 0; i < wys; i++) {
			for (int j = 0; j < szer; j++) {
				try {
					System.out.println("Podaj następną liczbę:");
					macierz[i][j] = Integer.parseInt((klawa.readLine()));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void drukuj() {
		for (int i = 0; i < wys; i++) {
			for (int j = 0; j < szer; j++) {
				System.out.println(macierz[i][j]);
			}
			System.out.println("\n");
		}
	}

	public void gausuj() {
		int k = 0, m = 0, j = 0, i = 0;
		for (i = 0; i < szer; i++) {
			k = 1;
			while (i + k < szer) {
				if (macierz[i][i] != 0) {
					m = (-1) * macierz[i + k][i] / macierz[i][i];
				}
				for (j = 0; j < szer; j++) {
					
				}
			}
		}

	}
}
