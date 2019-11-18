package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

public class Race {
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
	private Trait[] traits;
	
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
	public Trait[] getTraits() {
		return traits;
	}
	public void setTraits(Trait[] traits) {
		this.traits = traits;
	}
	

}
