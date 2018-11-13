package idv.villebez.repository;

import org.springframework.stereotype.Component;

import idv.villebez.model.Basic;

@Component
public class BasicRepository extends GenericRepo<Long, Basic> {
    public BasicRepository() {
    		Basic basic = new Basic();
        basic.setId(123456l);
        basic.setUserName("王大明");
        basic.setIntroduction("這就是我的堅持 - 失業英雄");
        this.save(basic);
        
        basic = new Basic();
        basic.setId(999999l);
        basic.setUserName("韋小寶");
        basic.setIntroduction("不及格大學士");
        this.save(basic);
    }

}
