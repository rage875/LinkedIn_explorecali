package com.example.ec.service;

import com.example.ec.domain.TourPackage;
import com.example.ec.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    /**
     * Create a Tour Package
     *
     * @param code code of the package
     * @param name name of the package
     *
     * @return new or existing tour package
     */
    public TourPackage createTourPackage(String code, String name) {
        return new TourPackage(code, name);
    }

    /**
     * Lookup All Tour packages
     *
     * @return all tour packages
     */
    public Iterable<TourPackage> lookup(){
        return null;
    }

    public long total() {
        return 0;
    }
}
