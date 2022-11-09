package clasepractica;

public class Libro {
	
	private String titulo;
    private String autor;
    private String ISBN;
    private int Numero_De_paginas;
    
    
    public Libro() {
    }
    
    public Libro(String titulo ,String autor, String ISBN,int Numero_De_paginas) {
    	 this.titulo = titulo;
         this.autor = autor;
         this.ISBN = ISBN;
         this.Numero_De_paginas = Numero_De_paginas;
         
    	
    	
    }
   public void MostrarDatos(){
	   System.out.println("Informacion De los Libros");
	   System.out.println("El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + Numero_De_paginas+ " páginas.");
    	
    }
    
    //Setters
    public void PonerTitulo(String titulo) {
		this.titulo = titulo;
    
    }
    public void PonerAutor(String autor) {
		this.autor = autor;
    }
    public void PonerISBN(String ISBN) {
		this.ISBN = ISBN;
    }
    public void PonerNumero_De_Pagina(int Numero_De_paginas) {
		this.Numero_De_paginas = Numero_De_paginas;
    }
    //Getters
    public String MostrarTitulo() {
		return this.titulo;
    }
    public String MostrarAutor() {
		return this.autor;
    }
    public String MostrarISBN() {
    	return this.ISBN;
    }
    public int MostrarNumero_De_Pagina() {
    	return this.Numero_De_paginas;
    }
	
	 

}
