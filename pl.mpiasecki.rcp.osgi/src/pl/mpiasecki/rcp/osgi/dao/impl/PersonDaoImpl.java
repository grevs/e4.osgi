/**
 * 
 */
package pl.mpiasecki.rcp.osgi.dao.impl;

import pl.mpiasecki.rcp.osgi.dao.PersonDao;
import pl.mpiasecki.rcp.osgi.entity.Person;

/**
 * @author mpiasecki
 *
 */
public class PersonDaoImpl implements PersonDao {

	/* (non-Javadoc)
	 * @see pl.mpiasecki.rcp.osgi.dao.PersonDao#returnName(pl.mpiasecki.rcp.osgi.entity.Person)
	 */
	@Override
	public String returnName(Person person) {
		return person.getName();
	}

	/* (non-Javadoc)
	 * @see pl.mpiasecki.rcp.osgi.dao.PersonDao#returnAge(pl.mpiasecki.rcp.osgi.entity.Person)
	 */
	@Override
	public Integer returnAge(Person person) {
		return person.getAge();
	}

}
