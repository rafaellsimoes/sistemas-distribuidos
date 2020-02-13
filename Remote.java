/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;
import modelo.Pessoa;
@javax.ejb.Remote
public interface Remote {
    public Pessoa salvar(Pessoa p) throws Exception;
    
    public Pessoa consultarPorId(Long id);
    
    public void remover (Long id);
}
