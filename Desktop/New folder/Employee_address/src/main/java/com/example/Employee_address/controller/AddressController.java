package com.example.Employee_address.controller;

import com.example.Employee_address.model.Address;
import com.example.Employee_address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("addresses")
    public Iterable<Address> getAddresses(){
        return addressService.getAddresses();
    }

    @GetMapping("address/{id}")
    public Address getAddress(@PathVariable Long id){
        return addressService.getAddress(id);
    }

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @PutMapping("address/{id}/{street}")
    public String updateStreet(@PathVariable Long id,@PathVariable String street){
        return addressService.updateStreet(id,street);
    }

    @DeleteMapping("address/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }
}
