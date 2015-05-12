package fi.softala1.huutoaanestys.dao;

import java.util.List;

import javax.inject.Inject;

import java.util.List;

import fi.softala1.huutoaanestys.bean.GenKurssi;

public interface GenKurssiDAO {

	public abstract List<GenKurssi> haeGenKurssit();

}