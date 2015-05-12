package fi.softala1.huutoaanestys.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.softala1.huutoaanestys.bean.GenKurssi;
import fi.softala1.huutoaanestys.dao.GenKurssiDAO;

@RestController
public class GenKurssiController {
	
	@Inject
	GenKurssiDAO gDao;
	
	@RequestMapping("genKurssit.json")
	public List<GenKurssi> haeGenKurssitJSON() {
		List<GenKurssi> kurssit = gDao.haeGenKurssit();
		return kurssit;
	}

}
