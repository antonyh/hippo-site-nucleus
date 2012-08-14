package com.antonyh.hutchisontechnical.hippo.componentsinfo;

import org.hippoecm.hst.core.parameters.Parameter;

public interface GeneralListInfo {

	@Parameter(name = "title", displayName = "The title of the page", defaultValue = "Overview")
	String getTitle();

	@Parameter(name = "pageSize", displayName = "Page Size", defaultValue = "10")
	int getPageSize();

	@Parameter(name = "docType", displayName = "Document Type", defaultValue = "ht:basedocument")
	String getDocType();

	@Parameter(name = "sortBy", displayName = "Sort By Property", defaultValue = "date")
	String getSortBy();

	@Parameter(name = "sortOrder", displayName = "Sort Order", defaultValue = "descending")
	String getSortOrder();

}
