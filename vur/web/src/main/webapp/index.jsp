<%@include file="/WEB-INF/protected-jsp/commons/taglibs.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="CODE" value=""/>
<c:forEach var="parameter" items="${param}" begin="0" end="1">
      <c:set var="CODE" value="${parameter.key}"/>
</c:forEach>
<c:choose>
	<c:when test="${not empty ever['vulpeCurrentLayout'] && ever['vulpeCurrentLayout'] == 'BACKEND'}">
		<c:redirect url="/backend/Index">
			<c:if test="${not empty CODE}">
				<c:param name="CODE" value="${CODE}"/>
			</c:if>
		</c:redirect>
	</c:when>
	<c:otherwise>
		<c:redirect url="/frontend/Index">
			<c:if test="${not empty CODE}">
				<c:param name="CODE" value="${CODE}"/>
			</c:if>
		</c:redirect>
	</c:otherwise>
</c:choose>