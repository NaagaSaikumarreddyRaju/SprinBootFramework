<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<html>
<body bgcolor="aqua">
    <h1>PersonList<h1/><br/><br/>
    <div>
       <table border="1">
         <tr>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Email</th>
         </tr>

         <c: forEach items="${persons}" var="person">
          <tr>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.email}</td>
          </tr>
        </c:forEach>
       </table>
    </div>
</body>
</html>