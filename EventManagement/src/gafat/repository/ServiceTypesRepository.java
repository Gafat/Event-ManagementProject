package gafat.repository;

import gafat.domain.ServiceTypes;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ServiceTypesRepository extends  CrudRepository<ServiceTypes, Long> {
	

}
