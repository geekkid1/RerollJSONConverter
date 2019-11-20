package reroll.ref;

/**
 * The class used in both RRClass and RRSubClass for storing class features. These are
 * features gained at a specific level with a certain class and thus include in their fields
 * @author ibtro
 *
 */
public class RRClassFeature {
	private String name;
	private String desc;
	private int level;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
