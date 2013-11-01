<%@ attribute name="action" required="false" rtexprvalue="true" %>
<%@ attribute name="afterJs" required="false" rtexprvalue="true" %>
<%@ attribute name="beforeJs" required="false" rtexprvalue="true" %>
<%@ attribute name="labelKey" required="true" rtexprvalue="true" %>
<%@ attribute name="elementId" required="false" rtexprvalue="true" %>
<%@ attribute name="icon" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="roles" required="false" rtexprvalue="true" type="java.lang.String"%>
<%@ attribute name="popupId" required="false" rtexprvalue="true" %>
<%@ attribute name="paramExpressions" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="paramLayerParent" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="paramProperties" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="paramTargetName" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="popupExpressions" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="popupLayerParent" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="popupProperties" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="popupTargetName" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="popupWidth" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="queryString" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="requiredParamExpressions" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="requiredParamProperties" required="false" rtexprvalue="true" type="java.lang.String" %>
<%@ attribute name="showOnlyIfAuthenticated" required="false" rtexprvalue="true" type="java.lang.Boolean" %>
<%@ attribute name="styleClass" required="false" rtexprvalue="true" %>
<%@include file="/WEB-INF/protected-jsp/commons/tags/popupTag.jsp" %>