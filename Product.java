package rest_api.dto;

import java.util.List;
import java.util.Map;

public class Product 
{
	private String id;
    private String name;
    private String description;
    private double price;
    private List<String> categories;
    private List<Map<String, String>> attributes;
    private Availability availability;
    private List<Rating> ratings;
    
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public List<String> getCategories() 
	{
		return categories;
	}
	public void setCategories(List<String> categories) 
	{
		this.categories = categories;
	}
	public List<Map<String, String>> getAttributes() 
	{
		return attributes;
	}
	public void setAttributes(List<Map<String, String>> attributes) 
	{
		this.attributes = attributes;
	}
	public Availability getAvailability() 
	{
		return availability;
	}
	public void setAvailability(Availability availability) 
	{
		this.availability = availability;
	}
	public List<Rating> getRatings() 
	{
		return ratings;
	}
	public void setRatings(List<Rating> ratings) 
	{
		this.ratings = ratings;
	}


}
