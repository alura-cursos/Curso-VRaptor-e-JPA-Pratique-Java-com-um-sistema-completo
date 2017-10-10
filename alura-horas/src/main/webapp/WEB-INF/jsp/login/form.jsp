<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix = "alura" %>

<c:import url="/WEB-INF/jsp/header.jsp"></c:import>
<form action="${linkTo[LoginController].autentica(null,null)}" method="POST">
	<alura:validationMessage name="Login_invaido"></alura:validationMessage>
	<label for="login">Login:</label>
	<input type="text" name="login" id="login" class="form-control"/>
	
	<label for="senha">Senha:</label>
	<input type="password" name="senha" id="senha" class="form-control"/>
	
	
	<input type="submit" value="Autenticar" class="btn"/>
</form>
<c:import url="/WEB-INF/jsp/footer.jsp"></c:import>