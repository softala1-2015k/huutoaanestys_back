package fi.softala1.huutoaanestys.bean;

public interface GenKurssi {

	public abstract String getTunnus();

	public abstract void setTunnus(String tunnus);

	public abstract String getNimi();

	public abstract void setNimi(String nimi);

	public abstract int getKoulutusohjelma_ID();

	public abstract void setKoulutusohjelma_ID(int koulutusohjelma_ID);

	public abstract int getLaajuus();

	public abstract void setLaajuus(int laajuus);

	public abstract int getAjoitus();

	public abstract void setAjoitus(int ajoitus);

	public abstract String getKuvaus();

	public abstract void setKuvaus(String kuvaus);

	public abstract String getPeriodiNimi();

	public abstract void setPeriodiNimi(String periodiNimi);

	public abstract String getAlkupvm();

	public abstract void setAlkupvm(String alkupvm);

	public abstract String getLoppupvm();

	public abstract void setLoppupvm(String loppupvm);

	public abstract String toString();

}