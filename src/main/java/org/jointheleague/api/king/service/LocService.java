package org.jointheleague.api.king.service;

import org.springframework.stereotype.Service;

@Service
public class LocService {

    public String getResults(String query){
        return "Searching for books related to " + query;
    }

}