package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;


/**
 * Object class that provides a framework for deserializing the "spell" tag in
 * XML source into java such that it can be re-used during JSON serialization later
 * in execution. Some of these fields may be unused during serialization but it is
 * good to have all of them here in case someone else wants to use this deserializer for
 * something different. I'm bad at writing Javadoc, I know.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "spell")
public class FCSpell {
	private String name;
	private int level;
	private String ritual;
	private String school;
	private String time;
	private String range;
	private String components;
	private String duration;
	@JacksonXmlProperty(localName = "text")
	@JacksonXmlElementWrapper(useWrapping=false)
	private String[] desc;
	@JacksonXmlElementWrapper(useWrapping=false)
	private String[] roll;
	private String classes;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getRitual() {
		return ritual;
	}
	public void setRitual(String ritual) {
		this.ritual = ritual;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getComponents() {
		return components;
	}
	public void setComponents(String components) {
		this.components = components;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String[] getDesc() {
		return desc;
	}
	public void setDesc(String[] desc) {
		this.desc = desc;
	}
	public String[] getRoll() {
		return roll;
	}
	public void setRoll(String[] roll) {
		this.roll = roll;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
}
