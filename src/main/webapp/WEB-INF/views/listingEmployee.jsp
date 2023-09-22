<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertAttribute name="header" ignore="true" />
<div class="container m-t">
<table id="employees" class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Date of Birth</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Manager</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employees}" var="employee">
    <tr>
        <td>${employee.firstName}</td>
        <td>${employee.lastName}</td>
        <td>${employee.dob}</td>
        <td>${employee.department.departmentName}</td>
        <td>${employee.salary}</td>
        <td>${employee.manager.firstName}</td>
        <td><a href="/edit/employee/${employee.id}">Edit</a> / <a href="/view/employee/${employee.id}">View</a></td>
    </tr>
    </c:forEach>
    </tfoot>
</table>
    </div>
</body>
</html>
<script>
    $(document).ready(function() {
        $('#employees').DataTable();
    });
</script>
