package fi.softala1.huutoaanestys.dao;

import java.util.List;

import fi.softala1.huutoaanestys.bean.Opiskelija;

public interface OpiskelijaDAO {

	public abstract Opiskelija etsiOpiskelija(String opiskelijanro);

	public abstract List<Opiskelija> haeOpiskelijat();

}