package gafat.service;

import gafat.domain.ServiceTypes;

import java.util.List;


public interface ServiceTypesService {
	
	public List<ServiceTypes> getAll();
	
	public ServiceTypes save(ServiceTypes pack);
	
	public ServiceTypes get(Long id);
	

}
