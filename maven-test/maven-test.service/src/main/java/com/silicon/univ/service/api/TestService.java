package com.silicon.univ.service.api;

import com.silicon.univ.domain.SampleObject;

/**
 * User: Andrew
 * Date: 6/20/13
 */
public interface TestService {
    
    public SampleObject getSampleObjectById(Long id) throws Exception;
}
