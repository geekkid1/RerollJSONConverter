package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

/**
 * Class that provides data structure supporting the creatures in the source XML. As
 * with items, it is not required by the intended implementation of this project, but
 * I'm putting it on a public repository so I wanted it to be as extensible as possible.
 * If someone is making something that reads in the same XML I guess they can use this if they want.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "monster")
public class FCCreature {
	private String name;
	private String size;
	private String type;
	private String alignment;
	private String ac;
	private String hp;
	private String speed;
	@JacksonXmlProperty(localName = "str")
	private int strength;
	@JacksonXmlProperty(localName = "dex")
	private int dexterity;
	@JacksonXmlProperty(localName = "con")
	private int constitution;
	@JacksonXmlProperty(localName = "int")
	private int intelligence;
	@JacksonXmlProperty(localName = "wis")
	private int wisdom;
	@JacksonXmlProperty(localName = "cha")
	private int charisma;
	private String save;
	private String skill;
	private String vulnerable;
	private String resist;
	private String immune;
	private String conditionImmune;
	private String senses;
	@JacksonXmlProperty(localName = "passive")
	private int passivePerception;
	private String languages;
	private String cr;
	@JacksonXmlProperty(localName = "trait")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCTrait[] traits;
	@JacksonXmlProperty(localName = "action")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCTrait[] actions;
	@JacksonXmlProperty(localName = "reaction")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCTrait[] reactions;
	@JacksonXmlProperty(localName = "legendary")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCTrait[] legendaries;
	private String environment;
	private String spells;
	private String slots;
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	public String getSave() {
		return save;
	}
	public void setSave(String save) {
		this.save = save;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getVulnerable() {
		return vulnerable;
	}
	public void setVulnerable(String vulnerable) {
		this.vulnerable = vulnerable;
	}
	public String getResist() {
		return resist;
	}
	public void setResist(String resist) {
		this.resist = resist;
	}
	public String getImmune() {
		return immune;
	}
	public void setImmune(String immune) {
		this.immune = immune;
	}
	public String getConditionImmune() {
		return conditionImmune;
	}
	public void setConditionImmune(String conditionImmune) {
		this.conditionImmune = conditionImmune;
	}
	public String getSenses() {
		return senses;
	}
	public void setSenses(String senses) {
		this.senses = senses;
	}
	public int getPassivePerception() {
		return passivePerception;
	}
	public void setPassivePerception(int passivePerception) {
		this.passivePerception = passivePerception;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getCr() {
		return cr;
	}
	public void setCr(String cr) {
		this.cr = cr;
	}
	public FCTrait[] getTraits() {
		return traits;
	}
	public void setTraits(FCTrait[] traits) {
		this.traits = traits;
	}
	public FCTrait[] getActions() {
		return actions;
	}
	public void setActions(FCTrait[] actions) {
		this.actions = actions;
	}
	public FCTrait[] getReactions() {
		return reactions;
	}
	public void setReactions(FCTrait[] reactions) {
		this.reactions = reactions;
	}
	public FCTrait[] getLegendaries() {
		return legendaries;
	}
	public void setLegendaries(FCTrait[] legendaries) {
		this.legendaries = legendaries;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getSpells() {
		return spells;
	}
	public void setSpells(String spells) {
		this.spells = spells;
	}
	public String getSlots() {
		return slots;
	}
	public void setSlots(String slots) {
		this.slots = slots;
	}
}
