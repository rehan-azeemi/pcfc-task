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
    <label for="salary" class="col-sm-2 col-form-label">Salary</label>
    <div class="col-sm-7">
        <form:input path="salary" type="text" class="form-control" name="salary"
                    placeholder="Enter salary" required="true"/>
    </div>
</div>