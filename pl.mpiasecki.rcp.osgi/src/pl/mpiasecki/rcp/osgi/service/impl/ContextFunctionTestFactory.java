package pl.mpiasecki.rcp.osgi.service.impl;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;

import pl.mpiasecki.rcp.osgi.service.ICFTest;

public class ContextFunctionTestFactory extends ContextFunction {

	@Override
	public Object compute(IEclipseContext context) {
		ICFTest test = ContextInjectionFactory.make(CFTestImpl.class, context);
		MApplication application = context.get(MApplication.class);
	    IEclipseContext ctx = application.getContext();
	    ctx.set(ICFTest.class, test);
	    return test;
	}

}
