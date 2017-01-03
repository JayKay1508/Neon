package com.example;

public class Customer extends Account{
public Customer(double balance) {
	super(balance);
}
private String Customer_id;
private String Customer_name;

public Customer(double balance, String customer_id, String customer_name){
	super(balance);
	Customer_id = customer_id;
	Customer_name = customer_name;
}
@Override
public void getDescription(){
	System.out.println(this.Customer_id);
}
@Override
public Boolean withdraw(double amount){
	return null;
}
public String getCustomer_id(){
	return Customer_id;
}
public void setCustomer_id(String customer_id){
	Customer_id = customer_id;
}
public String getCustomer_name(){
	return Customer_name;
}
public void setCustomer_name(String customer_name){
	Customer_name = customer_name;
}
}