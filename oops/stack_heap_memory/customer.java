package com.aswini.stack_heap_memory;

public class customer {
private int id;
private String name;
public customer(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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
@Override
public String toString() {
	return "customer [id=" + id + ", name=" + name + "]";
}

}
