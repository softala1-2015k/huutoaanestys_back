package fi.softala1.huutoaanestys.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.softala1.huutoaanestys.bean.Opiskelija;
import fi.softala1.huutoaanestys.dao.OpiskelijaDAO;

@RestController
public class OpiskelijaController {
	
	@Inject
	OpiskelijaDAO oDao;
	
	@RequestMapping("opiskelijat.json")
	public List<Opiskelija> haeOpiskelijatJSON() {
		List<Opiskelija> opiskelijat = oDao.haeOpiskelijat();
		return opiskelijat;
	}

}
