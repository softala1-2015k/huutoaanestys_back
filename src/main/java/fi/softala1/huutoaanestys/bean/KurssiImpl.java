package fi.softala1.huutoaanestys.bean;

/**
 * 
 * Kurssi-luokka säilöö järjestelmästä kaivettavan kurssin tiedot itseensä.
 * 
 * @param  tunnus              Kurssitunnus (esim. ICT1TN001).
 * @param  nimi                Kurssin nimi (Työasemat ja tietoverkot).
 * @param  koulutusohjelma     Viittaus koulutusohjelmaan, johon kurssi kuuluu.
 * @param  laajuus             Opintopistemäärä, jonka kurssista nettoaa.
 * @param  ajoitus             Lukukausi, jona kurssi on suositeltavaa käydä.
 * @param  kuvaus              Kurssikuvaus (olisi suositeltavaa refaktoroida).
 * 
 * @author Atte Valtonen
 *
 */
public class KurssiImpl implements Kurssi {
	
	private String tunnus;
	private String nimi;
	private String koulutusohjelma;
	private int laajuus;
	private int ajoitus;
	private String kuvaus;
	
	public KurssiImpl(String tunnus, String nimi, String koulutusohjelma,
			int laajuus, int ajoitus, String kuvaus) {
		this.tunnus = tunnus;
		this.nimi = nimi;
		this.koulutusohjelma = koulutusohjelma;
		this.laajuus = laajuus;
		this.ajoitus = ajoitus;
		this.kuvaus = kuvaus;
	}
	
	public KurssiImpl() {
		this.tunnus = "";
		this.nimi = "";
		this.koulutusohjelma = "";
		this.laajuus = 0;
		this.ajoitus = 0;
		this.kuvaus = "";
	}

	public String getTunnus() {
		return tunnus;
	}

	public String getNimi() {
		return nimi;
	}

	public String getKoulutusohjelma() {
		return koulutusohjelma;
	}

	public int getLaajuus() {
		return laajuus;
	}

	public int getAjoitus() {
		return ajoitus;
	}

	public String getKuvaus() {
		return kuvaus;
	}


	public void setTunnus(String tunnus) {
		this.tunnus = tunnus;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void setKoulutusohjelma(String koulutusohjelma) {
		this.koulutusohjelma = koulutusohjelma;
	}

	public void setLaajuus(int laajuus) {
		this.laajuus = laajuus;
	}

	public void setAjoitus(int ajoitus) {
		this.ajoitus = ajoitus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	
	@Override
	public String toString() {
		return "KURSSI: " + tunnus + " - " + nimi + " - " + laajuus + " OP";
	}

}
