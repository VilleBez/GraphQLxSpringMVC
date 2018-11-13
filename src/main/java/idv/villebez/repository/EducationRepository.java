package idv.villebez.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

import idv.villebez.model.Education;

@Component
public class EducationRepository extends GenericRepo<Long, Education> {
    public EducationRepository() {
    		Education edu = new Education();
    		edu.setId(RandomUtils.nextLong());
    		edu.setPid(108199l);
    		edu.setSchoolName("私立壹零肆科技大學");
    		edu.setMajorName("人力暨職涯發展學系");
    		edu.setLocation("新店");
    		edu.setDegree(3);
    		edu.setStartYear(2015);
    		edu.setStartMonth(6);
    		edu.setEndYear(2018);
    		edu.setEndMonth(9);
    		
    		this.save(edu);
    		
    		edu = new Education();
    		edu.setId(RandomUtils.nextLong());
    		edu.setPid(108199l);
    		edu.setSchoolName("台灣大學");
    		edu.setMajorName("社會學系");
    		edu.setLocation("公館");
    		edu.setDegree(5);
    		edu.setStartYear(2012);
    		edu.setStartMonth(6);
    		edu.setEndYear(2015);
    		edu.setEndMonth(9);
    		
    		this.save(edu);
    		
    		edu = new Education();
    		edu.setId(RandomUtils.nextLong());
    		edu.setPid(100604l);
    		edu.setSchoolName("OXX 大學");
    		edu.setMajorName("XO 學系");
    		edu.setLocation("地球");
    		edu.setDegree(99);
    		edu.setStartYear(2012);
    		edu.setStartMonth(6);
    		edu.setEndYear(2015);
    		edu.setEndMonth(9);
    		
    		this.save(edu);
    }

	public List<Education> findByPid(long id) {
		List<Education> edus = new ArrayList<Education>();
		for(Education edu:mockData.values()){
			if(edu.getPid().equals(id)) edus.add(edu);
		}
		return edus;
	}

}
