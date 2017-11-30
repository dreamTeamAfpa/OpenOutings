<!-- taglibs a inclure dans toutes les pages -->
<%@include file="/views/taglibs.jsp"%>

<table border="1" id="iTable">
	<c:forEach var="myUser" items="${user}">
		<tr>
		
			<td><c:out value="${myUser.lastName}" /></td>
			<td><c:out value="${myUser.fisrtName}" /></td>
			
		</tr>
	</c:forEach>
</table>