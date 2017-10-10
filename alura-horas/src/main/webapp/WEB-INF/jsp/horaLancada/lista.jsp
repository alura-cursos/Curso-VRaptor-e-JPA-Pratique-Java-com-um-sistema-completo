<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/header.jsp"/>

<a href="${linkTo[HoraLancadaController].form()}">Cadastrar Hora</a>
<table class="table table-hover">
    <thead>
        <tr>
            <th>Id</th>
            <th>Data</th>
            <th>Hora inicial</th>
            <th>Hora Final</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${horas}" var="h">
            <tr>
                <td>${h.id}</td>
                <td>${h.data.time}</td>
                <td>${h.horaInicial}</td>
                <td>${h.horaFinal}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<c:import url="/WEB-INF/jsp/footer.jsp"/>