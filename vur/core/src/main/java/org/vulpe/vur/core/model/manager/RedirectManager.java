package org.vulpe.vur.core.model.manager;

import org.springframework.stereotype.Service;

import org.vulpe.vur.core.model.dao.RedirectDAO;
import org.vulpe.model.services.manager.impl.VulpeBaseManager;
import org.vulpe.vur.core.model.entity.Redirect;

/**
 * Manager implementation of Redirect
 */
@Service
public class RedirectManager extends VulpeBaseManager<Redirect, java.lang.Long, RedirectDAO> {

}
