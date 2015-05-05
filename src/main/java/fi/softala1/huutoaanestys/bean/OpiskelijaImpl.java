package fi.softala1.huutoaanestys.bean;

public class OpiskelijaImpl implements Opiskelija {

	private String opiskelijanro;
	private String etunimi;
	private String sukunimi;
	private String osoite;
	private String postinro;
	private String puhelinnumero;
	private String sposti;
	
	
	//SETTERS
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#setOpiskelijanro(java.lang.String)
	 */
	public void setOpiskelijanro(String opiskelijanro) {
		this.opiskelijanro = opiskelijanro;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#setEtunimi(java.lang.String)
	 */
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#setSukunimi(java.lang.String)
	 */
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#setOsoite(java.lang.String)
	 */
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#setPostinro(java.lang.String)
	 */
	public void setPostinro(String postinro) {
		this.postinro = postinro;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#setPuhelinnumero(java.lang.String)
	 */
	public void setPuhelinnumero(String puhelinnumero) {
		this.puhelinnumero = puhelinnumero;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#setSposti(java.lang.String)
	 */
	public void setSposti(String sposti) {
		this.sposti = sposti;
	}
	
	//GETTERS
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#getOpiskelijanro()
	 */
	public String getOpiskelijanro() {
		return opiskelijanro;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#getEtunimi()
	 */
	public String getEtunimi() {
		return etunimi;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#getSukunimi()
	 */
	public String getSukunimi() {
		return sukunimi;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#getOsoite()
	 */
	public String getOsoite() {
		return osoite;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#getPostinro()
	 */
	public String getPostinro() {
		return postinro;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#getPuhelinnumero()
	 */
	public String getPuhelinnumero() {
		return puhelinnumero;
	}
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.Opiskelija#getSposti()
	 */
	public String getSposti() {
		return sposti;
	}
	
	
	public OpiskelijaImpl(String opiskelijanro, String etunimi,
			String sukunimi, String osoite, String postinro,
			String puhelinnumero, String sposti) {
		
		this.opiskelijanro = opiskelijanro;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.osoite = osoite;
		this.postinro = postinro;
		this.puhelinnumero = puhelinnumero;
		this.sposti = sposti;
	}
	
	public OpiskelijaImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OpiskelijaImpl [opiskelijanro=" + opiskelijanro + ", etunimi="
				+ etunimi + ", sukunimi=" + sukunimi + ", osoite=" + osoite
				+ ", postinro=" + postinro + ", puhelinnumero=" + puhelinnumero
				+ ", sposti=" + sposti + "]";
	}
	
	
	
	
	
}
