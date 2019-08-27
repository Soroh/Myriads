package com.myriadsforjesus.web.app.repositories;

import com.myriadsforjesus.web.app.models.Myriad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyriadRepo extends JpaRepository<Myriad,Long> {
    Myriad findByEmailAddress(String email);
}
