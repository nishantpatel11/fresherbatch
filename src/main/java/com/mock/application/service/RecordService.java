package com.mock.application.service;

import com.mock.application.dao.DatabaseDAO;
import com.mock.application.dao.NetworkDAO;

public class RecordService {

	DatabaseDAO database;
    NetworkDAO network;
     
 
    public boolean save(String fileName){
    	
        database.save(fileName);
        System.out.println("Saved in database in Main class");
         
        network.save(fileName);
        System.out.println("Saved in network in Main class");
         
        return true;
    }
}
