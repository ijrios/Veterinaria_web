/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.entitys;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import udem.edu.co.controller.Proveedores;

/**
 *
 * @author jario
 */
@Stateless
public class ProveedoresFacade extends AbstractFacade<Proveedores> {

    @PersistenceContext(unitName = "iot_store_webPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProveedoresFacade() {
        super(Proveedores.class);
    }
    
}
