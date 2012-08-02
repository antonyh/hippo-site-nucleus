package com.antonyh.hutchisontechnical.hippo.componentsinfo;

import org.hippoecm.hst.core.parameters.Parameter;

public interface SidebarListViewInfo extends ListViewInfo {
	@Parameter(name = "pageSize", defaultValue = "5", displayName = "Page Size")
	int getPageSize();

	@Parameter(name = "sortBy", displayName = "Sort By Property", defaultValue = "hippostdpubwf:publicationDate")
	String getSortBy();

	@Parameter(name = "FilterMustInclude", displayName = "Filter Must Include", defaultValue = "image")
	String getFilterMustInclude();

	@Parameter(name = "sortOrder", displayName = "Sort Order", defaultValue = "descending")
	String getSortOrder();

}
