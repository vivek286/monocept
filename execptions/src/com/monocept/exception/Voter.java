package com.monocept.exception;

public class Voter extends ageNotValid {

	private int voterid;
	private String name;
	private int age;
	public Voter(int voterid, String name, int age) {
		super(age);
		this.voterid = voterid;
		this.name = name;
		if(age<18) {
			throw new ageNotValid(age);
		}
		this.age = age;
	}
	public int getVoterid() {
		return voterid;
	}
	public void setVoterid(int voterid) {
		this.voterid = voterid;
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
	@Override
	public String toString() {
		return "Voter [voterid=" + voterid + ", name=" + name + ", age=" + age + "]";
	}
	

}
