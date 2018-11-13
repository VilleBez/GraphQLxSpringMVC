package idv.villebez.model.resp;

import java.util.List;

import org.springframework.context.ApplicationContext;

import idv.villebez.ApplicationContextProvider;
import idv.villebez.model.Basic;
import idv.villebez.model.Education;
import idv.villebez.model.Experience;
import idv.villebez.repository.BasicRepository;
import idv.villebez.repository.EducationRepository;
import idv.villebez.repository.ExperienceRepository;

public class Profile {
	private BasicRepository basicRepository;
	private EducationRepository educationRepository;
	private ExperienceRepository experienceRepository;
	
	Long pid;

	public Profile(long pid) {
		this.pid = pid;
		
		ApplicationContext context = ApplicationContextProvider.getApplicationContext();
		basicRepository = context.getBean(BasicRepository.class, "basicRepository");
		educationRepository = context.getBean(EducationRepository.class, "educationRepository");
		experienceRepository = context.getBean(ExperienceRepository.class, "experienceRepository");
	}

	public Basic getBasic() {
		return basicRepository.findById(pid);
	}

	public List<Experience> getAllExperience() {
		return experienceRepository.findByPid(pid);
	}

	public List<Experience> getExperience(int limit) {
		return getAllExperience().subList(0, limit);
	}

	public List<Education> getAllEducation() {
		return educationRepository.findByPid(pid);
	}

	public List<Education> getEducation(int limit) {
		return getAllEducation().subList(0, limit);
	}

}
