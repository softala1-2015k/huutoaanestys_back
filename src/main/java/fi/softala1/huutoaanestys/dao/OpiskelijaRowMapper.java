package fi.softala1.huutoaanestys.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.softala1.huutoaanestys.bean.Opiskelija;
import fi.softala1.huutoaanestys.bean.OpiskelijaImpl;

public class OpiskelijaRowMapper implements RowMapper<Opiskelija> {
	
	public Opiskelija mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Opiskelija o = new OpiskelijaImpl();
		o.setOpiskelijanro(rs.getString("opiskelijanro"));
		o.setEtunimi(rs.getString("etunimet"));
		o.setSukunimi(rs.getString("sukunimi"));
		o.setOsoite(rs.getString("osoite"));
		o.setPostinro(rs.getString("postinro"));
		o.setPuhelinnumero(rs.getString("puhnro"));
		o.setSposti(rs.getString("sahkoposti"));
		
		return o; 
		
	}

}
