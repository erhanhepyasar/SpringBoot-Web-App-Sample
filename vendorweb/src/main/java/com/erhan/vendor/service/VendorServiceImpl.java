package com.erhan.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erhan.vendor.entities.Vendor;
import com.erhan.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private
	VendorRepository repository;

	@Override
	public Vendor saveVendor(Vendor vendor) {		
		return getRepository().save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return getRepository().save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		getRepository().delete(vendor);

	}

	@Override
	public Vendor getVendorById(int id) {
		
		return getRepository().getOne(id);
	}

	@Override
	public List<Vendor> getAllVendors() {
		
		return getRepository().findAll();
	}

	public VendorRepository getRepository() {
		return repository;
	}

	public void setRepository(VendorRepository repository) {
		this.repository = repository;
	}

}
