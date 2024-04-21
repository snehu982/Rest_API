package rest_api.dao;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.Document;

public class SeedData 
{
	public static void main(String[] args) {
        
		try (var mongoClient = MongoClients.create("mongodb://localhost:27017")) {
		    MongoDatabase database = mongoClient.getDatabase("product_catalog");
		    MongoCollection<Document> collection = database.getCollection("products");

		    List<Document> products = Arrays.asList(
		            new Document("name", "Product 1")
		                    .append("description", "Description of Product 1")
		                    .append("price", 19.99)
		                    .append("categories", Arrays.asList("Category1", "Category2"))
		                    .append("attributes", Arrays.asList(
		                            new Document("size", "Large"),
		                            new Document("color", "Red")
		                    ))
		                    .append("availability", new Document("inStock", true).append("quantity", 50))
		                    .append("ratings", Arrays.asList(
		                            new Document("userId", "user1").append("rating", 4).append("comment", "Nice product"),
		                            new Document("userId", "user2").append("rating", 5)
		                    )),
		            new Document("name", "Product 2")
		                    .append("description", "Description of Product 2")
		                    .append("price", 29.99)
		                    .append("categories", Arrays.asList("Category1", "Category3"))
		                    .append("attributes", Arrays.asList(
		                            new Document("size", "Medium"),
		                            new Document("color", "Blue")
		                    ))
		                    .append("availability", new Document("inStock", true).append("quantity", 20))
		                    .append("ratings", Arrays.asList(
		                            new Document("userId", "user3").append("rating", 3).append("comment", "Average"),
		                            new Document("userId", "user4").append("rating", 4)
		                    ))
		    );

		    collection.insertMany(products);

		    System.out.println("Data seeded successfully!");
		} catch (Exception e) {
		    System.err.println("Error seeding data: " + e.getMessage());
		}
	}
}

