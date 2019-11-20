package reroll.ref;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RRSubClass {
	@JsonProperty("class")
	private String parentClass;
	private String name;
	private String desc;
	private RRClassFeature[] subclass_features;
	
	public String getParentClass() {
		return parentClass;
	}
	public void setParentClass(String parentClass) {
		this.parentClass = parentClass;
	}
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
	public RRClassFeature[] getSubclass_features() {
		return subclass_features;
	}
	public void setSubclass_features(RRClassFeature[] subclass_features) {
		this.subclass_features = subclass_features;
	}
	
}
