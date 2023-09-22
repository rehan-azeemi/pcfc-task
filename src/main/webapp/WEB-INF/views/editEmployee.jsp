<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertAttribute name="header" ignore="true" />
<div class="container m-t">
    <h2>Update Employee</h2>
    <div class="card">
        <div class="card-body">
            <form:form action="/update/employee" method="post" modelAttribute="employee">
                <form:hidden path="id" name="id"/>
                <tiles:insertAttribute name="commonForm" ignore="true" />
                <div class="form-group row">
                    <label for="department" class="col-sm-2 col-form-label">Department</label>
                    <div class="col-sm-7">
                        <form:select path="department" class="form-control" name="department" placeholder="Select Department">
                            <c:forEach items="${departments}" var="dept">
                                    <c:choose>
                                        <c:when test="${dept.id eq employee.department.id}">
                                            <Option selected value="${dept.id}">${dept.departmentName}</Option>
                                        </c:when>
                                        <c:otherwise>
                                            <Option value="${dept.id}">${dept.departmentName}</Option>
                                        </c:otherwise>
                                    </c:choose>
                            </c:forEach>
                        </form:select>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="manager" class="col-sm-2 col-form-label">Manager</label>
                    <div class="col-sm-7">
                        <form:select path="manager" class="form-control" name="manager" placeholder="Select Manager">
                            <Option></Option>
                            <c:forEach items="${employees}" var="emp">
                                <c:choose>
                                    <c:when test="${not empty employee.manager && emp.id eq employee.manager.id}">
                                        <Option selected value="${emp.id}">${emp.firstName}</Option>
                                    </c:when>
                                    <c:otherwise>
                                        <Option value="${emp.id}">${emp.firstName}</Option>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </form:select>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Update</button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>