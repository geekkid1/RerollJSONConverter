package reroll.ref;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The class that allows storing of information regarding level increases. This is just basic information,
 * like the proficiency bonus and spell slots.
 * @author geekkid1
 *
 */
public class RRLevelInfo {
	private int number;
	private int prof_bonus;
	@JsonInclude(Include.NON_EMPTY)
	private int[] spells_levels;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getProf_bonus() {
		return prof_bonus;
	}
	public void setProf_bonus(int prof_bonus) {
		this.prof_bonus = prof_bonus;
	}
	public int[] getSpells_levels() {
		return spells_levels;
	}
	public void setSpells_levels(int[] spells_levels) {
		this.spells_levels = spells_levels;
	}
}
