package reroll.ref;

/**
 * Incredibly simple class meant for holding the information associated with racial traits
 * before serializing it into a character race JSON file compatible with the Reroll app.
 * @author geekkid1
 *
 */
public class RRRacialTrait {
	private String name;
	private String desc;
	
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
	
}
