package com.lm.mapping;

import org.springframework.stereotype.Component;

@Component
public interface MesMapper {
	
	int countMesList(String mesId);
	
	int insertMes(String mesId);
}
