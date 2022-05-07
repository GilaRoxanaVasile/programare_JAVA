package ex_unu;

import java.util.Random;

public class Vers {
	private String vers;

	public Vers(String vers) {
		this.vers = vers;
	}

	public String getVers() {
		return this.vers;
	}

	public int nr_cuv() {
		String[] cuvinte;
		cuvinte = this.vers.split(" ");
		return cuvinte.length;
	}

	public int nr_vocale() {
		String vocale = "aeiouAEIOU";
		int nr_voc = 0, i = 0;
		for (i = 0; i < this.vers.length(); i++)
			if (vocale.indexOf(this.vers.charAt(i)) >= 0)
				nr_voc++;
		return nr_voc;
	}

	public boolean sfarsit() {
		return this.vers.endsWith("le");
	}

	public double majuscule_random() {
		Random rand = new Random();
		double nr = rand.nextDouble();
		return nr;
	}
}
