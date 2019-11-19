package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

/**
 * Class to provide the data structure for backgrounds in the source XML. This will be at least
 * partially utilized by the originally planned implementation for this project, although I do not
 * believe quite all of it will be able to be used. Nonetheless, I like to be thorough, so if you want
 * to be able to use java object versions of the source XML then you can use this project. Knock
 * yourself out.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName="background")
public class FCBackground {
	private String name;
	private String proficiency;
	@JacksonXmlProperty(localName = "trait")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCTrait[] traits;
	@JacksonXmlProperty(localName = "modifier")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCModifier[] modifiers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProficiency() {
		return proficiency;
	}
	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}
	public FCTrait[] getTraits() {
		return traits;
	}
	public void setTraits(FCTrait[] traits) {
		this.traits = traits;
	}
	public FCModifier[] getModifiers() {
		return modifiers;
	}
	public void setModifiers(FCModifier[] modifiers) {
		this.modifiers = modifiers;
	}
}
