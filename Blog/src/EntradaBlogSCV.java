/**
 * 
 * @author casti
 * @version 1.1
 * @version 27-02-2022
 */
public class EntradaBlogSCV {
		/**
		 * separador es el ccarácter que separa ENTRADA DE del
		 * nombre del autor
		 */
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		/**
		 * Constructor de la clase.
		 * @param id. Recibe el número de entrada
		 * @param autor. El nombre del autor de la entrada
		 * @param texto. Y el texto que contiene la entrada
		 * @throws IllegalArgumentException. Si el número de entrada es negativo, lanza una excepción
		 */
		public EntradaBlogSCV(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * 
		 * @return Devuelve el número de la entrada
		 */
		public int getId(){
			return this.id;
		}
		
		/**
		 * 
		 * @return devuelve el texto completo de la entrada
		 */
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 * 
		 * @return devuelve el nombre del autor de la entrada en mayúsculas
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * 
		 * @return devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
		 */
		public String devuelveAutor(){
			return this.autor;
		}
		
		/**
		 * 
		 * @param args. No tiene porqué tener argumentos.
		 */
		public static void main(String[] args) {
			EntradaBlogSCV e1=new EntradaBlogSCV (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}
}
