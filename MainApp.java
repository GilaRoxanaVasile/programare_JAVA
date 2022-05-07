package ex_doi_doi;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MainApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader;
		reader = new BufferedReader(new FileReader("in.txt"));
		String line = reader.readLine();
		Produs[] produse;
		produse = new Produs[20];
		String[] pr;
		int nr_prod = 0;
		float minim = 0, maxim = 0;
		int indice_min = 0, indice_max = 0;
		float aux_pret = 0;
		if (line != null) {
			pr = line.split(";");
			produse[nr_prod] = new Produs(pr[0], Float.parseFloat(pr[1]), Integer.parseInt(pr[2]));
			aux_pret = Float.parseFloat(pr[1]);
			minim = aux_pret;
			maxim = aux_pret;
			line = reader.readLine();
			nr_prod++;
		}
		while (line != null) {
			pr = line.split(";");
			produse[nr_prod] = new Produs(pr[0], Float.parseFloat(pr[1]), Integer.parseInt(pr[2]));
			aux_pret = Float.parseFloat(pr[1]);
			if (aux_pret < minim) {
				indice_min = nr_prod;
				minim = aux_pret;
			}
			if (aux_pret > maxim) {
				indice_max = nr_prod;
				maxim = aux_pret;
			}
			nr_prod++;
			line = reader.readLine();
		}
		reader.close();

		PrintStream afisare = new PrintStream("out.txt");
		afisare.println("Produsul cu pret minim este: " + produse[indice_min]);
		afisare.println("Produsul cu pret maxim este: " + produse[indice_max]);
		afisare.close();

		System.out.println("Nume " + "pret " + "cantitate");
		for (int i = 0; i < nr_prod; i++)
			System.out.println(produse[i]);

		BufferedReader citireT = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dati cantitatea maxima dorita: ");
		int cantitate = 0, exista = 0;
		cantitate = Integer.parseInt(citireT.readLine());
		System.out.println("Produsele pentru care cantitatea este mai mica decat valoarea data sunt: ");
		for (int i = 0; i < nr_prod; i++)
			if (produse[i].getC() < cantitate) {
				System.out.println(produse[i]);
				exista = 1;
			}
		if (exista == 0)
			System.out.println("Nu exista astfel de produse!");
	}

}
