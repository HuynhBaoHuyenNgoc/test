/**
 * 
 */
package Tuan_7_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.sql.Date;

public class Student {
	private String nameStudent;
	private String idStudent;
	private Date BirthDay;
	private ArrayList<Subject> SubjectList;
	public Student(String nameST, String iD, Date birthDay, ArrayList<Subject> subjectList) {
		nameStudent = nameST;
		idStudent = iD;
		BirthDay = birthDay;
		SubjectList = subjectList;
	}
	public String getNameST() {
		return nameStudent;
	}
	public void setNameST(String nameST) {
		nameStudent = nameST;
	}
	public String getID() {
		return idStudent;
	}
	public void setID(String iD) {
		idStudent = iD;
	}
	public Date getBirthDay() {
		return BirthDay;
	}
	public void setBirthDay(Date birthDay) {
		BirthDay = birthDay;
	}
	public ArrayList<Subject> getSubjectList() {
		return SubjectList;
	}
	public void setSubjectList(ArrayList<Subject> subjectList) {
		SubjectList = subjectList;
	}
	@Override
	public String toString() {
		return "ID: " + idStudent + "\t" + "Name: " + nameStudent + "\t" +"BirthDay: " + BirthDay + "\t" + "Average: " +this.Average() ;
	}
	//thêm điểm
	public void addscore(Subject subject, double score) {
		if(SubjectList.contains(subject)) {
			subject.setScore(score);
		}else {
			SubjectList.add(subject);
		}
		
	}
	//điểm trung bình
	public double Average() {
		int count = 0;
		double total = 0;
		for (Subject subject : SubjectList) {
			total += subject.getScore();
			count++;
		}
		return total/count;
	}
	public String Print() {
		return "Name: " + this.nameStudent + "\t" + "Id: " + this.idStudent + "\t" + "Average Score: " + this.Average();
	}
}
