<%@page import="java.util.List"%>
<%@page import="cl.desafiolatam.model.Habitacion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="cl.desafiolatam.business.HabitacionBusiness"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// Librerias Requeridas
HabitacionBusiness habitacionb = new HabitacionBusiness();

// listado de Evento
List<Habitacion> listaHabitacion = habitacionb.getHabitacion();
%>

<!DOCTYPE html>
<html lang="es">
<%@include file="assets/html/head.jsp"%>
<body>

	<%@include file="assets/html/header.jsp"%>

	<form method="post" action="procesa.jsp">

		<!-- Section-->
		<section class="py-5">
			<div class="container px-4 px-lg-5 mt-5">

				<div class="row justify-content-center">
					<h1>
						Habitaciones Disponibles (<%=listaHabitacion.size()%>)
					</h1>
					<hr/ >
				</div>

				<div
					class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">

					<%
					for (int x = 0; x < listaHabitacion.size(); x++) {
					%>

					<div class="col mb-5">
						<div class="card h-100">
							<img class="card-img-top"
								src="<%=listaHabitacion.get(x).getImagen()%>"
								alt="<%=listaHabitacion.get(x).getNombre()%>" />
							<div class="card-body p-4">
								<div class="text-center">
									<h5 class="fw-bolder"><%=listaHabitacion.get(x).getNombre()%></h5>
									<p><%=listaHabitacion.get(x).getDescripcion()%></p>
									CL$
									<%=listaHabitacion.get(x).getPrecio()%>
								</div>
							</div>
							<input type="radio" id="html" name="idhabitacion"
								value="<%=listaHabitacion.get(x).getId()%>" checked>  
						</div>
					</div>
					<%
					}
					%>

				</div>
			</div>
		</section>

		<!--  Formulario -->
		<section>

			<div class="container px-4 px-lg-5 mt-5">

				<h1>Información de Reserva Habitación</h1>
				<hr />

				<div class="row g-3">
					<div class="col-md-6">
						<label for="inputEmail4" class="form-label">Nombre</label> <input
							type="text" class="form-control" id="nombre" name="nombre"
							value="Arturo Erasmo">
					</div>
					<div class="col-md-6">
						<label for="inputPassword4" class="form-label">Apellido</label> <input
							type="text" class="form-control" id="apellido" name="apellido"
							value="Vildal Pardo">
					</div>

					<div class="col-md-6">
						<label for="inputCity" class="form-label">Email</label> <input
							type="text" class="form-control" id="email" name="email"
							value="arturo.vidal@anfp.cl">
					</div>

					<div class="col-md-2">
						<label for="inputState" class="form-label">Medio de Pago</label> <select id="medio_pago" name="medio_pago" class="form-select">
							<option value="contado">Contado</option>
							<option value="tarjeta">Tarjeta</option>
                        	<option value="transferencia">Transferencia</option>
                        </select>
					</div>
					<div class="col-md-2">
							<label for="inputState" class="form-label">Días</label> <select id="dias" name="dias" class="form-select">
							<%
							for (int x = 0; x < 15; x++) {
							%>
							<option value="<%=x + 1%>"><%=x + 1%> día(s)
							</option>
							<%
							}
							%>

						</select>
					</div>
					<div class="col-md-2">
							<label for="inputState" class="form-label">Fecha Entrada
							</label> <select id="fecha_entrada" name="fecha_entrada" class="form-select">
							<%
								LocalDate fechaActual = LocalDate.now();
								DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");							   
							for (int x = 0; x < 15; x++) {
							    String fechaFormateada = fechaActual.format(formatter);
							%>
							<option value="<%=fechaFormateada%>"><%=fechaFormateada%>
							</option>
							<%
							fechaActual = fechaActual.plusDays(1);
							}
							%>

						</select>
					</div>

					<div class="col-12">
						<hr />
						<button type="submit" class="btn btn-primary">Enviar
							Solicitud de Compra</button>
					</div>
				</div>

			</div>

		</section>

		<br /> <br />

	</form>

	<%@include file="assets/html/footer.jsp"%>

</body>
</html>
