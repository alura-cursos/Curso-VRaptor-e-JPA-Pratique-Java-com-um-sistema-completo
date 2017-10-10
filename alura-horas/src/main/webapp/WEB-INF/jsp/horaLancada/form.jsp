<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix = "alura" %>

<c:import url="/WEB-INF/jsp/header.jsp"></c:import>
<form action="${linkTo[HoraLancadaController].adiciona(null)}" method="POST">
	<label for="data">Data:</label>
	<input type="text" id="data" name="horaLancada.data" class="form-control"/>
	<alura:validationMessage name="horaLancada.data"/>
	
	<label for="horaInicial">Data:</label>
	<input type="text" id="horaInicial" name="horaLancada.horaInicial" class="form-control"/>
	<alura:validationMessage name="horaLancada.horaInicial"/>
	
	<label for="horaFinal">Data:</label>
	<input type="text" id="horaFinal" name="horaLancada.horaFinal" class="form-control"/>
	<alura:validationMessage name="horaLancada.horaFinal"/>
	
	<input type="submit" value="cadastrar"/>	
</form>
<c:import url="/WEB-INF/jsp/footer.jsp"></c:import>