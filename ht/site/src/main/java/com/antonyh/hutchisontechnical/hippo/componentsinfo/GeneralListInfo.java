package com.antonyh.hutchisontechnical.hippo.componentsinfo;

import org.hippoecm.hst.configuration.hosting.Mount;
import org.hippoecm.hst.core.parameters.Parameter;

public interface GeneralListInfo {
	/**
	 * Returns the scope to search below. Leading and trailing slashes do not
	 * have meaning and will be skipped when using the scope. The scope is
	 * always relative to the current {@link Mount#getContentPath()}, even if it
	 * starts with a <code>/</code>
	 *
	 * @return the scope to search below
	 */
	@Parameter(name = "scope", defaultValue = "/", displayName = "Scope")
	String getScope();

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
