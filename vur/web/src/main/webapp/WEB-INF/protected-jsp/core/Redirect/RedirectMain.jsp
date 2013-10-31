<%@include file="/WEB-INF/protected-jsp/commons/taglibs.jsp" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="v"%>

<v:hidden property="id"/>
<v:text
	labelKey="label.vur.core.Redirect.main.code"
	property="code"
	size="50"
	maxlength="100"
	required="true"
/>
<v:text
	labelKey="label.vur.core.Redirect.main.toURL"
	property="toURL"
	size="100"
	maxlength="1000"
	required="true"
/>
<v:text
	labelKey="label.vur.core.Redirect.main.description"
	property="description"
	size="100"
	maxlength="1000"
	required="true"
/>
