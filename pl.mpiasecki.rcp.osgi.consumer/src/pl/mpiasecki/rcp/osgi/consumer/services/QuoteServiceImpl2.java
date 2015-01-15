package pl.mpiasecki.rcp.osgi.consumer.services;

import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable
public class QuoteServiceImpl2 implements QuoteService {

	public QuoteServiceImpl2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String test() {
		return "test2";
	}

}
