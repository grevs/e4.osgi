package pl.mpiasecki.rcp.osgi.consumer.services;

import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable
public class QuoteServiceImpl implements QuoteService {

	public QuoteServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String test() {
		return "test";
	}

}
