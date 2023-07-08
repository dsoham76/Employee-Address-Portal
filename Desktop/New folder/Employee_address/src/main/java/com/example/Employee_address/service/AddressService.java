package com.example.Employee_address.service;

import com.example.Employee_address.model.Address;
import com.example.Employee_address.repository.IAddressRepo;
import com.example.Employee_address.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public Iterable<Address> getAddresses() {
        return addressRepo.findAll();
    }

    public Address getAddress(Long id) {
        Optional<Address> allAddress=addressRepo.findById(id);
        Address address=allAddress.get();
        if(allAddress.isPresent()){
            return address;
        }else{
            return null;
        }
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address has been added.";
    }

    public String updateStreet(Long id, String street) {
        Optional<Address> allAddress=addressRepo.findById(id);
        Address address=allAddress.get();
        if(allAddress.isPresent()){
            address.setStreet(street);
            addressRepo.save(address);
            return "Street has been updated";
        }else{
            return "No address exists with given id.";
        }
    }

    public String deleteAddress(Long id) {
        Optional<Address> allAddresses=addressRepo.findById(id);
        Address address=allAddresses.get();
        if(allAddresses.isPresent()){
            addressRepo.delete(address);
            return "Address has been deleted";
        }else{
            return "No address exists with given id.";
        }
    }
}
