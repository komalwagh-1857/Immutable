package immutable;

public final class Empolyee {
private final int id;
private final String name;
private final Address add;


public Empolyee(int id, String name, Address add) {
	this.id = id;
	this.name = name;
Address addr=new Address();
addr.setPin(add.getPin());
addr.setCity(add.getCity());
addr.setCountry(add.getCountry());
this.add=addr;
}

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @return the add
 */
public Address getAdd() {
	Address address=new Address();
	address.setPin(this.add.getPin());
	address.setCity(this.add.getCity());
	address.setCountry(this.add.getCountry());
	return address;
}

@Override
public String toString() {
	return "Empolyee [id=" + id + ", name=" + name + ", add=" + add + "]";
}

	
}
