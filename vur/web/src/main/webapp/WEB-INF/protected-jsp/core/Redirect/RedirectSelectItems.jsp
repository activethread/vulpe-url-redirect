<%@include file="/WEB-INF/protected-jsp/commons/taglibs.jsp" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="v"%>

<v:table>
	<jsp:attribute name="tableHeader">
		<th colspan="9"><fmt:message key="label.vur.core.Redirect.select.header"/></th>
	</jsp:attribute>
	<jsp:attribute name="tableBody">
		<v:row>
			<v:column
				labelKey="label.vur.core.Redirect.select.code"
				property="code"
				sort="true"
			/>
			<v:column
				labelKey="label.vur.core.Redirect.select.toURL"
				property="toURL"
				sort="true"
			/>
			<v:column
				labelKey="label.vur.core.Redirect.select.description"
				property="description"
				sort="true"
			/>
			<v:column
				labelKey="label.vur.core.Redirect.select.views"
				property="views"
				sort="true"
			/>
		</v:row>
	</jsp:attribute>
	<jsp:attribute name="tableFooter">
		<th colspan="9"><fmt:message key="vulpe.total.records"/>&nbsp;<v:paging showSize="true"/></th>
	</jsp:attribute>
</v:table>
