package gafat.service;

import gafat.domain.Packages;

import java.util.List;

public interface PackageSetupService {
	public List<String> getPackageList();
	public void savePackageSetup(Packages pack);
	

}
