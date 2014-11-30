package org.chicagopolice.model;

import java.net.UnknownHostException;
import java.util.List;

import org.apache.log4j.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class RetrieveBlock {
	final static Logger logger = Logger.getLogger(RetrieveBlock.class);

	public static List getBlocks(String block) {

		try {

			MongoClient mongo = new MongoClient("localhost", 27017);
			DB db_chicagodata = mongo.getDB("chicagodata");

			// get a single collection
			DBCollection crimeCollection = db_chicagodata
					.getCollection("crimes");

			BasicDBObject searchQuery = new BasicDBObject().append("Block",
					new BasicDBObject("$regex", block));

			List listOfBlocks = crimeCollection.distinct("Block", searchQuery);
			
			for(int i = 0; i < listOfBlocks.size(); i++)
				System.out.println(listOfBlocks.get(i));
			
			return listOfBlocks;

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}
		return null;

	}

}
