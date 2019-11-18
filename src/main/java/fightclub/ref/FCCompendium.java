package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;


/**
 * The object class that provides the data structure for the deserialization of the root XML
 * tag for the format this tool converts from. The different objects will be serialized into JSON
 * files later in execution but this object class can be used in other settings if needed, that's why
 * they're all nicely organized, or at least I like to think they're nicely organized.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "compendium")
public class FCCompendium {
	@JacksonXmlProperty(isAttribute = true)
	private double version;
	
	@JacksonXmlProperty(localName = "spell")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCSpell[] spells;
	
	@JacksonXmlProperty(localName = "race")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCRace[] races;

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public FCSpell[] getSpells() {
		return spells;
	}

	public void setSpells(FCSpell[] spells) {
		this.spells = spells;
	}

	public FCRace[] getRaces() {
		return races;
	}

	public void setRaces(FCRace[] races) {
		this.races = races;
	}
	
	
}
