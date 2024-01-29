package EDD;
import Grafo.City;
/**
 *
 * @author luis
 */
public class NodoG {
    private City ciudad;
    private NodoG next;
    private ListaG adyacentes;
    private Integer numeroComponentes;

    public NodoG(City ciudad, NodoG next, ListaG adyacentes, Integer numeroComponentes) {
        this.ciudad = ciudad;
        this.next = next;
        this.adyacentes = adyacentes;
        
    }

    public City getCiudad() {
        return ciudad;
    }

    public void setCiudad(City ciudad) {
        this.ciudad = ciudad;
    }

    public NodoG getNext() {
        return next;
    }

    public void setNext(NodoG next) {
        this.next = next;
    }

    public ListaG getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(ListaG adyacentes) {
        this.adyacentes = adyacentes;
    }

    public Integer getNumeroComponentes() {
        return numeroComponentes;
    }

    public void setNumeroComponentes(Integer numeroComponentes) {
        this.numeroComponentes = numeroComponentes;
    }
    
   //ìmprime los atributos del nodo 
    public void print(){
        
    }
    
}
