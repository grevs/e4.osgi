package pl.mpiasecki.rcp.osgi.service;

import org.eclipse.e4.core.di.annotations.Creatable;

import pl.mpiasecki.rcp.osgi.entity.Person;

@Creatable
public interface PersonService {
	String returnName(Person person);
	Integer returnAge(Person person);
	Integer returnDay();
}
