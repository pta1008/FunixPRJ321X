<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<div class="container"></div>
	<div class="row">
		<div class="col-2">
			<img alt="logo" src="images/logo1.PNG" class="img-thumbnail">
		</div>
		<div class="col-10">
		<form class="mt-5">
			 <div class="form-group row">
			 		<select class="browser-default custom-select col-sm-2">
						  <option value="" selected disabled hidden>Category</option>
						  <option value="1">One</option>
						  <option value="2">Two</option>
						  <option value="3">Three</option>
					</select>
					<div class="col-sm-8">
				      <input type="text"  class="form-control">
				    </div>
				    <div class="col-sm-2">
				      <button type="button" class="form-control btn btn-dark">Search</button>
				    </div>
			 </div>
		</form>    
  	</div>
</div>

<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
  <a class="navbar-brand" href="#">Smart Phone Store</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Products</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">About Us</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
       <a class="nav-link" href="#">Login</a>
    </form>
  </div>
</nav>