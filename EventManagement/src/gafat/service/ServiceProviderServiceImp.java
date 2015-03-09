package gafat.service;

import org.springframework.beans.factory.annotation.Autowired;

import gafat.domain.ServiceProviders;
import gafat.repository.ServiceProvidersRepository;

public class ServiceProviderServiceImp implements ServiceProviderService {
	@Autowired
	ServiceProvidersRepository serviceProviderRepository;
	public void saveServiceProvider(ServiceProviders serviceProviders){
		serviceProviderRepository.saveServiceProvider(serviceProviders);
	}

}
