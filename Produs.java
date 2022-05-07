package ex_doi_doi;

public class Produs {

	private String nume;
	private float pret;
	private int cantitate;

	public Produs(String nume, float pret, int cantitate) {
		this.nume = nume;
		this.pret = pret;
		this.cantitate = cantitate;
	}

	public Produs(Produs p) {
		this.nume = p.nume;
		this.pret = p.pret;
		this.cantitate = p.cantitate;
	}

	public String getN() {
		return this.nume;
	}

	public float getP() {
		return this.pret;
	}

	public int getC() {
		return this.cantitate;
	}

	public String toString() {
		return this.nume + " " + this.pret + " " + this.cantitate;
	}

}
