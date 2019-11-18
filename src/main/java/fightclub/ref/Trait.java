package fightclub.ref;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

public class Trait {
	private String name;
	@JacksonXmlProperty(localName = "text")
	private String desc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
