package me.benhunter.keycloakstarter;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
