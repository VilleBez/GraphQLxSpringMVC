package idv.villebez.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import idv.villebez.model.resp.Profile;

@Component
public class Query implements GraphQLQueryResolver{
	
    public Profile getProfile(long pid) {
        return new Profile(pid);
    }
}
