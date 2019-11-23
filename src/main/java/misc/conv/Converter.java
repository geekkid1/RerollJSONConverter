package misc.conv;

import java.io.PrintStream;
import java.util.*;

import fightclub.ref.*;
import reroll.ref.*;
import reroll.ref.RRSpell.School;

/**
 * A class for the conversion of objects into Reroll format so it can be easily serialized into
 * JSON files that Reroll will accept in its import data function. Has built-in very lightweight
 * logging capabilities so you can easily log counts of the items converted. Logging is turned off
 * by default but can be turned on easily with a single method call.
 * @author geekkid1
 *
 */
public class Converter {
	/**
	 * The Logging Level of the Converter. Either {@code LoggingLevel.NONE} or {@code LoggingLevel.ALL}.
	 * Defaults to {@code LoggingLevel.NONE} which means it will have no extra logging by default.
	 * @see LoggingLevel
	 * @see Converter#getLoggingLevel()
	 * @see Converter#setLoggingLevel(LoggingLevel)
	 * @see Converter#logOutput
	 */
	private LoggingLevel loggingLevel = LoggingLevel.NONE;
	/**
	 * The {@code PrintStream} through which logging information will be sent. Defaults 
	 * to {@code System.out}.
	 * @see Converter#getLogOutput()
	 * @see Converter#setLogOutput(OutputStream)
	 * @see Converter#loggingLevel
	 */
	private PrintStream logOutput = System.out;
	
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
	 * @see RRSpell
	 * @see FCSpell
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
	 * @see RRSpell
	 * @see FCSpell
	 */
	public RRSpell[] convert(FCSpell[] spells) {
		RRSpell[] retSpells = new RRSpell[spells.length];
		for(int i = 0; i < spells.length; i++) {
			retSpells[i] = convert(spells[i]);
		}
		if(getLoggingLevel() == LoggingLevel.ALL)
			logOutput.println("LOG: Converted " + retSpells.length + " spells.");
		return retSpells;
	}
	
	/**
	 * Converts a single feat into Reroll format. It is not recommended to use
	 * this method because it is more likely you are working with an array or other
	 * structure storing your feats so you should instead use the version of this
	 * method that takes in and converts an array of feats.
	 * @param feat (FCFeat) the feat to be converted
	 * @return (RRFeat) the converted feat
	 * @see Converter#convert(FCFeat[])
	 * @see RRFeat
	 * @see FCFeat
	 */
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
	/**
	 * Converts an array of FCFeat objects into an array of RRFeat objects, using the
	 * single convert method to aid in this. Most likely, if you're converting even one
	 * feat, you want to use this method to do it. Reroll takes JSON arrays, even if it
	 * consists of only a single object. If logging is enabled, it logs the number of feats
	 * converted in the method call.
	 * @param feats (FCFeat[]) the array of FCFeat objects to convert
	 * @return (RRFeat[]) the finished converted array of feats
	 * @see Converter#convert(FCFeat)
	 * @see RRFeat
	 * @see FCFeat
	 */
	public RRFeat[] convert(FCFeat[] feats) {
		RRFeat[] retFeats = new RRFeat[feats.length];
		for(int i = 0; i < feats.length; i++) {
			retFeats[i] = convert(feats[i]);
		}
		if(getLoggingLevel() == LoggingLevel.ALL)
			logOutput.println("LOG: Converted " + retFeats.length + " feats.");
		return retFeats;
	}

	/**
	 * Converts a single race into Reroll format. As with the other single
	 * object methods, please do not use this method. I have provided it as public
	 * in case someone really really wants to use it but in most use cases you should
	 * use the array converter instead, it's really much more efficient.
	 * @param race ({@link FCRace}) the race to be converted into Reroll format
	 * @return ({@link RRRace}) the resultant Reroll-format race after conversion
	 * @see FCRace
	 * @see RRRace
	 * @see Converter#convert(FCFeat[])
	 */
	public RRRace convert(FCRace race) {
		RRRace retRace = new RRRace();
		retRace.setName(race.getName());
		int[] abilIncrease = new int[6];
		for(int i = 0; i < 6; i++) abilIncrease[i] = 0;
		String[] splitString = race.getAbilityAdj().split(",");
		for(int i = 0; i < splitString.length; i++) {
			if(splitString[i].startsWith("Str")||splitString[i].startsWith("Str",1))
				abilIncrease[0] = Integer.parseInt(splitString[i].substring(splitString.length-1));
			else if(splitString[i].startsWith("Dex")||splitString[i].startsWith("Dex",1))
				abilIncrease[0] = Integer.parseInt(splitString[i].substring(splitString.length-1));
			else if(splitString[i].startsWith("Con")||splitString[i].startsWith("Con",1))
				abilIncrease[0] = Integer.parseInt(splitString[i].substring(splitString.length-1));
			else if(splitString[i].startsWith("Int")||splitString[i].startsWith("Int",1))
				abilIncrease[0] = Integer.parseInt(splitString[i].substring(splitString.length-1));
			else if(splitString[i].startsWith("Wis")||splitString[i].startsWith("Wis",1))
				abilIncrease[0] = Integer.parseInt(splitString[i].substring(splitString.length-1));
			else if(splitString[i].startsWith("Cha")||splitString[i].startsWith("Cha",1))
				abilIncrease[0] = Integer.parseInt(splitString[i].substring(splitString.length-1));
		}
		retRace.setAbility_bonuses(abilIncrease);
		retRace.setSpeed(race.getSpeed());
		ArrayList<RRRacialTrait> traitsList = new ArrayList<RRRacialTrait>();
		for(FCTrait t : Arrays.asList(race.getTraits())) {
			RRRacialTrait r = new RRRacialTrait();
			r.setName(t.getName());
			String descConcat = "";
			List<String> descList = Arrays.asList(t.getDesc());
			for(String s : descList) {
				if(descList.indexOf(s) != 0) descConcat = descConcat.concat("\n");
				descConcat = descConcat.concat(s);
			}
			r.setDesc(descConcat);
			traitsList.add(r);
		}
		retRace.setTraits((RRRacialTrait[])traitsList.toArray());
		return retRace;
	}
	/**
	 * Converts an array of race objects into Reroll format. As with the other
	 * array methods, this is the recommended method to use as it covers the
	 * most common use cases (converting to be used in Reroll JSON). Array goes
	 * in, array comes out. Simple as that.
	 * @param races ({@link FCRace FCRace[]}) the array of races to be converted into Reroll format
	 * @return ({@link RRRace RRRace[]}) the resultant array of races, properly converted into Reroll format
	 */
	public RRRace[] convert(FCRace[] races) {
		RRRace[] retRaces = new RRRace[races.length];
		for(int i = 0; i < races.length; i++) {
			retRaces[i] = convert(races[i]);
		}
		if(getLoggingLevel() == LoggingLevel.ALL) 
			logOutput.println("LOG: Converted " + retRaces.length + " races");
		return retRaces;
	}
	
	/**
	 * Convert an entire compendium into Reroll format. Arrays of Reroll-formatted objects ready
	 * to be written to their individual JSON files as originally intended. A nice, concise, single
	 * method to reduce the amount of method calls in your program. I do hope you enjoy.
	 * @param compendium ({@link FCCompendium}) a compendium object in the format of the source XML
	 * @return ({@link RRCompendium}) a compendium object converted into the format of Reroll JSON (almost,
	 * still needs to be separated into files and zipped.)
	 * @see FCCompendium
	 * @see RRCompendium
	 */
	
	public RRCompendium convert(FCCompendium compendium) {
		RRCompendium retCompendium = new RRCompendium();
		retCompendium.setSpells(convert(compendium.getSpells()));
		retCompendium.setFeats(convert(compendium.getFeats()));
		retCompendium.setRaces(convert(compendium.getRaces()));
		return retCompendium;
	}
	
	/**
	 * Gets the current logging level.
	 * @return ({@link LoggingLevel}) the current logging level of the Converter
	 * @see Converter#setLoggingLevel(LoggingLevel)
	 */
	public LoggingLevel getLoggingLevel() {
		return loggingLevel;
	}
	/**
	 * Changes the current logging level.
	 * @param loggingLevel ({@link LoggingLevel}) the new desired logging level 
	 * @see Converter#getLoggingLevel()
	 */
	public void setLoggingLevel(LoggingLevel loggingLevel) {
		this.loggingLevel = loggingLevel;
	}
	
	/**
	 * Provides the PrintStream that the Converter will log information to
	 * @return ({@link PrintStream}) the PrintStream that will be logged to
	 * @see Converter#logOutput
	 * @see Converter#setLogOutput(PrintStream)
	 */
	public PrintStream getLogOutput() {
		return logOutput;
	}
	/**
	 * Allows the user to change the PrintStream that information is logged
	 * to by the Converter. Currently the only information that is logged is
	 * the amount of items converted in a method call.
	 * @param logOutput ({@link PrintStream}) the PrintStream to be logged to in the future.
	 * @see Converter#logOutput
	 * @see Converter#getLogOutput()
	 */
	public void setLogOutput(PrintStream logOutput) {
		this.logOutput = logOutput;
	}
	
	
	/**
	 * An enum representing the level of logging for the converter. Either
	 * ALL or NONE. ALL logs everything it can, NONE logs nothing. More levels
	 * coming soon as converter becomes more advanced. Right now only loggable
	 * data is the number of items converted in a given method call.
	 * @author geekkid1
	 * @see Converter#getLoggingLevel()
	 * @see Converter#setLoggingLevel(LoggingLevel)
	 */
	public enum LoggingLevel {
		ALL,NONE;
	}

} // end class block
