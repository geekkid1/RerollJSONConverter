package reroll.ref;

/**
 * Class that provides the structure for serializing spells, including a School enum
 * that restricts the values of that field to the ones given in the documentation
 * in order to avoid any undue errors while serializing.
 * @author geekkid1
 *
 */
public class RRSpell {
	private String name;
	private int level_number;
	private School school;
	private String casting_time;
	private String range;
	private String components;
	private String duration;
	private String desc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel_number() {
		return level_number;
	}
	public void setLevel_number(int level_number) {
		this.level_number = level_number;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getCasting_time() {
		return casting_time;
	}
	public void setCasting_time(String casting_time) {
		this.casting_time = casting_time;
	}
	public String getRange() {
		return range;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getComponents() {
		return components;
	}
	public void setComponents(String components) {
		this.components = components;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * A simple enum that restricts the values that the school field can hold when serializing.
	 * Also makes things a bit "fancier" in that I like using things for implementations significantly
	 * less advanced than originally intended. So there.
	 * @author geekkid1
	 *
	 */
	public enum School {
		Abjuration,
		Conjuration,
		Divination,
		Enchantment,
		Evocation,
		Illusion,
		Necromancy,
		Transmutation;
	}
}
