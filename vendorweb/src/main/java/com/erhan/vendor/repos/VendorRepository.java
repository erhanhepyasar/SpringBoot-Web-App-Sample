package com.erhan.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erhan.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
