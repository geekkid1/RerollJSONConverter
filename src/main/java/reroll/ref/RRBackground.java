package reroll.ref;

/**
 * A class that provides the data structure format which allows for the serialization of
 * DnD character backgrounds into Reroll-compatible JSON.
 * @author geekkid1
 *
 */
public class RRBackground {
	private String name;
	private String feature;
	private String desc;
	private RRSkill[] proficiencies;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
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
