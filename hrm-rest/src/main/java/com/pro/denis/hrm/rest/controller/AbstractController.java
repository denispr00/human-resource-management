package com.pro.denis.hrm.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pro.denis.hrm.domain.AbstractDomain;
import com.pro.denis.hrm.service.business.AbstractService;

public abstract class AbstractController<T extends AbstractDomain> {

	public abstract AbstractService<T> getService();

	public abstract Class<T> getClassT();

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	protected T add(@RequestBody T entity) {
		return getService().add(entity);

	}

	@RequestMapping(path = "/retrieveById", method = RequestMethod.GET)
	protected T retrieveById(@RequestParam(name = "id") Long id) {
		return getService().retrieveById(id, getClassT());
	}

	@RequestMapping(path = "/retrieveList", method = RequestMethod.POST)
	protected @ResponseBody List<T> retrieveList() {
		return getService().retrieveList();
	}

	/**
	 * used to check if variable page and size are filled else assign 0 to
	 * Integer.MAX_VALUE respectively
	 * 
	 * @param page
	 * @param size
	 * @return pageRequest
	 */
	/*protected PageRequest checkPageIfNull(Integer page, Integer size) {
	
		PageRequest pageRequest = new PageRequest(page, size);
	
		return pageRequest;
	}*/

	/**
	 * apply sort list to the page request
	 * 
	 * @param pageRequest
	 * @param sortList
	 * @return pageRequest
	 */
	/*protected PageRequest applySortAndPage(Integer page, Integer size,String sort) {
		Integer pageFinal = page==null?0:page;
		Integer sizeFinal = size==null?Integer.MAX_VALUE:size;
	
		PageRequest pageRequest;
		if (StringUtils.isEmpty(sort))
			pageRequest = new PageRequest(pageFinal, sizeFinal);
		else
			pageRequest = new PageRequest(pageFinal, sizeFinal, Sort.Direction.ASC, sort);
			 
		return pageRequest;
	}*/

}
