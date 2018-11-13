package idv.villebez.model.resp;

import java.util.List;

import idv.villebez.model.Basic;
import idv.villebez.model.Education;
import idv.villebez.model.Experience;

public class Profile {
	Basic basic;
	List<Experience> experience;
	List<Education> education;

	public Basic getBasic() {
		return basic;
	}

	public void setBasic(Basic basic) {
		this.basic = basic;
	}

	public List<Experience> getAllExperience() {
		return experience;
	}

	public List<Experience> getExperience(int first) {
		return experience.subList(0, first);
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}

	public List<Education> getAllEducation() {
		return education;
	}

	public List<Education> getEducation(int first) {
		return education.subList(0, first);
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

}
