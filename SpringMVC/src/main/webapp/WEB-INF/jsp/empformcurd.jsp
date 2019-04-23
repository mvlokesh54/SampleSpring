<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action="savecurd" method="post">
<table>
<tr>
<td>Name : </td>
<td><form:input path="name" ></form:input> </td>
</tr>
<tr>
<td>Salary : </td>
<td><form:input path="salary" ></form:input> </td>
</tr>
<tr>
<td>Designation : </td>
<td><form:input path="designation" ></form:input> </td>
</tr>
<tr>
  <td colspan="2"><input type="submit" name="save" /></td>
</tr>
</table>
</form:form>