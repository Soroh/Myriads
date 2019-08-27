package com.myriadsforjesus.web.app.service;

import com.myriadsforjesus.web.app.models.Myriad;
import org.springframework.data.domain.Page;

import java.util.List;

public interface MyriadService {

    Page<Myriad> getAllCustomersPaged(int pageNo);

    Myriad saveMyriad(Myriad myriad);

    void deleteMyriad(Long myriadId);

    Myriad findById(Long myriadId);

    Page<Myriad> search(String search, int pageNo);

    List<Myriad> getAllMyriads();

    Myriad findByEmail(String email);
}
