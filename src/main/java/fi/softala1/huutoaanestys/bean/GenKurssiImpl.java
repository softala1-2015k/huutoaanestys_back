package fi.softala1.huutoaanestys.bean;

public class GenKurssiImpl implements GenKurssi, GenKurssi {
	private String tunnus;
	private String nimi;
	private int koulutusohjelma_ID;
	private int laajuus;
	private int ajoitus;
	private String kuvaus;
	private String periodiNimi;
	private String alkupvm;
	private String loppupvm;
	
	public GenKurssiImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenKurssiImpl(String tunnus, String nimi, int koulutusohjelma_ID,
			int laajuus, int ajoitus, String kuvaus, String periodiNimi,
			String alkupvm, String loppupvm) {
		super();
		this.tunnus = tunnus;
		this.nimi = nimi;
		this.koulutusohjelma_ID = koulutusohjelma_ID;
		this.laajuus = laajuus;
		this.ajoitus = ajoitus;
		this.kuvaus = kuvaus;
		this.periodiNimi = periodiNimi;
		this.alkupvm = alkupvm;
		this.loppupvm = loppupvm;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#getTunnus()
	 */
	public String getTunnus() {
		return tunnus;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#setTunnus(java.lang.String)
	 */
	public void setTunnus(String tunnus) {
		this.tunnus = tunnus;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#getNimi()
	 */
	public String getNimi() {
		return nimi;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#setNimi(java.lang.String)
	 */
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#getKoulutusohjelma_ID()
	 */
	public int getKoulutusohjelma_ID() {
		return koulutusohjelma_ID;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#setKoulutusohjelma_ID(int)
	 */
	public void setKoulutusohjelma_ID(int koulutusohjelma_ID) {
		this.koulutusohjelma_ID = koulutusohjelma_ID;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#getLaajuus()
	 */
	public int getLaajuus() {
		return laajuus;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#setLaajuus(int)
	 */
	public void setLaajuus(int laajuus) {
		this.laajuus = laajuus;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#getAjoitus()
	 */
	public int getAjoitus() {
		return ajoitus;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#setAjoitus(int)
	 */
	public void setAjoitus(int ajoitus) {
		this.ajoitus = ajoitus;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#getKuvaus()
	 */
	public String getKuvaus() {
		return kuvaus;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#setKuvaus(java.lang.String)
	 */
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#getPeriodiNimi()
	 */
	public String getPeriodiNimi() {
		return periodiNimi;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#setPeriodiNimi(java.lang.String)
	 */
	public void setPeriodiNimi(String periodiNimi) {
		this.periodiNimi = periodiNimi;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#getAlkupvm()
	 */
	public String getAlkupvm() {
		return alkupvm;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#setAlkupvm(java.lang.String)
	 */
	public void setAlkupvm(String alkupvm) {
		this.alkupvm = alkupvm;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#getLoppupvm()
	 */
	public String getLoppupvm() {
		return loppupvm;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#setLoppupvm(java.lang.String)
	 */
	public void setLoppupvm(String loppupvm) {
		this.loppupvm = loppupvm;
	}

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.bean.GenKurssi#toString()
	 */
	@Override
	public String toString() {
		return "GenKurssiImpl [tunnus=" + tunnus + ", nimi=" + nimi
				+ ", koulutusohjelma_ID=" + koulutusohjelma_ID + ", laajuus="
				+ laajuus + ", ajoitus=" + ajoitus + ", kuvaus=" + kuvaus
				+ ", periodiNimi=" + periodiNimi + ", alkupvm=" + alkupvm
				+ ", loppupvm=" + loppupvm + "]";
	}
}
