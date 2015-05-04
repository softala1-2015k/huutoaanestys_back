package fi.softala1.huutoaanestys.bean;

public interface Kurssi {

	public abstract String getTunnus();

	public abstract String getNimi();

	public abstract String getKoulutusohjelma();

	public abstract int getLaajuus();

	public abstract int getAjoitus();

	public abstract String getKuvaus();

	public abstract void setTunnus(String tunnus);

	public abstract void setNimi(String nimi);

	public abstract void setKoulutusohjelma(String koulutusohjelma);

	public abstract void setLaajuus(int laajuus);

	public abstract void setAjoitus(int ajoitus);

	public abstract void setKuvaus(String kuvaus);

}