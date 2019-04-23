 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th></tr>  
   <c:forEach var="emp" items="${map}"> 
   key=${emp.key},<br>
   value=${emp.value}<br>
     <tr><td><c:out value="${emp.get(54)}"></c:out></td><c:out value="${emp.get(vital)}"></c:out></tr>
   <tr>  
   <td><c:out value="${map.get(54)}"></c:out></td>  
   <td></td>  
   </tr>  
   </c:forEach>  
   <tr><td><c:out value="${map.get(54)}"></c:out>
   </td></tr>
   </table> 
   