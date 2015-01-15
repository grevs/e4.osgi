package pl.mpiasecki.rcp.osgi.service;

import org.eclipse.ui.services.AbstractServiceFactory;
import org.eclipse.ui.services.IServiceLocator;

import pl.mpiasecki.rcp.osgi.service.impl.PersonServiceImpl;

public class ServiceFactory extends AbstractServiceFactory {

	public ServiceFactory() {
		
	}

	@Override
	public Object create(Class serviceInterface, IServiceLocator parentLocator,
			IServiceLocator locator) {
		if(serviceInterface.equals(PersonService.class)) {
			return new PersonServiceImpl();
		}
		
		return null;
	}

}
