package com.chant.dechanter.repo;

import com.chant.dechanter.entity.Chanticleer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Chanticleer, Long> {
}
