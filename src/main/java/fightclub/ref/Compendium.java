package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;


/**
 * The object class that provides the data structure for the deserialization of the root XML
 * tag in the format this tool converts from. The different objects will be serialized into JSON
 * files later in execution but this object class can be used in other settings if needed, that's why
 * they're all nicely organized, or at least I like to think they're nicely organized.
 * @author geekkid1
 *
 */
@JacksonXmlRootElement(localName = "compendium")
public class Compendium {
	@JacksonXmlProperty(isAttribute = true)
	private double version;
	
	@JacksonXmlProperty(localName = "spell")
	@JacksonXmlElementWrapper(useWrapping = false)
	private Spell[] spells;
}
