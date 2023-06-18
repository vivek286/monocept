package com.monocept.assesment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException {
	
	
	File regionData=new File("E:/15_assingment/Regions.txt");
	File countryData=new File("E:/15_assingment/Country.txt");
	Scanner scanner=new Scanner(regionData);
	HashMap<String,String>RegionIdRelation=new HashMap();
	HashMap<String,ArrayList<Country>>CountryRegionRelation=new HashMap();
	while(scanner.hasNextLine()) {
		String line[] = scanner.nextLine().split(",");
		RegionIdRelation.put(line[0], line[1]);
		
	}
	scanner=new Scanner(countryData);
	while(scanner.hasNextLine()) {
		String line[] = scanner.nextLine().split(",");
		if(CountryRegionRelation.get(line[2])!=null) {
			Country obj=new Country(line[2],line[1],line[0]);
			ArrayList<Country>temp=CountryRegionRelation.get(line[2]);
			temp.add(obj);
			CountryRegionRelation.put(line[2],temp);
		}else {
			Country obj=new Country(line[2],line[1],line[0]);
			ArrayList<Country>temp=new ArrayList();
			temp.add(obj);
			CountryRegionRelation.put(line[2],temp);
		}
		
		
	}
	scanner=new Scanner(System.in);
	CountryRegionRelation.forEach((k,v)->System.out.println(k+" "+v.size()));
	System.out.println("Printing countries Regionwise: \n");
	RegionIdRelation.forEach((key1,value1)->{
		System.out.println("Countries in region "+value1+": \n");
		CountryRegionRelation.get(key1).forEach(country->System.out.println(country.getCountryCode()+" "+country.getCountry()));
		
	});
	System.out.println("Enter Country Code : \n");
	String countrycode=scanner.next();
	System.out.println("Countries in countrycode "+countrycode+" name "+RegionIdRelation.get(countrycode)+": \n");
	CountryRegionRelation.get(countrycode).forEach(country->System.out.println(country.getCountryCode()+" "+country.getCountry()));
	

}
}
