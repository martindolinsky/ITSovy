package sk.itsovy.dolinsky;

/**
 * @author Martin Dolinsky
 */
public class Group {
	private String name;
	private int size;
	private int capacity;
	private Student[] arr;

	public Group(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.size = 0;
		this.arr = new Student[capacity];
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public Student[] getArr() {
		return arr;
	}

	public boolean addStudent(Student student) {
		if (student == null || size == capacity)
			return false;
		arr[size] = student;
		size++;
		return true;
	}

	public Student getStudent(String firstName, String lastName) {
		return null;
	}

	public boolean deleteStudent(Student student) {
		if (student == null || size == 0)
			return false;

		for (int i = 0; i < size; i++) {
			if (arr[i] == student) {
				// TODO delete
				
			}

		}
		return true;
	}

	public void print() {
		System.out.println("List of students [" +name + "] : ");
		for (int i = 0; i < size; i++) {
			System.out.println("   " + arr[i].toString());
		}
	}

}
