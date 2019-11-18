package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

/**
 * Class that provides the data structure for deserializing the "class" tag in the source XML. Such
 * tags define character classes the user can select for their character and contain values and features
 * associated with that character class.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "class")
public class FCClass {
	private String name;
	@JacksonXmlProperty(localName = "hd")
	private int hitDie;
	@JacksonXmlProperty(localName = "proficiency")
	private String classProficiencies;
	private int numSkills;
	private String armor;
	private String weapons;
	private String tools;
	private String wealth;
	private String spellAbility;
	@JacksonXmlProperty(localName = "autoLevel")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCAutoLevel[] levelFeatures;
	@JacksonXmlProperty(localName = "modifier")
	@JacksonXmlElementWrapper(useWrapping = false)
	private String[] modifiers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHitDie() {
		return hitDie;
	}
	public void setHitDie(int hitDie) {
		this.hitDie = hitDie;
	}
	public String getClassProficiencies() {
		return classProficiencies;
	}
	public void setClassProficiencies(String classProficiencies) {
		this.classProficiencies = classProficiencies;
	}
	public int getNumSkills() {
		return numSkills;
	}
	public void setNumSkills(int numSkills) {
		this.numSkills = numSkills;
	}
	public String getArmor() {
		return armor;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public String getWeapons() {
		return weapons;
	}
	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}
	public String getTools() {
		return tools;
	}
	public void setTools(String tools) {
		this.tools = tools;
	}
	public String getWealth() {
		return wealth;
	}
	public void setWealth(String wealth) {
		this.wealth = wealth;
	}
	public String getSpellAbility() {
		return spellAbility;
	}
	public void setSpellAbility(String spellAbility) {
		this.spellAbility = spellAbility;
	}
	public FCAutoLevel[] getLevelFeatures() {
		return levelFeatures;
	}
	public void setLevelFeatures(FCAutoLevel[] levelFeatures) {
		this.levelFeatures = levelFeatures;
	}
	public String[] getModifiers() {
		return modifiers;
	}
	public void setModifiers(String[] modifiers) {
		this.modifiers = modifiers;
	}
}
