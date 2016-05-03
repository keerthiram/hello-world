package com.controller;

import java.net.UnknownHostException;

import org.bson.Document;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongodbConnection {

	public static void main(String[] args) throws UnknownHostException{

		Student student = createStudent();
		DBObject doc = createDBObject(student);
		
		MongoClient mongoClient = mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase db = mongoClient.getDatabase("keerthidb");
		
		//MongoClient mongo = new MongoClient("localhost", 27017);
		//MongoDatabase db = mongo.getDatabase("keerthidb");

		//DBCollection col = (DBCollection) db.getCollection("student");
		MongoCollection col = db.getCollection("student");

		
		WriteResult result = ((DBCollection) col).insert(doc);
		System.out.println(result.getUpsertedId());
		System.out.println(result.getN());
		System.out.println(result.isUpdateOfExisting());

		//DBObject query = BasicDBObjectBuilder.start().append("_id", student.getId()).get();
		//DBCursor cursor = col.find(query);
		//while (cursor.hasNext()) {
			//System.out.println(cursor.next());
		//}
		
		
		student.setFirstname("firstname");
		student.setLastname("lastname");
		student.setAddress("address");
		//doc = (Document) createDBObject(student);
	}

	private static DBObject createDBObject(Student student) {
		BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();

		docBuilder.append("firstname", student.getFirstname());
		docBuilder.append("lastname", student.getLastname());
		docBuilder.append("address", student.getAddress());
		return docBuilder.get();

	}
	
	private static Student createStudent(){
		Student student = new Student();
		student.setLastname("lastname");
		student.setFirstname("firstname");
		student.setAddress("address");
		return student;
		
	}
}
