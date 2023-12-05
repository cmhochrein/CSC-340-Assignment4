package com.assignment4.crudapp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chris
 */
@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
    
}
