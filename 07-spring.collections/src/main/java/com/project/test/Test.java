package com.project.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.proje.db.DbConnection;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DbConnection dbconnection=new DbConnection();
       dbconnection.setUsername("besir");
       dbconnection.setPassword("123321");
       List<String> list=Arrays.asList("min 5 ","max 100 conneciton","catche 100 stamnet");
       dbconnection.setList(list);
       
       Map<String,String> map=new HashMap<String,String>();
        map.put("min conection"," 5");
       
        map.put("max conection"," 50");
        dbconnection.setMaps(map);
         Properties properties=new Properties();
         properties.setProperty("user", "root");
         dbconnection.setProps(properties);
         dbconnection.openConnection();
         dbconnection.closeConnection();
	}

}
