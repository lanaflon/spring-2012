package com.acme.ex3a.domain.business;

import java.util.List;
import java.util.Map;

import com.acme.ex3a.domain.business.exception.DuplicateLoginException;
import com.acme.ex3a.domain.business.exception.InvalidDateRangeException;
import com.acme.ex3a.domain.business.filter.EmployeeFilter;
import com.acme.ex3a.domain.entity.BusinessDomain;
import com.acme.ex3a.domain.entity.Employee;
import com.acme.ex3a.domain.entity.SkillLevel;
import com.acme.ex3a.domain.entity.TechnicalDomain;

public interface EmployeeManager {

	Employee getDetails(int id);
	
	// avant de sauvegarder : 
	// v�rifier que la date de d�but est inf�rieure � la date de fin 
	// si celle-ci est renseign�e.
	// v�rifier aussi qu'un autre employ� n'a pas d�j� le m�me login
	Employee save(Employee employee) throws DuplicateLoginException, InvalidDateRangeException;
	
	List<Employee> find(EmployeeFilter filter);
	
	List<Employee> match(Map<TechnicalDomain, SkillLevel> technicalDomains, Map<BusinessDomain, SkillLevel> businessDomains);
}
