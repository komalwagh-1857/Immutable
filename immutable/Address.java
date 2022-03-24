package immutable;

public class Address {
int pin;
String city;
String country;
public Address() {
}
public Address(int pin, String city, String country) {
	this.pin = pin;
	this.city = city;
	this.country = country;
}
/**
 * @return the pin
 */
public int getPin() {
	return pin;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @return the country
 */
public String getCountry() {
	return country;
}
/**
 * @param pin the pin to set
 */
public void setPin(int pin) {
	this.pin = pin;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
}

}
