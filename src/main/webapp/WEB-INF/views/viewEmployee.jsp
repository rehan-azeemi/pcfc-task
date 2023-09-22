<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertAttribute name="header" ignore="true" />
<div class="container m-t">
    <h2>Employee Details</h2>
    <div class="card">
            <table class="table table-hover">
                <tbody>
                <tr>
                    <td><b>First Name</b></td>
                    <td>
                        <c:out value="${employee.firstName}" />
                    </td>
                </tr>
                <tr>
                    <td><b>Last Name</b></td>
                    <td>
                        <c:out value="${employee.lastName}" />
                    </td>
                </tr>
                <tr>
                    <td><b>Date of Birth</b></td>
                    <td>
                        <c:out value="${employee.dob}" />
                    </td>
                </tr>
                <tr>
                    <td><b>Department</b></td>
                    <td>
                        <c:out value="${employee.department.departmentName}" />
                    </td>
                </tr>
                <tr>
                    <td><b>Salary</b></td>
                    <td>
                        <c:out value="${employee.salary}" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>Manager</b>
                    </td>
                    <td>
                        <c:if test="${not empty employee.manager}">
                            <c:out value="${employee.manager.firstName}" /></c:if>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
</div>
</body>

</html>