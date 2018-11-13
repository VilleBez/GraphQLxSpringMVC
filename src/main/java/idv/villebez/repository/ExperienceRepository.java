package idv.villebez.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

import idv.villebez.model.Experience;

@Component
public class ExperienceRepository extends GenericRepo<Long, Experience> {
    public ExperienceRepository() {
    		Experience exp = new Experience();
    		exp.setId(RandomUtils.nextLong());
    		exp.setPid(123456l);
    		exp.setCompanyName("壹零肆資訊科技公司");
    		exp.setDescription("Ctrl + C and Ctrl + V");
    		exp.setJobName("計算機語言學家");
    		exp.setStartYear(2015);
    		exp.setStartMonth(4);
    		exp.setEndYear(2018);
    		exp.setEndMonth(12);
    		exp.setLocation("新店");
        
        this.save(exp);
        
        exp = new Experience();
        exp.setId(RandomUtils.nextLong());
        exp.setPid(123456l);
		exp.setCompanyName("台灣積體電路");
		exp.setDescription("阿雞阿雞阿雞");
		exp.setJobName("計算機學家");
		exp.setStartYear(2012);
		exp.setStartMonth(2);
		exp.setEndYear(2015);
		exp.setEndMonth(4);
		exp.setLocation("台灣");
		this.save(exp);
		
		exp = new Experience();
		exp.setId(RandomUtils.nextLong());
        exp.setPid(999999l);
		exp.setCompanyName("XXXX");
		exp.setDescription("OOOO");
		exp.setJobName("OX 科學家");
		exp.setStartYear(2012);
		exp.setStartMonth(2);
		exp.setEndYear(2018);
		exp.setEndMonth(4);
		exp.setLocation("宇宙");
		this.save(exp);
    }
    
    public List<Experience> findByPid(long id) {
		List<Experience> exps = new ArrayList<Experience>();
		for(Experience exp:mockData.values()){
			if(exp.getPid().equals(id)) exps.add(exp);
		}
		return exps;
	}

}
