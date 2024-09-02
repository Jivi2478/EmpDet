package com.example.task2;

import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.task2.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
