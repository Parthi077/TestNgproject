package PomPack;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class SampleWeb extends BaseClass {

	public By SampleWeb=By.xpath("//button[text()='Add']");
	
	public By FirstName=By.xpath("(//input[@name=\"firstname\"])[1]");
	
	public By LastName=By.xpath("(//input[@name=\"lastname\"])[1]");
	
	public By Email =By.xpath("(//input[@name=\"email\"])[1]");
	
	public By Age =By.xpath("(//input[@name=\"age\"])[1]");
	
	public By Salary =By.xpath("(//input[@id=\"salary\"])[1]");
	
	public By Dept=By.xpath("(//input[@name=\"deparment\"])[1]");
	
	public By Login=By.xpath("(//input[@type=\"submit\"])[1]");
	
	
}
