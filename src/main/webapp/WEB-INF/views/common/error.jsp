<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="alert alert-danger" role="alert">
    <strong>Error</strong> ${errorMessage} <c:if test="${homeRedirection}"><a href="/" class="alert-link">Go to Homepage</a></c:if>
</div>
