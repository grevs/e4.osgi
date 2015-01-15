package pl.mpiasecki.rcp.osgi.consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import pl.mpiasecki.rcp.osgi.consumer.services.QuoteService;
import pl.mpiasecki.rcp.osgi.consumer.services.QuoteServiceImpl;
import pl.mpiasecki.rcp.osgi.consumer.services.QuoteServiceImpl2;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		context.registerService(QuoteService.class, new QuoteServiceImpl2(), null);
		context.registerService(QuoteService.class, new QuoteServiceImpl(), null);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
}
