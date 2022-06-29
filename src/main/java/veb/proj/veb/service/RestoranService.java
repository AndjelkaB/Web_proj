package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.repository.RestoranRepository;

@Service
public class RestoranService {

    @Autowired
    private RestoranRepository restoranRepository;


}