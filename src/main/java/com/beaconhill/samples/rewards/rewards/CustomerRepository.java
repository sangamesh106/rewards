package com.beaconhill.samples.rewards.rewards;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beaconhill.samples.rewards.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
