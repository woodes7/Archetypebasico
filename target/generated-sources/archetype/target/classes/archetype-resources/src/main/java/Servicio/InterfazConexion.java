#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package Servicio;

import java.sql.Connection;

/**
 * Clase que realiza la conexión a la base de datos de forma parametrizada.
 * @author PabloRg 
 */
public interface InterfazConexion {
	/**
	 * Método que genera la conexión a partir de la configuración guardada en 
	 * .properties
	 * @return Conexión con la BBDD abierta.
	 * @author PabloRg 
	 */
	public Connection EstablecerConexionConBD();
	
	/**
	 * Método para cerrar la conexion con la bbdd.
	 * @param Connection
	 * @author PabloRg 
	 */
	public void CerrarConexionConBD(Connection conexion);
	
}
