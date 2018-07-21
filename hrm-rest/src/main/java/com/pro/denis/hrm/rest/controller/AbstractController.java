package com.pro.denis.hrm.rest.controller;

public class AbstractController {

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
