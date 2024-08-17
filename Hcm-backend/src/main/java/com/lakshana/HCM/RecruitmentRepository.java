package com.lakshana.HCM;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentRepository extends CrudRepository<Recruitment, String>{

}
