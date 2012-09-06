package com.antonyh.hutchisontechnical.hippo.componentsinfo;

import org.hippoecm.hst.core.parameters.Parameter;

public interface PageableListInfo extends GeneralListInfo {

	@Parameter(name = "pagesVisible", defaultValue = "true", displayName = "Show pages")
	Boolean isPagesVisible();

	@Parameter(name = "sortOrder", displayName = "Sort Order", defaultValue = "descending")
	String getSortOrder();

	@Parameter(name = "sortBy", displayName = "Sort By Property", defaultValue = "ht:date, hippostdpubwf:publicationDate")
	String getSortBy();

}
