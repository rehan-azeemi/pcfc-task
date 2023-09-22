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
                <button type="submit" class="btn btn-primary">Update</button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>