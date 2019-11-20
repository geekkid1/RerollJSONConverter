package reroll.ref;

public class RRClass {
	private String name;
	private int hit_die;
	private String combat_resource;
	private int skills_count_choose;
	private RRSkill[] skills;
	private RRAbility[] saving_throws;
	private int level_for_subclass;
	private RRClassFeature[] class_features;
	private RRLevelInfo[] levels;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHit_die() {
		return hit_die;
	}
	public void setHit_die(int hit_die) {
		this.hit_die = hit_die;
	}
	public String getCombat_resource() {
		return combat_resource;
	}
	public void setCombat_resource(String combat_resource) {
		this.combat_resource = combat_resource;
	}
	public int getSkills_count_choose() {
		return skills_count_choose;
	}
	public void setSkills_count_choose(int skills_count_choose) {
		this.skills_count_choose = skills_count_choose;
	}
	public RRSkill[] getSkills() {
		return skills;
	}
	public void setSkills(RRSkill[] skills) {
		this.skills = skills;
	}
	public RRAbility[] getSaving_throws() {
		return saving_throws;
	}
	public void setSaving_throws(RRAbility[] saving_throws) {
		this.saving_throws = saving_throws;
	}
	public int getLevel_for_subclass() {
		return level_for_subclass;
	}
	public void setLevel_for_subclass(int level_for_subclass) {
		this.level_for_subclass = level_for_subclass;
	}
	public RRClassFeature[] getClass_features() {
		return class_features;
	}
	public void setClass_features(RRClassFeature[] class_features) {
		this.class_features = class_features;
	}
	public RRLevelInfo[] getLevels() {
		return levels;
	}
	public void setLevels(RRLevelInfo[] levels) {
		this.levels = levels;
	}
}
