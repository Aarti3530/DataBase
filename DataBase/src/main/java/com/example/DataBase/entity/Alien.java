package com.example.DataBase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aliens")
public class Alien {
	
	public Alien(int id, String name, int age, String num) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.num = num;
	}
	
	public Alien() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="NUM")
	private String num;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", age=" + age + ", num=" + num + "]";
	}

}
