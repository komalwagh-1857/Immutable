package immutable;

public class TestEmployee {
public static void main(String[] args) {
	Address add=new Address(1234,"Pune","India");
	Empolyee e=new Empolyee(10,"Ram",add);
	
	System.out.println("original="+e);
	add.setCity("Mumbai");
	System.out.println("After changed="+e);
}
}
