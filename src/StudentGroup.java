import java.util.Date;
import java.lang.IllegalArgumentException;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index < 0 || index >= this.students.length)
			throw new IllegalArgumentException();
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student == null || index < 0 || index >= this.students.length)
			throw new IllegalArgumentException();
		this.students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		Student[] students = new Student[this.students.length+1];
		students[0] = student;
		int i=1;
		for(int j=0;j<this.students.length;j++)
			students[i++] = this.students[j];
		this.students = students;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		Student[] students = new Student[this.students.length+1];
		for(int j=0;j<this.students.length;j++)
			students[j] = this.students[j];
		students[this.students.length] = student;
		this.students = students;	
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student == null || index < 0 || index >= this.students.length)
			throw new IllegalArgumentException();
		Student[] students = new Student[this.students.length+1];
		for(int j=0;j<index;j++)
			students[j] = this.students[j];
		students[index] = student;
		for(int j=index;j<this.students.length;j++)
			students[j+1] = this.students[j];		
		this.students = students;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index < 0 || index >= this.students.length)
			throw new IllegalArgumentException();
		Student[] students = new Student[this.students.length-1];
		for(int j=0;j<index;j++)
			students[j] = this.students[j];
		for(int j=index+1;j<this.students.length;j++)
			students[j-1] = this.students[j];		
		this.students = students;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		Student[] students = new Student[this.students.length-1];
		int j;
		for(j=0;j<this.students.length;j++)
			if(this.students[j].equals(student))
				break;
		if(j==this.students.length)
			return;
		for(j=j+1;j<this.students.length;j++)
			students[j-1] = this.students[j];		
		this.students = students;
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	// 	if(index < 0 || index >= this.students.length)
	// 		throw new IllegalArgumentException();
	// 	Student[] students = new Student[index];
	// 	int j;
	// 	for(j=0;j<index;j++)
	// 		students[j] = this.students[j];		
	// 	this.students = students;
	// }

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
