package second_spring_mvc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SchoolDto {

	@Id
	private int stuNo;
	private String stuName;
	private String stuLoc;
	private char stuSection;
	private String stuClass;
	private double stuPercentahge;
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuLoc() {
		return stuLoc;
	}
	public void setStuLoc(String stuloc) {
		this.stuLoc = stuloc;
	}
	public char getStuSection() {
		return stuSection;
	}
	public void setStuSection(char stuSection) {
		this.stuSection = stuSection;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	public double getStuPercentahge() {
		return stuPercentahge;
	}
	public void setStuPercentahge(double stuPercentahge) {
		this.stuPercentahge = stuPercentahge;
	}
	@Override
	public String toString() {
		return "SchoolDto [stuNo=" + stuNo + ", stuName=" + stuName + ", stuloc=" + stuLoc + ", stuSection="
				+ stuSection + ", stuClass=" + stuClass + ", stuPercentahge=" + stuPercentahge + "]";
	}
	
}
