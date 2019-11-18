package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

@JacksonXmlRootElement(localName = "compendium")
public class Compendium {
	@JacksonXmlProperty(isAttribute = true)
	private double version;
}
