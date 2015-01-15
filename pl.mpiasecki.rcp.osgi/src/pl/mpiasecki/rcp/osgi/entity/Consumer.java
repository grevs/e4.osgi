package pl.mpiasecki.rcp.osgi.entity;

import org.eclipse.e4.core.di.annotations.Creatable;

@Creatable
public class Consumer {

	public Consumer() {
		// TODO Auto-generated constructor stub
	}
	
	public String presentYourself() {
		return Consumer.class.getName();
	}

}
