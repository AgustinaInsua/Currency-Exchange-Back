package com.exchange.repository;

import com.exchange.domain.entity.UserDE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDE, Long> {

        public UserDE findByIdEquals(Long id);

}
