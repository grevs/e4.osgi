package pl.mpiasecki.rcp.osgi;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import pl.mpiasecki.rcp.osgi.service.PersonService;
import pl.mpiasecki.rcp.osgi.service.impl.Person2ServiceImpl;
import pl.mpiasecki.rcp.osgi.service.impl.PersonServiceImpl;

public class Activator implements BundleActivator {

	private static BundleContext context;
//	private IEclipseContext eclipseContext;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		registerPersonService();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
	
	private void registerPersonService() {
		PersonServiceImpl service = new PersonServiceImpl();
		Person2ServiceImpl service2 = new Person2ServiceImpl();
//		service.increaseDay();
		
//		EclipseContextFactory. getServiceContext(bundleContext);
		IEclipseContext eclipseContext = EclipseContextFactory.getServiceContext(this.context);
//		PersonService dao = ContextInjectionFactory.make(PersonServiceImpl.class, eclipseContext);
//		ContextInjectionFactory.inject(service, eclipseContext);
		eclipseContext.set(PersonService.class, service);
		
//		context.registerService(PersonService.class.getName(), service, null);
//		context.registerService(PersonService.class.getName(), service2, null);
	}

}
