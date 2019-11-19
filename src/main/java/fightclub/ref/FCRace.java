package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

/**
 * Class that provides the data structure for deserializing the tags in the source XML
 * that represent character races. These races essentially represent different species the
 * character the user creates can be, each with their own advantages and disadvantages.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "race")
public class FCRace {
	private String name;
	private String size;
	@JacksonXmlProperty(localName = "ability")
	private String abilityAdj;
	private int speed;
	@JacksonXmlProperty(localName = "spellAbility")
	private String racialSpellAbility;
	@JacksonXmlProperty(localName = "proficiency")
	private String racialProficiencies;
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getAbilityAdj() {
		return abilityAdj;
	}
	public void setAbilityAdj(String abilityAdj) {
		this.abilityAdj = abilityAdj;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getRacialSpellAbility() {
		return racialSpellAbility;
	}
	public void setRacialSpellAbility(String racialSpellAbility) {
		this.racialSpellAbility = racialSpellAbility;
	}
	public String getRacialProficiencies() {
		return racialProficiencies;
	}
	public void setRacialProficiencies(String racialProficiencies) {
		this.racialProficiencies = racialProficiencies;
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
