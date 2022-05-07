package ex_unu;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class MainApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader;
		reader = new BufferedReader(new FileReader("cantec_in.txt"));
		String vers = reader.readLine();
		Vers[] cantec;
		cantec = new Vers[14];
		int n = 0;
		while (vers != null) {
			cantec[n] = new Vers(vers);
			n++;
			vers = reader.readLine();
		}
		reader.close();
		PrintStream afisare = new PrintStream("cantec_out.txt");
		for (int i = 0; i < n; i++) {
			double nr_random = cantec[i].majuscule_random();
			if (nr_random < 0.1)
				afisare.print(cantec[i].getVers().toUpperCase());
			else
				afisare.print(cantec[i].getVers());
			if (cantec[i].sfarsit() == true)
				afisare.print(" * ");
			else
				afisare.print(" ");
			afisare.println(cantec[i].nr_cuv() + " " + cantec[i].nr_vocale() + "          " + nr_random);
		}
		afisare.close();
	}

}
