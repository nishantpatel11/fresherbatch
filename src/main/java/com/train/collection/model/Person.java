package com.train.collection.model;

public class Person {

	private String name;
	private Integer weight;
	private Integer height;

	public Person() {
		super();
	}

	public Person(String name, Integer weight, Integer height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
}
