<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mubsis"%>




<div class="widget-content">

	<form action="#" method="get" class="form-horizontal">

		<div class="row-fluid">
			<div class="span4 clearfix">
				<div class="control-group">
					<label class="control-label">Adı</label>

					<div class="controls">
						<input type="text" />
					</div>
				</div>

				<div class="control-group">
					<label class="control-label">Eposta</label>

					<div class="controls">
						<input type="text" />
					</div>
				</div>

				<div class="control-group">
					<label class="control-label">Model</label>

					<div class="controls">
						<select multiple>
							<option>SLK Jant 1461 8x15 4X100 ET20 73.1 BM</option>
							<option>SLK Jant 1010 8x15 4x100/108 ET20 73.1 MB</option>
							<option>Powcan Jant BK445 6.5x15 4x100 ET28 73.1 SMR</option>
							<option>SLK Jant 1460 8x15 4X100/108 ET20 73.1 BM</option>
							<option>SLK Jant 1010 8x15 4x100/108 ET20 73.1 G</option>
						</select>
					</div>
				</div>


			</div>


			<div class="span4 clearfix">
				<div class="control-group">
					<label class="control-label">Soyadı</label>

					<div class="controls">
						<input type="text" />
					</div>
				</div>


				<div class="control-group">
					<label class="control-label">Cinsiyet</label>

					<div class="controls">
						<select multiple>
							<option>Erkek</option>
							<option>Kadın</option>
						</select>
					</div>
				</div>

				<div class="control-group">
					<label class="control-label">Boyut</label>

					<div class="controls">
						<select multiple>
							<option>15</option>
							<option>16</option>
							<option>17</option>
							<option>18</option>
							<option>20</option>
							<option>21</option>
						</select>
					</div>
				</div>

			</div>


			<div class="span4 clearfix">
				<div class="control-group">
					<label class="control-label">Gsm No</label>

					<div class="controls">
						<input type="text" />
					</div>
				</div>

				<div class="control-group">
					<label class="control-label">İl</label>

					<div class="controls">
						<select multiple>
							<option>Ankara</option>
							<option>İstanbul</option>
						</select>
					</div>
				</div>


			</div>


		</div>

		<div class="form-actions">
			<span class="pull-right"> <input id="clear"
				class="btn btn-warning" type="reset" value="Temizle" /> <input
				id="clear" class="btn btn-primary" type="submit" value="Sorgula" />
			</span>
		</div>

	</form>

</div>