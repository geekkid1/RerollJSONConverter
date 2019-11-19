package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

/**
 * Class that provides the data structure for feats in the source XML. As with most of the other
 * classes in this package, it will be used in what is hopefully the first of many implementations
 * of the classes in this project. Sure, some changes will be made to the data as it moves from being
 * stored here to the form it's in when it reaches the end of the implementation but it needs to be
 * like this right now or else it wouldn't read the source XML properly. Enjoy.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "feat")
public class FCFeat {
	private String name;
	private String prerequisite;
	private String special;
	@JacksonXmlElementWrapper(useWrapping = false)
	private String[] text;
	@JacksonXmlProperty(localName = "modifier")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCModifier[] modifiers;
	private String proficiency;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrerequisite() {
		return prerequisite;
	}
	public void setPrerequisite(String prerequisite) {
		this.prerequisite = prerequisite;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String[] getText() {
		return text;
	}
	public void setText(String[] text) {
		this.text = text;
	}
	public FCModifier[] getModifiers() {
		return modifiers;
	}
	public void setModifiers(FCModifier[] modifiers) {
		this.modifiers = modifiers;
	}
	public String getProficiency() {
		return proficiency;
	}
	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}
}
