
public class critterClass {
	
	private String critName;
	private String critMood;


public critterClass(String critter) {
	
	critName = critter;
}

public critterClass(String critter, String mood) {
	critName = critter;
	critMood = mood;

}

public String toString() {
	
	String name = "Critter: ";
	name += "" + critName;
	
	return name;
}
}
