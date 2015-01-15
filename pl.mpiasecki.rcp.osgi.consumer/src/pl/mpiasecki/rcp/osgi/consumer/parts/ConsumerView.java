 
package pl.mpiasecki.rcp.osgi.consumer.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.swt.widgets.Composite;

import pl.mpiasecki.rcp.osgi.consumer.services.QuoteService;
import pl.mpiasecki.rcp.osgi.entity.Person;
import pl.mpiasecki.rcp.osgi.service.PersonService;



public class ConsumerView {
	
	// own annotation
//	@Inject
//	@MyNamed(value = "service2")
//	PersonService service;
	
	@Inject
	PersonService service;
	
	// register osgi service in activator
	@Inject
	QuoteService quoteService;
	
	public ConsumerView() {
		 
	}
	
	@PostConstruct
	public void postConstruct(MApplication app, Composite parent) {
	
	    System.out.println("Day = " + service.returnDay());
		System.out.println("Age = " + service.returnAge(new Person("Michal", 30)));
		System.out.println("Quote = " + quoteService.test());
		
		
	}
	
	@Focus
	public void onFocus() {
		
	}
	
	
}