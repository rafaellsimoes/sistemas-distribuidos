
package Bean;
import dao.PessoaDAO;
import modelo.Pessoa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class pessoaBean implements Remote{
   @PersistenceContext(unitName = "AulaPU")
    private EntityManager em;
    
    @Override
    public Pessoa salvar(Pessoa p) throws Exception{
        PessoaDAO dao = new PessoaDAO(em);
        return dao.salvar(p);
    }
    
    @Override
    public Pessoa consultarPorId(Long id){
        PessoaDAO dao = new PessoaDAO(em);
        return dao.consultarPorId(id);
    }
    
    @Override
    public void remover (Long id){
        PessoaDAO dao = new PessoaDAO(em);
        dao.remover(id);
    } 
}
