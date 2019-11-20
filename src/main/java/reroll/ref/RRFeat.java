package reroll.ref;

/**
 * Class to allow for the serialization of Feats into Reroll-compatible JSON.
 * @author geekkid1
 *
 */
public class RRFeat {
	private String name;
	private String desc;
	private RRSkill[] proficiencies;
	
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
	public RRSkill[] getProficiencies() {
		return proficiencies;
	}
	public void setProficiencies(RRSkill[] proficiencies) {
		this.proficiencies = proficiencies;
	}
}
