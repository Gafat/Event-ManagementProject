package gafat.service;



import gafat.domain.ServiceTypes;
import gafat.repository.ServiceTypesRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class ServiceTypesServiceImp implements ServiceTypesService {
	@Autowired 
	ServiceTypesRepository serviceTypesRepository;
	
	
  	public List<ServiceTypes> getAll() {
		return  (List<ServiceTypes>) serviceTypesRepository.findAll();
	}
	
	public ServiceTypes  save(ServiceTypes serviceTypes) {
		return serviceTypesRepository.save(serviceTypes);
		
	}
	
	public ServiceTypes get(Long id) {
		return serviceTypesRepository.findOne(id);
	};
}
