package org.jointheleague.api.king.service;

import org.jointheleague.api.king.repository.LocRepository;
import org.jointheleague.api.king.repository.dto.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocService {

    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {
        this.locRepository = locRepository;
    }

    public List<Result> getResults(String query){
        return locRepository.getResults(query);
    }


}
