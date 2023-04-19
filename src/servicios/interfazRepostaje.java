package servicios;

import java.util.List;

import entidades.repostaje;
/**
 * Interfaz que define los métodos que dan servicio a la gestión de repostajes
 * @author garfe
 *
 */
public interface interfazRepostaje {
	
	/**
	 * Actualiza la lista de repostajes con el nuevo repostaje normal
	 * @param listaAntiguaRepostaje lista actual
	 * @return lista actualizada
	 */
	public List<repostaje> addRepostajeNormal(List<repostaje> listaAntiguaRepostaje);
	
	/**
	 * Actualiza la lista de repostajes con el nuevo repostaje con factura
	 * @param listaAntiguaRepostaje lista actual
	 * @return lista actualizada
	 */
	public List<repostaje> addRepostajeFactura(List<repostaje> listaAntiguaRepostaje);
	
	/**
	 * Imprime por consola el listado de repostajes existente
	 * @param listaRepostaje lista actual
	 */
	public void listarTodosRepostajes(List<repostaje> listaRepostaje);

}