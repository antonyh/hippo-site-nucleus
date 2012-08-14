package com.antonyh.hutchisontechnical.hippo.componentsinfo;

import org.hippoecm.hst.core.parameters.Parameter;

public interface TopicPageListInfo extends ListViewInfo {

	@Parameter(name = "title", displayName = "The title of the page", defaultValue = "Topics")
	String getTitle();

	@Parameter(name = "pageSize", displayName = "Page Size", defaultValue = "250")
	int getPageSize();

	@Parameter(name = "docType", displayName = "Document Type", defaultValue = "ht:basedocument")
	String getDocType();

	@Parameter(name = "sortBy", displayName = "Sort By Property", defaultValue = "ht:title")
	String getSortBy();

	@Parameter(name = "sortOrder", displayName = "Sort Order", defaultValue = "descending")
	String getSortOrder();

}
