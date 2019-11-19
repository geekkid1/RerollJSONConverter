package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

/**
 * Class to support the data structure for items in the source XML. While this is not
 * utilized in the original intended implementation of this project, it may be useful for
 * some, so I included this instead of just having the mapper ignore equipment tags. You're
 * welcome.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName="equipment")
public class FCItem {
	private String name;
	private String detail;
	private String magic;
	private String type;
	private double value;
	private double weight;
	@JacksonXmlElementWrapper(useWrapping=false)
	private String[] text;
	private int ac;
	private int strength;
	private String stealth;
	private String dmg1;
	private String dmg2;
	private String dmgType;
	private String property;
	private String range;
	private String roll;
	@JacksonXmlProperty(localName = "modifier")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCModifier[] modifiers;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String[] getText() {
		return text;
	}
	public void setText(String[] text) {
		this.text = text;
	}
	public int getAc() {
		return ac;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getStealth() {
		return stealth;
	}
	public void setStealth(String stealth) {
		this.stealth = stealth;
	}
	public String getDmg1() {
		return dmg1;
	}
	public void setDmg1(String dmg1) {
		this.dmg1 = dmg1;
	}
	public String getDmg2() {
		return dmg2;
	}
	public void setDmg2(String dmg2) {
		this.dmg2 = dmg2;
	}
	public String getDmgType() {
		return dmgType;
	}
	public void setDmgType(String dmgType) {
		this.dmgType = dmgType;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public FCModifier[] getModifiers() {
		return modifiers;
	}
	public void setModifiers(FCModifier[] modifiers) {
		this.modifiers = modifiers;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getMagic() {
		return magic;
	}
	public void setMagic(String magic) {
		this.magic = magic;
	}
}
