package pl.mpiasecki.rcp.osgi.service.impl;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

import pl.mpiasecki.rcp.osgi.dao.PersonDao;
import pl.mpiasecki.rcp.osgi.dao.impl.PersonDaoImpl;
import pl.mpiasecki.rcp.osgi.entity.Person;
import pl.mpiasecki.rcp.osgi.service.PersonService;

@Singleton
@Creatable
public class PersonServiceImpl implements PersonService {

//	private static PersonServiceImpl instance;
//	
//	public static PersonServiceImpl getInstance() {
//		if(instance == null) {
//			instance = new PersonServiceImpl();
//		}
//		return instance;
//	}
	
	private PersonDao personDao = new PersonDaoImpl();
	private Integer day = 0;
	
	public PersonServiceImpl() {
		
	}
	
	@Override
	public String returnName(Person person) {
		return personDao.returnName(person);
	}

	@Override
	public Integer returnAge(Person person) {
		return personDao.returnAge(person);
	}

	@Override
	public Integer returnDay() {
		return day;
	}
	
	public void increaseDay() {
		day++;
	}

}
