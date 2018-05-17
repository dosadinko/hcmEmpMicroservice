package com.infostudio.ba.repository;

import com.infostudio.ba.domain.EmEmpSkills;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the EmEmpSkills entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmEmpSkillsRepository extends JpaRepository<EmEmpSkills, Long> {

}
