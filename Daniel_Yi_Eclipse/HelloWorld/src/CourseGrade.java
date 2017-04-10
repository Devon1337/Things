
public class CourseGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initial value for each section
		int testScore=(78);
		int homeworksScore=(85);
		int quizScore=(72);
		int attendanceScore=(94);
		
		//  final value for each section
		double t=(0.35*78);
		double hs=(0.3*85);
		double qs=(0.2*72);
		double as=(0.15*94);
		double finalScore = (t+hs+qs+as);
		
		// final grade for student
		System.out.print("The student's final grade is "+finalScore);
		//System.out.print(t+hs+qs+as);
		
	}

}
