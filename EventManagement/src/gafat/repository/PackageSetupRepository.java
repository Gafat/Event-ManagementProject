package gafat.repository;

import gafat.domain.Packages;

import java.util.List;

public interface PackageSetupRepository {
	public List<String> getPackageList();
	public void savePackageSetup(Packages pack);

}
