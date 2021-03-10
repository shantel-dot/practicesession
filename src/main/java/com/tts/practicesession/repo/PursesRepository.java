package com.tts.practicesession.repo;

import com.tts.practicesession.model.Purses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PursesRepository extends CrudRepository<Purses, Long> {

}