package pl.mpiasecki.rcp.osgi.annotations.internal;

import java.lang.annotation.Annotation;
import java.util.Date;

import org.eclipse.e4.core.di.suppliers.ExtendedObjectSupplier;
import org.eclipse.e4.core.di.suppliers.IObjectDescriptor;
import org.eclipse.e4.core.di.suppliers.IRequestor;

import pl.mpiasecki.rcp.osgi.annotations.MyNamed;
import pl.mpiasecki.rcp.osgi.service.impl.Person2ServiceImpl;
import pl.mpiasecki.rcp.osgi.service.impl.PersonServiceImpl;


public class MyObjectSupplier extends ExtendedObjectSupplier {
@Override
public Object get(IObjectDescriptor descriptor, IRequestor requestor,
         boolean track, boolean group) {
      System.out.println("Own annotation processor");
      // for the purpose of providing a simple example here
      // we return a hard-coded Todo
      
      MyNamed qualifier = descriptor.getQualifier(MyNamed.class);
      String value = qualifier.value();
      
      if(value.equals("service")) {
    	  return new PersonServiceImpl();
      }
      else if(value.equals("service2")) {
    	  return new Person2ServiceImpl();
      }
      
      return null;
   }
} 
