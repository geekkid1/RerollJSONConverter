package misc.conv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fightclub.ref.*;
import reroll.ref.*;
import reroll.ref.RRSpell.School;

/**
 * A class for the conversion of objects into Reroll format so it can be easily serialized into
 * JSON files that Reroll will accept in its import data function. Has built-in very lightweight
 * logging capabilities so you can easily log counts of the items converted. Logging is turned off
 * by default but can be turned on. 
 * @author geekkid1
 *
 */
public class Converter {
	/**
	 * The LoggingLevel of the Converter. Either LoggingLevel.NONE or LoggingLevel.ALL.
	 * Defaults to LoggingLevel.NONE which means it will have no extra logging by default.
	 * @see LoggingLevel
	 * @see Converter#getLoggingLevel()
	 * @see Converter#setLoggingLevel(LoggingLevel)
	 */
	private LoggingLevel loggingLevel = LoggingLevel.NONE;
	
	/**
	 * Converts a single spell into Reroll format. It is suggested to not use this
	 * method but instead use the one that converts arrays, even if you only have one.
	 * This is because Reroll wants a JSON array. Also, even if you only have one, you're probably
	 * doing it through the FCCompendium class which stores the spells as an array anyway.
	 * </br> </br>
	 * For the most part this is just for use in the other method but I wanted to make it public just
	 * in case someone wanted to use it on its own.
	 * @param spell (FCSpell) the spell to convert to Reroll format.
	 * @return (RRSpell) the resultant Reroll formatted spell ready to be serialized into JSON.
	 * @see Converter#convert(FCSpell[])
	 */
	public RRSpell convert(FCSpell spell) {
		RRSpell retSpell = new RRSpell();
		retSpell.setName(spell.getName());
		retSpell.setLevel_number(spell.getLevel());
		String school = spell.getSchool();
		try {
		if(school.equals("A")) {
			retSpell.setSchool(School.Abjuration);
		} else if(school.equals("C")) {
			retSpell.setSchool(School.Conjuration);
		} else if(school.equals("D")) {
			retSpell.setSchool(School.Divination);
		} else if(school.equals("EN")) {
			retSpell.setSchool(School.Enchantment);
		} else if(school.equals("EV")) {
			retSpell.setSchool(School.Evocation);
		} else if(school.equals("I")) {
			retSpell.setSchool(School.Illusion);
		} else if(school.equals("N")) {
			retSpell.setSchool(School.Necromancy);
		} else {
			retSpell.setSchool(School.Transmutation);
		}
		} catch (Exception e) {
			retSpell.setSchool(School.Transmutation);
		}
		String descConcat = "";
		List<String> descList = Arrays.asList(spell.getDesc());
		for(String s : descList) {
			if(!(descList.indexOf(s) == 0))
				descConcat = descConcat.concat("\n");
			descConcat = descConcat.concat(s);
		}
		retSpell.setDesc(descConcat);
		retSpell.setComponents(spell.getComponents());
		retSpell.setCasting_time(spell.getTime());
		retSpell.setDuration(spell.getDuration());
		retSpell.setRange(spell.getRange());
		return retSpell;
	}
	/**
	 * Converts an array of spells into an array of Reroll-formatted spells. This is the
	 * method you probably want to use, just based on probable use cases as well as the
	 * typing of where FCSpell and RRSpell show up in the rest of the code. Utilizes the
	 * single item convert method to make the method body smaller.
	 * @param spells (FCSpell[]) the array of spells to convert
	 * @return (RRSpell[]) the converted array of spells
	 * @see Converter#convert(FCSpell)
	 */
	public RRSpell[] convert(FCSpell[] spells) {
		RRSpell[] retSpells = new RRSpell[spells.length];
		for(int i = 0; i < spells.length; i++) {
			retSpells[i] = convert(spells[i]);
		}
		if(getLoggingLevel() == LoggingLevel.ALL)
			System.out.println("LOG: Converted " + retSpells.length + " spells.");
		return retSpells;
	}
	
	public RRFeat convert(FCFeat feat) {
		RRFeat retFeat = new RRFeat();
		retFeat.setName(feat.getName());
		String descConcat = "";
		descConcat = descConcat.concat("Prerequisite: " + feat.getPrerequisite() + "\n");
		List<String> descList = Arrays.asList(feat.getText());
		for(String s : descList) {
			descConcat = descConcat.concat("\n");
			descConcat = descConcat.concat(s);
		}
		retFeat.setDesc(descConcat);
		String[] profStrings = feat.getProficiency().split(",");
		ArrayList<RRSkill> profSkills = new ArrayList<RRSkill>();
		for(String s : Arrays.asList(profStrings)) {
			if(s.equalsIgnoreCase("Acrobatics")) {
				profSkills.add(RRSkill.Acrobatics);
			} else if(s.equalsIgnoreCase("Animal Handling")) {
				profSkills.add(RRSkill.Animal_Handling);
			} else if(s.equalsIgnoreCase("Arcana")) {
				profSkills.add(RRSkill.Arcana);
			} else if(s.equalsIgnoreCase("Athletics")) {
				profSkills.add(RRSkill.Athletics);
			} else if(s.equalsIgnoreCase("Deception")) {
				profSkills.add(RRSkill.Deception);
			} else if(s.equalsIgnoreCase("History")) {
				profSkills.add(RRSkill.History);
			} else if(s.equalsIgnoreCase("Insight")) {
				profSkills.add(RRSkill.Insight);
			} else if(s.equalsIgnoreCase("Intimidation")) {
				profSkills.add(RRSkill.Intimidation);
			} else if(s.equalsIgnoreCase("Investigation")) {
				profSkills.add(RRSkill.Investigation);
			} else if(s.equalsIgnoreCase("Medicine")) {
				profSkills.add(RRSkill.Medicine);
			} else if(s.equalsIgnoreCase("Nature")) {
				profSkills.add(RRSkill.Nature);
			} else if(s.equalsIgnoreCase("Perception")) {
				profSkills.add(RRSkill.Perception);
			} else if(s.equalsIgnoreCase("Performance")) {
				profSkills.add(RRSkill.Performance);
			} else if(s.equalsIgnoreCase("Persuasion")) {
				profSkills.add(RRSkill.Persuasion);
			} else if(s.equalsIgnoreCase("Religion")) {
				profSkills.add(RRSkill.Religion);
			} else if(s.equalsIgnoreCase("Sleight of Hand")) {
				profSkills.add(RRSkill.Sleight_of_Hand);
			} else if(s.equalsIgnoreCase("Stealth")) {
				profSkills.add(RRSkill.Stealth);
			} else if(s.equalsIgnoreCase("Survival")) {
				profSkills.add(RRSkill.Survival);
			}
			retFeat.setProficiencies((RRSkill[])profSkills.toArray());
		}
		return retFeat;
	}
	public RRFeat[] convert(FCFeat[] feats) {
		RRFeat[] retFeats = new RRFeat[feats.length];
		for(int i = 0; i < feats.length; i++) {
			retFeats[i] = convert(feats[i]);
		}
		if(getLoggingLevel() == LoggingLevel.ALL)
			System.out.println("LOG: Converted " + retFeats.length + " feats.");
		return retFeats;
	}

	
	
	public LoggingLevel getLoggingLevel() {
		return loggingLevel;
	}
	public void setLoggingLevel(LoggingLevel loggingLevel) {
		this.loggingLevel = loggingLevel;
	}
	
	public enum LoggingLevel {
		ALL,NONE;
	}

}
