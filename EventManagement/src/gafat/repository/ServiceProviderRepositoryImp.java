package gafat.repository;

import java.util.ArrayList;
import java.util.List;

import gafat.domain.ServiceProviders;

public class ServiceProviderRepositoryImp implements ServiceProvidersRepository {
	List<ServiceProviders> listOfServiceProv=new ArrayList<ServiceProviders>();
	
	public void saveServiceProvider(ServiceProviders serviceProviders){
		listOfServiceProv.add(serviceProviders);
		
	}

}
