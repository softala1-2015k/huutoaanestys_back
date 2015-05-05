package fi.softala1.huutoaanestys.bean;

public interface Opiskelija {

	//SETTERS
	public abstract void setOpiskelijanro(String opiskelijanro);

	public abstract void setEtunimi(String etunimi);

	public abstract void setSukunimi(String sukunimi);

	public abstract void setOsoite(String osoite);

	public abstract void setPostinro(String postinro);

	public abstract void setPuhelinnumero(String puhelinnumero);

	public abstract void setSposti(String sposti);

	//GETTERS
	public abstract String getOpiskelijanro();

	public abstract String getEtunimi();

	public abstract String getSukunimi();

	public abstract String getOsoite();

	public abstract String getPostinro();

	public abstract String getPuhelinnumero();

	public abstract String getSposti();

}