<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insertAttribute name="header" ignore="true" />
<c:if test="${empty errorMessage}">
<div class="container-fluid p-0">
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img class="d-block w-100 h-50" src="/assets/images/1.jpg" alt="First slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100 h-50" src="/assets/images/2.jpg" alt="Second slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100 h-50" src="/assets/images/3.jpg" alt="Third slide">
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
</div>
<div class="container m-t">
    <h3 class="text-center">Our Services</h3>
    <div class="row">
        <div class="col-md-6">
            <div class="text-center">
                    <div class="card text-center">
                        <div class="card-body">
                            <h5 class="card-title">Add Employee</h5>
                            <p class="card-text">This menu is used to add a new employee in our system</p>
                            <a href="/new/employee" class="card-link">Go to Service</a>
                        </div>
                    </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="text-center">
                    <div class="card text-center">
                        <div class="card-body">
                            <h5 class="card-title">Listings Employee</h5>
                            <p class="card-text">This menu is used to view all employees in our system</p>
                            <a href="/listing/employee" class="card-link">Go to Service</a>
                        </div>
                    </div>
            </div>
        </div>
    </div>
</div>
</c:if>
<c:if test="${not empty errorMessage}">
    <div class="container m-t">
        <tiles:insertAttribute name="error" ignore="true" />
    </div>
</c:if>
</body>
</html>