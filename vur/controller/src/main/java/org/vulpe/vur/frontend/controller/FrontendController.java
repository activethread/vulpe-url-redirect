package org.vulpe.vur.frontend.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.vulpe.commons.util.VulpeValidationUtil;
import org.vulpe.controller.annotations.Controller;
import org.vulpe.controller.commons.VulpeControllerConfig.ControllerType;
import org.vulpe.exception.VulpeApplicationException;
import org.vulpe.model.entity.impl.VulpeBaseSimpleEntity;
import org.vulpe.vur.controller.ApplicationBaseController;
import org.vulpe.vur.core.model.entity.Redirect;
import org.vulpe.vur.core.model.services.CoreService;

@SuppressWarnings({ "serial", "unchecked" })
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component("frontend.IndexController")
@Controller(type = ControllerType.FRONTEND)
public class FrontendController extends ApplicationBaseController<VulpeBaseSimpleEntity, Long> {

	@Override
	protected void frontendAfter() {
		final String code = getRequest().getParameter("CODE");
		if (StringUtils.isNotEmpty(code)) {
			try {
				final CoreService coreService = vulpe.service(CoreService.class);
				final List<Redirect> list = coreService.readRedirect(
						new Redirect(code));
				if (VulpeValidationUtil.isNotEmpty(list)) {
					final Redirect redirect = list.get(0);
					vulpe.controller().redirectTo(redirect.getToURL());
					redirect.addView();
					coreService.updateRedirect(redirect);
				}
			} catch (VulpeApplicationException e) {
				LOG.error(e.getMessage());
			}
		}
	}
}