package immutable;

public final class Student {
	private final int roll=10;
	private final String name="Ram";
	
	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		
		return name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	public static void main(String[] args) {
Student s=new Student();
System.out.println(s.getRoll());

	}

}
