#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.suport;

import ${package}.model.dao.HibernateDAO;
import ${package}.model.dao.InterfaceDAO;
import ${package}.model.entities.Sexo;
import ${package}.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="bbSexo")
@RequestScoped
public class BbSexo  implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public List<Sexo> getSexos(){
        InterfaceDAO<Sexo> sexoDAO = new HibernateDAO<Sexo>(Sexo.class, FacesContextUtil.getRequestSession());
        return sexoDAO.getEntities();
    }
    
}
