package org.vulpe.vur.backend.controller;

import org.vulpe.vur.controller.ApplicationBaseController;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.vulpe.controller.annotations.Controller;
import org.vulpe.controller.commons.VulpeControllerConfig.ControllerType;
import org.vulpe.model.entity.impl.VulpeBaseSimpleEntity;

@SuppressWarnings({ "serial", "unchecked" })
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component("backend.IndexController")
@Controller(type = ControllerType.BACKEND)
public class BackendController extends ApplicationBaseController<VulpeBaseSimpleEntity, Long> {

}