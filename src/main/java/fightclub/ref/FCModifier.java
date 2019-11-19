package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

public class FCModifier {
	@JacksonXmlProperty(isAttribute = true)
	private String category;
	@JacksonXmlText
	private String value;

}
