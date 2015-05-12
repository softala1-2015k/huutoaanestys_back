package fi.softala1.huutoaanestys.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.softala1.huutoaanestys.bean.GenKurssi;
import fi.softala1.huutoaanestys.exception.TietoRiviaEiLoydyPoikkeus;

@Repository
public class GenKurssiDAOImpl implements GenKurssiDAO {
	
	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<GenKurssi> haeGenKurssit() {

		String sql = "SELECT * from kurssi, toteutus WHERE kurssi.tunnus=toteutus.kurssi_tunnus";
		
		RowMapper<GenKurssi> mapper = new GenKurssiRowMapper();
		List<GenKurssi> genKurssit = jdbcTemplate.query(sql, mapper);

		return genKurssit;
	}
}
