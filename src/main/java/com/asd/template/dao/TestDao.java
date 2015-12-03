/**
 * 
 */
package com.asd.template.dao;


import org.springframework.stereotype.Repository;

import com.asd.template.dao.mapper.TestMapper;

/**
 * 
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 2015年12月3日
 * @since 1.1
 */
@Repository
public class TestDao {

    private TestMapper masterTestMapper;

    /**
     * @param name
     * @return
     */
    public String getResponse(String name) {
        return masterTestMapper.getResponse(name);
    }

}
