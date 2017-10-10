<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir = "/WEB-INF/tags" prefix="alura" %>

<c:import url="/WEB-INF/jsp/header.jsp"></c:import>
<form action="${linkTo[UsuarioController].adiciona(null) }" method="POST">
	<label for="nome">Nome:</label>
	<input type="text" name="usuario.nome" id="nome" class="form-control" value="${usuario.nome}"/>
	<alura:validationMessage name="usuario.nome"></alura:validationMessage>
	
	<label for="email">Email:</label>
	<input type="email" name="usuario.email" id="email" class="form-control" value="${usuario.email}"/>
	<alura:validationMessage name="usuario.email"></alura:validationMessage>
	
	<label for="login">Login:</label>
	<input type="text" name="usuario.login" id="login" class="form-control" value="${usuario.login}"/>
	<alura:validationMessage name="usuario.login"></alura:validationMessage>
	
	<label for="senha">Senha:</label>
	<input type="password" name="usuario.senha" id="senha" class="form-control"/>
	<alura:validationMessage name="usuario.senha"></alura:validationMessage>
	
	<input type="submit" value="Cadastrar" class="btn"/>
</form>
<c:import url="/WEB-INF/jsp/footer.jsp"></c:import>