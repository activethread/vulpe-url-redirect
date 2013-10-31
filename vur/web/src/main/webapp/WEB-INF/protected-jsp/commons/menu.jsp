<%@include file="/WEB-INF/protected-jsp/commons/taglibs.jsp"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="v"%>
<v:menu elementId="Index" labelKey="label.vur.menu.Index">
	<%--<v:menu elementId="Start" labelKey="label.vur.menu.Index.start" action="/${ever['vulpeCurrentLayout'] == 'FRONTEND' ? 'frontend' : 'backend'}/Index" accesskey="I"/> --%>
	<v:menu elementId="Redirect" labelKey="label.vur.menu.Index.Redirect" action="/core/Redirect/select" accesskey="R"/>
</v:menu>
