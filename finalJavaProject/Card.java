package finalJavaProject;

public class Card {
		
	private String name;
	private int value;
	
	Card(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String describe() {
		return this.name + " - Value: " + this.value;
	}
		
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
