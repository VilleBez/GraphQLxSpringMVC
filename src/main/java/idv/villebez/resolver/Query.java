package idv.villebez.resolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import idv.villebez.model.resp.Profile;
import idv.villebez.repository.BasicRepository;
import idv.villebez.repository.EducationRepository;
import idv.villebez.repository.ExperienceRepository;

@Component
public class Query implements GraphQLQueryResolver{
	@Autowired
	private BasicRepository basicRepository;
	@Autowired
	private EducationRepository educationRepository;
	@Autowired
	private ExperienceRepository experienceRepository;

    
    public Profile getProfile(long id) {
    		Profile profile = new Profile();
    		profile.setBasic(basicRepository.findById(id));
    		profile.setEducation(educationRepository.findByPid(id));
    		profile.setExperience(experienceRepository.findByPid(id));
        return profile;
    }
    
    public List<Profile> getProfiles(Set<Long> ids) {
    		List<Profile> result = new ArrayList<Profile>();
    		
		for(long id:ids){
			Profile profile = new Profile();
			profile.setBasic(basicRepository.findById(id));
			profile.setEducation(educationRepository.findByPid(id));
			profile.setExperience(experienceRepository.findByPid(id));
			result.add(profile);
    		}
		return result;
    }
}
