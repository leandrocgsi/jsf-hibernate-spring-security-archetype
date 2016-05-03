#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.suport;

import ${package}.model.dao.HibernateDAO;
import ${package}.model.dao.InterfaceDAO;
import ${package}.model.entities.Estado;
import ${package}.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="bbEstado")
@RequestScoped
public class BbEstado  implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public List<Estado> getEstados() {
        InterfaceDAO<Estado> estadoDAO = new HibernateDAO<Estado>(Estado.class, FacesContextUtil.getRequestSession());
        return estadoDAO.getEntities();
    }	
}