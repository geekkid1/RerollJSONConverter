package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;


/**
 * Class for the data structure of traits and spell slots that automatically apply at a certain level
 * for a character class.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "autoLevel")
public class FCAutoLevel {
	private FCAutoSlots slots;
	@JacksonXmlProperty(localName = "feature")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCTrait[] features;
	@JacksonXmlProperty(isAttribute = true)
	private int level;
	@JacksonXmlProperty(isAttribute = true)
	private String scoreImprovement;
	
	public FCAutoSlots getSlots() {
		return slots;
	}
	public void setSlots(FCAutoSlots slots) {
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
	public String getScoreImprovement() {
		return scoreImprovement;
	}
	public void setScoreImprovement(String scoreImprovement) {
		this.scoreImprovement = scoreImprovement;
	}
}
