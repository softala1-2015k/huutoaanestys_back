package fi.softala1.huutoaanestys.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.softala1.huutoaanestys.bean.Opiskelija;
import fi.softala1.huutoaanestys.exception.TietoRiviaEiLoydyPoikkeus;

@Repository
public class OpiskelijaDAOImpl implements OpiskelijaDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;
	

	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.dao.OpiskelijaDAO#etsiOpiskelija(java.lang.String)
	 */
	public Opiskelija etsiOpiskelija(String opiskelijanro) {
		String sql ="SELECT opiskelijanro, etunimet, sukunimi, osoite, postinro, puhnro, sahkoposti "
				
				+ "FROM opiskelija WHERE opiskelijanro = ?; ";
		
		Object[] parametrit = new Object[] { opiskelijanro };
		RowMapper<Opiskelija> mapper = new OpiskelijaRowMapper();
		
		Opiskelija o;
		try {
			
			o = jdbcTemplate.queryForObject(sql,  parametrit, mapper);
		} catch (IncorrectResultSizeDataAccessException e) {
			throw new TietoRiviaEiLoydyPoikkeus(e);
			
		}
		return o; 
		
		
	}
	
	
	/* (non-Javadoc)
	 * @see fi.softala1.huutoaanestys.dao.OpiskelijaDAO#haeOpiskelijat()
	 */
	public List<Opiskelija> haeOpiskelijat () {
		
		String sql = "SELECT opiskelijanro, etunimet, sukunimi, osoite, postinro, puhnro, sahkoposti FROM opiskelija";
		
		RowMapper<Opiskelija> mapper = new OpiskelijaRowMapper();
		List<Opiskelija> opiskelijat = jdbcTemplate.query(sql, mapper);
		
		return opiskelijat;
		
	}
	
	
	
	
	
	
}
