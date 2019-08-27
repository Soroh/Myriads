package com.myriadsforjesus.web.app.service.imple;

import com.myriadsforjesus.web.app.models.Myriad;
import com.myriadsforjesus.web.app.repositories.MyriadRepo;
import com.myriadsforjesus.web.app.service.MyriadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyriadServiceImpl implements MyriadService {
    @Autowired
    private MyriadRepo myriadRepo;

    @Override
    public Page<Myriad> getAllCustomersPaged(int pageNo) {
        return null;
    }

    @Override
    public Myriad saveMyriad(Myriad myriad) {
        return myriadRepo.save(myriad);
    }

    @Override
    public void deleteMyriad(Long myriadId) {

    }

    @Override
    public Myriad findById(Long myriadId) {
        return myriadRepo.findById(myriadId).orElse(new Myriad());
    }

    @Override
    public Page<Myriad> search(String search, int pageNo) {
        return null;
    }

    @Override
    public List<Myriad> getAllMyriads() {
        return null;
    }

    @Override
    public Myriad findByEmail(String email) {
        return myriadRepo.findByEmailAddress(email);
    }
}
