<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertAttribute name="header" ignore="true" />
<div class="container m-t">
    <h2>Employee Registeration</h2>
    <div class="card">
        <div class="card-body">
            <c:if test="${not empty errorMessage}">
                <tiles:insertAttribute name="error" ignore="true" />
            </c:if>
            <form:form action="/save/employee" method="post" modelAttribute="employee">
                <tiles:insertAttribute name="commonForm" ignore="true" />
                <div class="form-group row">
                    <label for="department" class="col-sm-2 col-form-label">Department</label>
                    <div class="col-sm-7">
                        <form:select path="department" class="form-control" name="department" placeholder="Select Department">
                            <c:forEach items="${departments}" var="department">
                                <Option value="${department.id}">${department.departmentName}</Option>
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
                                <Option value="${emp.id}">${emp.firstName}</Option>
                            </c:forEach>
                        </form:select>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>