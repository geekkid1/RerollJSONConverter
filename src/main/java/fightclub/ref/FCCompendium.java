package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

/**
 * The object class that provides the data structure for the deserialization of the root XML
 * tag for the format this tool converts from. The different objects will be serialized into JSON
 * files later in execution but this object class can be used in other settings if needed, that's why
 * they're all nicely organized, or at least I like to think they're nicely organized. </br> </br>
 * 
 * In order to get it to process all of the information in the xml document properly, make sure all of the
 * tags of each type are in one "block". It reads in these blocks and if it encounters a new one it discards
 * what it had and only capture the data contained in the last encountered block of that type.
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

	@JacksonXmlProperty(localName = "item")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCItem[] items;
	
	@JacksonXmlProperty(localName = "class")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCClass[] classes;
	
	@JacksonXmlProperty(localName = "monster")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCCreature[] bestiary;
	
	@JacksonXmlProperty(localName = "background")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCBackground[] backgrounds;
	
	@JacksonXmlProperty(localName = "feat")
	@JacksonXmlElementWrapper(useWrapping = false)
	private FCFeat[] feats;

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

	public FCItem[] getItems() {
		return items;
	}

	public void setItems(FCItem[] items) {
		this.items = items;
	}

	public FCClass[] getClasses() {
		return classes;
	}

	public void setClasses(FCClass[] classes) {
		this.classes = classes;
	}

	public FCCreature[] getBestiary() {
		return bestiary;
	}

	public void setBestiary(FCCreature[] bestiary) {
		this.bestiary = bestiary;
	}

	public FCBackground[] getBackgrounds() {
		return backgrounds;
	}

	public void setBackgrounds(FCBackground[] backgrounds) {
		this.backgrounds = backgrounds;
	}

	public FCFeat[] getFeats() {
		return feats;
	}

	public void setFeats(FCFeat[] feats) {
		this.feats = feats;
	}
}
