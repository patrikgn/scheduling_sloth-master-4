
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form>
	<%-- Form fields for the cohorts's attributes --%>
	<s:hidden name="cohort.id"/>
	<s:textfield name="cohort.name" key="lbl.name" size="40" maxlength="100" requiredLabel="true"/>
	<s:textfield name="cohort.major" key="lbl.major" size="30" maxlength="80" requiredLabel="true"/>
    <s:textfield name="cohort.year" key="lbl.year" size="4" maxlength="4" requiredLabel="true"/>

	<%-- The buttons --%>
	<s:submit key="btn.save" action="SaveCohort"/>
	<s:submit key="btn.cancel" action="CancelCohort"/>
</s:form>