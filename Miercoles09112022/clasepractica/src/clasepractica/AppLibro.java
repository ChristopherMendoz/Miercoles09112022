package clasepractica;

import java.util.Scanner;

public class AppLibro {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String titulo, autor,ISBN= null ;
	        int  Numero_De_Pagina;
	        
	        Libro libro1 = new Libro("Don Quijote" , "Cervantes" ,"95809363" , 1967 );
	        Libro libro2 = new Libro();
	        
	        System.out.println("Instroduzca los datos del Libro2");
	        System.out.print("Introduce titulo: ");
	        titulo = sc.nextLine();
	        System.out.print("Introduce autor: ");
	        autor = sc.nextLine();
	        System.out.println("Introduce su ISBN: ");
	        ISBN = sc.nextLine();
	        System.out.println("Introduce el numero de paginas: ");
	        Numero_De_Pagina = sc.nextInt();
	        
	        libro2.PonerTitulo(titulo);
	        libro2.PonerAutor(autor);
	        libro2.PonerISBN(ISBN);
	        libro2.PonerNumero_De_Pagina(Numero_De_Pagina);
	        
	        System.out.println("-----------------------------------------------------------");
	        System.out.println("DATOS LIBRO 1:");
	        System.out.println("Titulo: " + libro1.MostrarTitulo());
	        System.out.println("Autor: " + libro1.MostrarAutor());
	        System.out.println("ISBN: " + libro1.MostrarISBN());
	        System.out.println("Numero de Paginas: " + libro1.MostrarNumero_De_Pagina());
	        System.out.println("-----------------------------------------------------------");
	        
	        if (libro1.MostrarNumero_De_Pagina()  >  libro2.MostrarNumero_De_Pagina()) {
	        	System.out.println("AHORA VEREMOS QUE LIBRO TIENE MAS PAGINAS: ");
	        	System.out.println();
	        	System.out.println("El Libro 1 " + libro1.MostrarTitulo() + " Tiene mas paginas " + libro1.MostrarNumero_De_Pagina()+ ".");
	        }else if(libro1.MostrarNumero_De_Pagina() == libro2.MostrarNumero_De_Pagina()){
	        	System.out.println("LOS DOS LIBROS TIENEN LA MISMAS CANTIDAD DE PAGINAS");
	        	System.out.println();
				System.out.println( libro2.MostrarTitulo()+" tiene la misma cantidad de paginas que: " + libro1.MostrarTitulo());
				
			}else {
				System.out.println("AHORA VEREMOS QUE LIBRO TIENE MAS PAGINAS: ");
	        	System.out.println();
				System.out.println("El libro 2 " + libro2.MostrarTitulo() + " Tiene mas paginas " + libro2.MostrarNumero_De_Pagina() + ".");
			}
	}

}
