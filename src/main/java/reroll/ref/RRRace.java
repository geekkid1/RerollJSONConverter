package reroll.ref;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The object class that contains the data structure for serializing information about
 * character races into the application Reroll. This includes all of the traits a normal
 * DnD race might have as well as an optional array of assignable flexible ability score
 * bonuses similar to what the Half-Elf race gets in 5th edition DnD.
 * @author geekkid1
 *
 */
public class RRRace {
	private String name;
	private int speed;
	private int[] ability_bonuses;
	@JsonInclude(Include.NON_EMPTY)
	private int[] flex_ability_bonuses;
	private RRRacialTrait[] traits;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int[] getAbility_bonuses() {
		return ability_bonuses;
	}
	public void setAbility_bonuses(int[] ability_bonuses) {
		this.ability_bonuses = ability_bonuses;
	}
	public int[] getFlex_ability_bonuses() {
		return flex_ability_bonuses;
	}
	public void setFlex_ability_bonuses(int[] flex_ability_bonuses) {
		this.flex_ability_bonuses = flex_ability_bonuses;
	}
	public RRRacialTrait[] getTraits() {
		return traits;
	}
	public void setTraits(RRRacialTrait[] traits) {
		this.traits = traits;
	}
}
