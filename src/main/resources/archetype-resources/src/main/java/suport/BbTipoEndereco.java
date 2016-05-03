#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.suport;

import ${package}.model.dao.HibernateDAO;
import ${package}.model.dao.InterfaceDAO;
import ${package}.model.entities.TipoEndereco;
import ${package}.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;

@ManagedBean(name="bbTipoEndereco")
@RequestScoped
public class BbTipoEndereco  implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public List<TipoEndereco> getTipoEnderecos() {
        Session session = FacesContextUtil.getRequestSession();
        InterfaceDAO<TipoEndereco> tipoEnderecoDAO = new HibernateDAO<TipoEndereco>(TipoEndereco.class, session);
        return tipoEnderecoDAO.getEntities();
    }
}