package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

/**
 * Class for the data structure of traits/features. This represents any of the basic elements
 * present in the XML that simply has a name and text element inside it.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "trait")
public class FCTrait {
	private String name;
	@JacksonXmlProperty(localName = "text")
	@JacksonXmlElementWrapper(useWrapping = false)
	private String[] desc;
	/**
	 * An XML attribute that, when present in a class autolevel tag, indicates that the
	 * feature is optional. It is technically unneeded for this implementation but must 
	 * be present in case it is encountered so the XML can parse properly.
	 */
	@JacksonXmlProperty(isAttribute = true)
	private String optional;
	private String special;
	private String attack;
	private String proficiency;
	@JacksonXmlProperty(localName = "modifier")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCModifier[] modifiers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getDesc() {
		return desc;
	}
	public void setDesc(String[] desc) {
		this.desc = desc;
	}
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
	public String getAttack() {
		return attack;
	}
	public void setAttack(String attack) {
		this.attack = attack;
	}
	public String getProficiency() {
		return proficiency;
	}
	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}
	public FCModifier[] getModifiers() {
		return modifiers;
	}
	public void setModifiers(FCModifier[] modifiers) {
		this.modifiers = modifiers;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	
	
}
