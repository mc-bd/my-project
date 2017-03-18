package com.db.vo;

import java.sql.Date;

public class Product {
    private int id; 
   private String name;
     private int price;
     private Date regdate;
     private String img;
     

   public Product(int id, String name, int price, String img) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.img = img;
   }
   public Product(String name, int price, String img) {
      this.name = name;
      this.price = price;
      this.img = img;
   }
   public Product(String name, int price) {
      this.name = name;
      this.price = price;
   }
   public Product(int id, String name, int price) {
      this.id = id;
      this.name = name;
      this.price = price;
   }
  
   public Product(int id, String name, int price, Date regdate) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.regdate = regdate;
}
public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getPrice() {
      return price;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   public Date getDate() {
      return regdate;
   }
   public void setDate(Date regdate) {
      this.regdate = regdate;
   }
   public String getImg() {
      return img;
   }
   public void setImg(String img) {
      this.img = img;
   }
   
   public Product(int id, String name, int price, Date regdate, String img) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.regdate = regdate;
      this.img = img;
   }
   @Override
   public String toString() {
      return "Product [id=" + id + ", name=" + name + ", price=" + price + ", date=" + regdate + ", img=" + img + "]";
   }


     
   
}