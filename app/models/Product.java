package models;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jackson.ObjectIdSerializer;
import org.jongo.marshall.jackson.oid.*;
import jackson.*;

import java.util.Arrays;
@JsonTypeInfo(use= JsonTypeInfo.Id.CLASS,property="_class")
public class Product {
    @ObjectId
    protected String id;
    @JsonProperty("name")
    protected String name;
    @JsonProperty("type")
    protected String type;
    @JsonProperty("description")
    protected String description;
    @JsonProperty("company")
    protected String company;
    @JsonProperty("price")
    protected float price;
    @JsonProperty("imagePath")
    protected String imagePath;
    @JsonProperty("imageName")
    protected String imageName;
    @JsonProperty("rating")
    protected float rating;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageName(){
        return imageName;
    }

    public void setImageName(String imageName){
        this.imageName = imageName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", image=" + imagePath +
                ", rating=" + rating +
                '}';
    }
}
