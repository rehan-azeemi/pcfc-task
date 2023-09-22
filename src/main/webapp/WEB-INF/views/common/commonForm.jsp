<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="form-group row">
    <label for="firstName" class="col-sm-2 col-form-label">First Name</label>
    <div class="col-sm-7">
        <form:input path="firstName" type="text" class="form-control" name="firstName"
                    placeholder="Enter first name" required="true"/>
    </div>
</div>

<div class="form-group row">
    <label for="lastName" class="col-sm-2 col-form-label">Last Name</label>
    <div class="col-sm-7">
        <form:input path="lastName" type="text" class="form-control" name="lastName"
                    placeholder="Enter last name" required="true"/>
    </div>
</div>

<div class="form-group row">
    <label for="dob" class="col-sm-2 col-form-label">Date of Birth</label>
    <div class="col-sm-7">
        <form:input path="dob" type="date" class="form-control" name="dob"
                    placeholder="Enter date of birth" required="true"/>
    </div>
</div>
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
    <label for="salary" class="col-sm-2 col-form-label">Salary</label>
    <div class="col-sm-7">
        <form:input path="salary" type="text" class="form-control" name="salary"
                    placeholder="Enter salary" required="true"/>
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