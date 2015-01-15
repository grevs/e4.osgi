package pl.mpiasecki.rcp.osgi.service.impl;

import pl.mpiasecki.rcp.osgi.service.ICFTest;

public class CFTestImpl implements ICFTest {

	private final String name;
	
	public CFTestImpl() {
		this.name = "CFTestImpl";
	}

	public String getName() {
		return name;
	}

	@Override
	public int equalsFour() {
		return 4;
	}
}
