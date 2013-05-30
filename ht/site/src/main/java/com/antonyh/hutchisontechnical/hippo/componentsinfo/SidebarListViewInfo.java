package com.antonyh.hutchisontechnical.hippo.componentsinfo;

import org.hippoecm.hst.core.parameters.Parameter;

public interface SidebarListViewInfo extends ListViewInfo {
	@Parameter(name = "pageSize", defaultValue = "50", displayName = "Page Size")
	int getPageSize();

	@Parameter(name = "sortBy", displayName = "Sort By Property", defaultValue = "hippostdpubwf:publicationDate")
	String getSortBy();

	@Parameter(name = "docType", displayName = "Document Type", defaultValue = "ht:basedocument")
	String getDocType();

	@Parameter(name = "sortOrder", displayName = "Sort Order", defaultValue = "descending")
	String getSortOrder();

	@Parameter(name = "scope", defaultValue = "/", displayName = "Scope")
	String getScope();

}
