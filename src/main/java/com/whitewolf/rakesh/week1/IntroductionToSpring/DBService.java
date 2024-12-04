package com.whitewolf.rakesh.week1.IntroductionToSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
public class DBService {

    //@Autowired
    final private DB db;

    public DBService(DB db){
        this.db = db;
    }

    String getData(){
        return db.getData();
    }
}
