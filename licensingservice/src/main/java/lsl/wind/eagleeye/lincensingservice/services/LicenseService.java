package lsl.wind.eagleeye.lincensingservice.services;

import lsl.wind.eagleeye.lincensingservice.config.ServiceConfig;
import lsl.wind.eagleeye.lincensingservice.model.License;
import lsl.wind.eagleeye.lincensingservice.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LicenseService {

    @Autowired
    private LicenseRepository licenseRepository;

    @Autowired
    ServiceConfig config;

    public License getLicense(String organizationId, String licenseId) {
        License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
        return license;
    }

    public List<License> getLicensesByOrg(String organizationId){
        return licenseRepository.findByOrganizationId(organizationId);
    }

    public void saveLicense(License license){
        license.setLicenseId( UUID.randomUUID().toString());
        licenseRepository.save(license);
    }
    /*为了简洁，省略了其余的代码*/
}

