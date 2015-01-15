package pl.mpiasecki.rcp.osgi.dao;

import pl.mpiasecki.rcp.osgi.entity.Person;

public interface PersonDao {
	String returnName(Person person);
	Integer returnAge(Person person);
}
