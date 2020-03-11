package lsl.wind.eagleeye.lincensingservice.repository;

import lsl.wind.eagleeye.lincensingservice.model.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepository extends JpaRepository<License,String> {
    List<License> findByOrganizationId(String organizationId);  //每个查询方法被Spring解析为SELECT...FROM查询

    License findByOrganizationIdAndLicenseId(String organizationId,String licenseId);
}
