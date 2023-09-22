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
                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>