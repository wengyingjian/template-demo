/**
 * 
 */
package com.asd.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asd.template.dao.TestDao;

/**
 * 
 * @author <a href="mailto:wengyj@59store.com">翁英健</a>
 * @version 1.1 2015年12月3日
 * @since 1.1
 */
@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    /**
     * @param name
     * @return
     */
    public String test(String name) {
        return testDao.getResponse(name);
    }

}
