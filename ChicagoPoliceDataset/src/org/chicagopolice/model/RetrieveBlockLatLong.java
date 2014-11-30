package org.chicagopolice.model;

import java.net.UnknownHostException;
import java.util.ArrayList;

import org.chicagopolice.pojo.Crimes;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class RetrieveBlockLatLong {
	
	public static Crimes[] getBlocks(String block) {

			try {

				MongoClient mongo = new MongoClient("localhost", 27017);
				DB db_chicagodata = mongo.getDB("chicagodata");

				// get a single collection
				DBCollection crimeCollection = db_chicagodata
						.getCollection("crimes");

				BasicDBObject searchQuery = new BasicDBObject().append("Block",
						new BasicDBObject("$regex", block));

				DBCursor cursor2 = crimeCollection.find(searchQuery);
				
				Crimes[] cr = new Crimes[cursor2.size()];

				int i = 0;
				while (cursor2.hasNext()) {
					DBObject obj = cursor2.next();
					System.out.println(obj);
					
					cr[i] = new Crimes();
					
					cr[i].setBlock(obj.get("Block").toString());
					cr[i].setLatitude(obj.get("Latitude").toString());
					cr[i].setLongitude(obj.get("Longitude").toString());
					
					System.out.println(cr[i].getBlock() 
							+ " == " + cr[i].getLatitude() 
							+ " == " + cr[i].getLongitude());
				}
				return cr;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (MongoException e) {
				e.printStackTrace();
			}
			return null;

		}

}
