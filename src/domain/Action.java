package domain;

public class Action {
	private String name = "";
	
	Action(){}
	Action(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "act: " + this.name + " ";
	}
}
