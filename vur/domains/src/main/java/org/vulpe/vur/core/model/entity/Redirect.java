package org.vulpe.vur.core.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.vulpe.controller.annotations.Controller;
import org.vulpe.model.annotations.CodeGenerator;
import org.vulpe.model.entity.impl.VulpeBaseDB4OAuditEntity;
import org.vulpe.view.annotations.View;
import org.vulpe.view.annotations.View.ViewType;
import org.vulpe.view.annotations.input.VulpeText;
import org.vulpe.view.annotations.input.VulpeValidate;
import org.vulpe.view.annotations.input.VulpeValidate.VulpeValidateScope;
import org.vulpe.view.annotations.output.VulpeColumn;

@Getter
@Setter
@NoArgsConstructor
@SuppressWarnings("serial")
@CodeGenerator(controller = @Controller(), view = @View(viewType = { ViewType.MAIN, ViewType.SELECT }))
public class Redirect extends VulpeBaseDB4OAuditEntity<Long> {

	public Redirect(final String code) {
		this.code = code;
	}

	@VulpeValidate(requiredScope = VulpeValidateScope.MAIN)
	@VulpeColumn(sortable = true)
	@VulpeText(argument = true, required = true, size = 50, maxlength = 100)
	private String code;

	@VulpeValidate(requiredScope = VulpeValidateScope.MAIN)
	@VulpeColumn(sortable = true)
	@VulpeText(argument = true, required = true, size = 100, maxlength = 1000)
	private String toURL;

	@VulpeValidate(requiredScope = VulpeValidateScope.MAIN)
	@VulpeColumn(sortable = true)
	@VulpeText(argument = true, required = true, size = 100, maxlength = 1000)
	private String description;

	@VulpeColumn(sortable = true)
	private Long views;

	public void addView() {
		if (this.views == null) {
			this.views = 0L;
		}
		++this.views;
	}
}
