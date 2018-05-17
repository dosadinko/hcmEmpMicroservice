package com.infostudio.ba.repository;

import com.infostudio.ba.domain.EmEmpPreviousJobs;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the EmEmpPreviousJobs entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmEmpPreviousJobsRepository extends JpaRepository<EmEmpPreviousJobs, Long> {

}
