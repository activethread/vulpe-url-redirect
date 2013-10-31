package org.vulpe.vur.core.controller;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import org.vulpe.controller.annotations.Controller;
import org.vulpe.controller.annotations.Select;

import org.vulpe.vur.core.model.entity.Redirect;
import org.vulpe.vur.core.model.services.CoreService;
import org.vulpe.vur.controller.ApplicationBaseController;

/**
 * Controller implementation of Redirect
 */
@Component("core.RedirectController")
@SuppressWarnings({ "serial", "unchecked" })
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Controller(serviceClass = CoreService.class, select = @Select(readOnShow = true))
public class RedirectController extends ApplicationBaseController<Redirect, java.lang.Long> {

}
