package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


/**
 * Class for the data structure of traits and spell slots that automatically apply at a certain level
 * for a character class.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "autoLevel")
public class FCAutoLevel {
	private String slots;
	@JacksonXmlProperty(localName = "feature")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCTrait[] features;
	@JacksonXmlProperty(isAttribute = true)
	private int level;
	
	public String getSlots() {
		return slots;
	}
	public void setSlots(String slots) {
		this.slots = slots;
	}
	public FCTrait[] getFeatures() {
		return features;
	}
	public void setFeatures(FCTrait[] features) {
		this.features = features;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
