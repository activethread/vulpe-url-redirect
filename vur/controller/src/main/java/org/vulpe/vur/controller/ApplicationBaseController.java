package org.vulpe.vur.controller;

import java.io.Serializable;

import org.vulpe.controller.struts.VulpeStrutsController;
import org.vulpe.model.entity.VulpeEntity;

@SuppressWarnings( { "serial", "unchecked" })
public class ApplicationBaseController<ENTITY extends VulpeEntity<ID>, ID extends Serializable & Comparable<?>>
		extends VulpeStrutsController<ENTITY, ID> {

}
