#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.suport;

import ${package}.model.dao.HibernateDAO;
import ${package}.model.dao.InterfaceDAO;
import ${package}.model.entities.Cidade;
import ${package}.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="bbCidade")
@RequestScoped
public class BbCidade  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private List<Cidade> cidades;

    public List<Cidade> getCidades() {
        InterfaceDAO<Cidade> cidadeDAO = new HibernateDAO<Cidade>(Cidade.class, FacesContextUtil.getRequestSession());
        return cidadeDAO.getEntities();
    }
}
