package pl.mpiasecki.rcp.osgi.service.impl;

import pl.mpiasecki.rcp.osgi.dao.PersonDao;
import pl.mpiasecki.rcp.osgi.dao.impl.PersonDaoImpl;
import pl.mpiasecki.rcp.osgi.entity.Person;
import pl.mpiasecki.rcp.osgi.service.PersonService;


public class Person2ServiceImpl implements PersonService {

	private PersonDao personDao = new PersonDaoImpl();
	private Integer day = 0;
	
	@Override
	public String returnName(Person person) {
		return personDao.returnName(person);
	}

	@Override
	public Integer returnAge(Person person) {
		return 20;
	}

	@Override
	public Integer returnDay() {
		return day;
	}

}
