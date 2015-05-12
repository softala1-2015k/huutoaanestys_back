package fi.softala1.huutoaanestys.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.softala1.huutoaanestys.bean.GenKurssi;
import fi.softala1.huutoaanestys.bean.GenKurssiImpl;

public class GenKurssiRowMapper implements RowMapper<GenKurssi>{

public GenKurssi mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		GenKurssi g = new GenKurssiImpl();
		g.setTunnus(rs.getString("tunnus"));
		g.setNimi(rs.getString("nimi"));
		g.setKoulutusohjelma_ID(rs.getInt("koulutusohjelma_ID"));
		g.setLaajuus(rs.getInt("laajuus"));
		g.setAjoitus(rs.getInt("ajoitus"));
		g.setKuvaus(rs.getString("kuvaus"));
		g.setPeriodiNimi("periodi");
		g.setAlkupvm("alkupvm");
		g.setLoppupvm("loppupvm");
		
		return g;
	}
}
