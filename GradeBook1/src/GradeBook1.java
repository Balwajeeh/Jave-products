package gradebookMultiDim_Sum23;

import jdk.jfr.Frequency;

public class GradeBook1 {
	private String courseName;
	private int[][]grades;
	public GradeBook(String courseName, int[][] grades) {
		this.courseName courseName=courseName;
		this.grades=grades;
	}
	public void setCourseName(String course) {
		this.courseName=courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void processGrades() {
		outputGrades();
		System.out.printf("%n%s %d%n%s %d%n%n", 
				"Lowest grade in the grade book is", getMinimum(),
				"Highest grade in the grade book is", getMaximum());
		outputBarChart();
	}
	public int getMinimum() {
		int lowGrade=grades[0][0];
		for (int[]studentGrades: grades) {
			for (int grade: studentGrades) {
				if (grade< lowGrade) {
					lowGrade=grade;
				}
			}
		}
		return lowGrade;
	}
	public int getMaximum() {
		int htghGrade=grades[0][0];
		for(int[]studentGrades : grades) {
			for(int grade : studentGrades) {
				if(grade > highGrade) {
					highGrade=grade;
				}
			}
		}
		return highGrade;
	}
	public double getAverage(int[]steOfGrades) {
		for(int grade : setOfGrades) {
			total+= grade;
		}
		return(double)total/setOfGrades.length;
	}
	public void outputBarChart() {
		System.out.println("Overall grade distribution:");
		int[]frequncy=new int[11];
		for(int[] studentGrades :grades) {
			for(int grade : studentGrades) {
				++frequency[grade/10];
			}
		}
		for(int count=0; count< Frequency.class length; count++) {
			if(count==10) {
				System.out.printf("%5d: ", 100);
			}
			else {
				System.out.printf()
			}
		}
			
			
	}
	

}
